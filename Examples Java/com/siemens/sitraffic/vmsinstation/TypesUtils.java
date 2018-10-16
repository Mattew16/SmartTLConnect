package com.siemens.sitraffic.vmsinstation;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Vector;

import javax.xml.namespace.QName;
import javax.xml.rpc.encoding.Deserializer;
import javax.xml.rpc.encoding.SerializerFactory;

import org.apache.axis.AxisEngine;
import org.apache.axis.Constants;
import org.apache.axis.MessageContext;
import org.apache.axis.deployment.wsdd.WSDDDeployment;
import org.apache.axis.encoding.DeserializationContext;
import org.apache.axis.encoding.DeserializerImpl;
import org.apache.axis.encoding.SerializationContext;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;
import org.apache.axis.encoding.ser.BeanSerializerFactory;
import org.apache.axis.message.SOAPHandler;
import org.apache.axis.server.AxisServer;
import org.apache.axis.utils.XMLUtils;
import org.w3c.dom.Document;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

public class TypesUtils
{
  private static BeanDeserializer beanDeserializer = null;
  private static WSDDDeployment typesDeployment = null;
  
  private static WSDDDeployment getDeployment()
  {
    if (typesDeployment == null)
    {
      try
      {
        InputStream typesDeploymentStream = VmsInstationTypes.class.getResourceAsStream("deploy.wsdd");
        Document typesDeploymentDoc = XMLUtils.newDocument(typesDeploymentStream);
        typesDeployment = new WSDDDeployment(typesDeploymentDoc.getDocumentElement());
      }
      catch(Exception e)
      {
        // this should not happen, we can not work without deploy.wsdd
        throw new RuntimeException(e);
      }
    }
    
    return typesDeployment;
  }
  
  /**
   * @return
   */
  public static Vector<?> getTypeMappings()
  {
    return getDeployment().getServices()[0].getTypeMappings();
  }
  
  /**
   * Returns xml type by java type or null
   * @param javaType
   * @return
   */
  public static QName getXmlType(Class<?> javaType)
  {
    return getDeployment().getServices()[0].getTypeMapping("").getTypeQName(javaType);
  }
  
  /**
   * Parse specified xml type from the reader
   * @param from
   * @param xmlType
   * @return
   * @throws SAXException
   * @throws IOException
   */
  public static Object parse(Reader from, final QName xmlType) throws SAXException, IOException
  {
    AxisEngine axisEngine = new AxisServer(getDeployment());
    MessageContext msgContext = new MessageContext(axisEngine);
    msgContext.setTargetService("VmsInstationTypes");
    msgContext.setEncodingStyle("");
      
    DeserializationContext context = new DeserializationContext(new InputSource(from), msgContext, "");
    context.popElementHandler();
    context.pushElementHandler(new DeserializerImpl()
    {
      private static final long serialVersionUID = 1L;

      public SOAPHandler onStartChild(String namespace, String localName, String prefix, Attributes attributes, DeserializationContext context)
        throws SAXException
      {
        Deserializer deserializer = context.getDeserializerForType(xmlType);
        if (deserializer == null || !(deserializer instanceof BeanDeserializer))
        {
          throw new IllegalArgumentException("Wrong xml type '" + xmlType + "'");
        }

        beanDeserializer = (BeanDeserializer)deserializer;
        return beanDeserializer;
      }
      
      public void startElement(java.lang.String namespace,
          java.lang.String localName,
          java.lang.String prefix,
          org.xml.sax.Attributes attributes,
          DeserializationContext context)
          {
          }

    }
    );
    
    context.parse();
    return beanDeserializer.getValue();
  }
  
  /**
   * Serialize specified value to the writer
   * @param value
   * @param to
   * @param elementName - root element name
   * @throws IOException
   */
  public static void serialize(Object value, Writer to, QName elementName) throws IOException
  {    
    AxisEngine axisEngine = new AxisServer(getDeployment());
    MessageContext msgContext = new MessageContext(axisEngine);
    msgContext.setTargetService("VmsInstationTypes");
    msgContext.setEncodingStyle("");
    
    SerializerFactory serializerFactory = TypesUtils.getDeployment().getServices()[0].getTypeMapping("").getSerializer(value.getClass());
    if (serializerFactory == null || !(serializerFactory instanceof BeanSerializerFactory))
    {
      throw new IllegalArgumentException("Wrong java type '" + value.getClass() + "'");
    }
    
    SerializationContext context = new SerializationContext(to, msgContext);
    context.setPretty(true);
    BeanSerializer beanSerializer = (BeanSerializer)serializerFactory.getSerializerAs(Constants.AXIS_SAX);
    beanSerializer.serialize(elementName, new AttributesImpl(), value, context);
  }
}
