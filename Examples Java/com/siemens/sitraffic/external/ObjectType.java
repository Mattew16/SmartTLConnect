package com.siemens.sitraffic.external;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

import javax.xml.namespace.QName;

import org.apache.log4j.Logger;
import org.xml.sax.SAXException;


/**
 * Provides type safe methods for accessing data via pm protocol.
 */
public abstract class ObjectType<T>
{
  /**
   * Logger for this class
   */
  private static final Logger LOG = Logger.getLogger(ObjectType.class);

  private final Class<T> dataTypeClass;
  private final ObjectAccess<T> access;
  
  public ObjectType(Class<T> dataTypeClass, ObjectAccess<T> access)
  {
    if (LOG.isDebugEnabled())
    {
      LOG.debug("ObjectType(dataTypeClass=" + dataTypeClass + ", access=" + access + ") - start");
    }

    this.dataTypeClass = dataTypeClass;
    this.access = access;

    if (LOG.isDebugEnabled())
    {
      LOG.debug("ObjectType(dataTypeClass=" + dataTypeClass + ", access=" + access + ") - end");
    }
  }
  
  protected Class<T> getDataTypeClass()
  {
    return dataTypeClass;
  }

  public abstract QName getDataXmlType();

  /* (non-Javadoc)
   * @see com.siemens.sitraffic.external.protocol.ExternalObjectAccess#isReadable()
   */
  public boolean isReadable()
  {
    if (LOG.isDebugEnabled())
    {
      LOG.debug("isReadable() - start");
    }

    boolean returnboolean = access instanceof ObjectReader;
    if (LOG.isDebugEnabled())
    {
      LOG.debug("isReadable() - end - return value=" + returnboolean);
    }
    return returnboolean;
  }

  /* (non-Javadoc)
   * @see com.siemens.sitraffic.external.protocol.ExternalObjectAccess#isCreateable()
   */
  public boolean isCreateable()
  {
    if (LOG.isDebugEnabled())
    {
      LOG.debug("isCreateable() - start");
    }

    boolean returnboolean = access instanceof ObjectCreate;
    if (LOG.isDebugEnabled())
    {
      LOG.debug("isCreateable() - end - return value=" + returnboolean);
    }
    return returnboolean;
  }

  /* (non-Javadoc)
   * @see com.siemens.sitraffic.external.protocol.ExternalObjectAccess#isDeleteable()
   */
  public boolean isDeleteable()
  {
    if (LOG.isDebugEnabled())
    {
      LOG.debug("isDeleteable() - start");
    }

    boolean returnboolean = access instanceof ObjectDelete;
    if (LOG.isDebugEnabled())
    {
      LOG.debug("isDeleteable() - end - return value=" + returnboolean);
    }
    return returnboolean;
  }

  /* (non-Javadoc)
   * @see com.siemens.sitraffic.external.protocol.ExternalObjectAccess#isWriteable()
   */
  public boolean isWriteable()
  {
    if (LOG.isDebugEnabled())
    {
      LOG.debug("isWriteable() - start");
    }

    boolean returnboolean = access instanceof ObjectWrite;
    if (LOG.isDebugEnabled())
    {
      LOG.debug("isWriteable() - end - return value=" + returnboolean);
    }
    return returnboolean;
  }
  
  public void startObjectReading(ObjectOutput<Object> outputIf)
  {
    if (LOG.isDebugEnabled())
    {
      LOG.debug("startObjectReading(outputIf=" + outputIf + ") - start");
    }

    ((ObjectReader<T>)access).startObjectReading(outputIf);

    if (LOG.isDebugEnabled())
    {
      LOG.debug("startObjectReading(outputIf=" + outputIf + ") - end");
    }
  }
  
  public void interruptObjectReading(ObjectOutput<Object> outputIf)
  {
    if (LOG.isDebugEnabled())
    {
      LOG.debug("interruptObjectReading() - start");
    }

    ((ObjectReader<T>)access).interruptObjectReading(outputIf);

    if (LOG.isDebugEnabled())
    {
      LOG.debug("interruptObjectReading() - end");
    }
  }

  /* (non-Javadoc)
   * @see com.siemens.sitraffic.external.protocol1.ExternalObjectInput#put(java.util.Set, com.siemens.sitraffic.external.protocol.IdentifierType, java.lang.Object)
   */
  public void writeObject(ObjectIdentifier objectIdentifier, Object data, boolean creatingAllowed) throws Exception
  {
    if (LOG.isDebugEnabled())
    {
      LOG.debug("writeObject(objectIdentifier=" + objectIdentifier + ", data=" + data + ", creatingAllowed=" + creatingAllowed
          + ") - start");
    }
 
    ((ObjectWrite<T>)access).writeObject(objectIdentifier, dataTypeClass.cast(data), creatingAllowed);

    if (LOG.isDebugEnabled())
    {
      LOG.debug("writeObject(objectIdentifier=" + objectIdentifier + ", data=" + data + ", creatingAllowed=" + creatingAllowed
          + ") - end");
    }
  }

  /* (non-Javadoc)
   * @see com.siemens.sitraffic.external.protocol1.ExternalObjectInput#delete(java.util.Set, com.siemens.sitraffic.external.protocol.IdentifierType)
   */
  public void deleteObject(ObjectIdentifier objectIdentifier) throws Exception
  {
    if (LOG.isDebugEnabled())
    {
      LOG.debug("deleteObject(objectIdentifier=" + objectIdentifier + ") - start");
    }

    ((ObjectDelete<T>)access).deleteObject(objectIdentifier);

    if (LOG.isDebugEnabled())
    {
      LOG.debug("deleteObject(objectIdentifier=" + objectIdentifier + ") - end");
    }
  }
  
  public void close()
  {
    if (LOG.isDebugEnabled())
    {
      LOG.debug("close() - start");
    }

    access.close();

    if (LOG.isDebugEnabled())
    {
      LOG.debug("close() - end");
    }
  }
  
  public abstract T parse(Reader from) throws SAXException, IOException;
  
  public abstract void serialize(T data, Writer to, QName elementName) throws IOException;
}
