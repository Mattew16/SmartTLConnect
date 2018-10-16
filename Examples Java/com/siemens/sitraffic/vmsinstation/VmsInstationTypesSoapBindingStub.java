/**
 * VmsInstationTypesSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.vmsinstation;

public class VmsInstationTypesSoapBindingStub extends org.apache.axis.client.Stub implements com.siemens.sitraffic.vmsinstation.VmsInstationTypes {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[1];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("types");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "types"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"), java.lang.Object.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

    }

    public VmsInstationTypesSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public VmsInstationTypesSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public VmsInstationTypesSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", ">>>>InfoPoint_Cmd>SwitchCmd>ContentDefinition>Image>Text");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_CmdSwitchCmdContentDefinitionImageText.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", ">>>>LocationType>Net>Net>Attributsaenderung>Typ");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.LocationTypeNetNetAttributsaenderungTyp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", ">>>InfoPoint_Cmd>SwitchCmd>ContentDefinition>Image");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_CmdSwitchCmdContentDefinitionImage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", ">>>InfoPoint_Data>Data>DisplayUnit>LaneImportance");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_DataDataDisplayUnitLaneImportance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", ">>>InfoPoint_Data>Data>DisplayUnit>Mode");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_DataDataDisplayUnitMode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", ">>>InfoPoint_Data>Data>DisplayUnit>ModeLighting");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_DataDataDisplayUnitModeLighting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", ">>>InfoPoint_Data>Data>DisplayUnit>StateLighting");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_DataDataDisplayUnitStateLighting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", ">>>InfoPoint_Data>Data>DisplayUnit>Type");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_DataDataDisplayUnitType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", ">>>LocationType>Net>Net>Attributsaenderung");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.LocationTypeNetNetAttributsaenderung.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", ">>InfoPoint_Cmd>SwitchCmd>ContentDefinition");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_CmdSwitchCmdContentDefinition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", ">>InfoPoint_Data>Data>DetailedStates");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_DataDataDetailedStates.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", ">>InfoPoint_Data>Data>DisplayUnit");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_DataDataDisplayUnit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", ">>InfoPoint_Data>Data>SwitchReason");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", ">>InfoPoint_Descr>Descr>DisplayDescription");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_DescrDescrDisplayDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", ">>LocationType>Geom>CO");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.LocationTypeGeomCO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", ">>LocationType>Geom>System");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.LocationTypeGeomSystem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", ">>LocationType>Net>Net");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.LocationTypeNetNet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", ">>LocationType>Net>Netref");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.LocationTypeNetNetref.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", ">>LocationType>Roads>ctrl");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.LocationTypeRoadsCtrl.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", ">>PICTUREType>RENDERED>imgtype");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.PICTURETypeRENDEREDImgtype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", ">InfoPoint_Cmd>SwitchCmd");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_CmdSwitchCmd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", ">InfoPoint_Data>Data");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_DataData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", ">InfoPoint_Descr>Descr");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_DescrDescr.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", ">light_type>BRIGHTNESS");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.UnsignedByte.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", ">light_type>SWITCH");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.Light_typeSWITCH.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", ">LocationType>Geom");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.LocationTypeGeom.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", ">LocationType>Net");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.LocationTypeNet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", ">LocationType>Roads");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.LocationTypeRoads.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", ">MULTILINEPOSITIONType>SYMBOL");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.MULTILINEPOSITIONTypeSYMBOL.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", ">PICTUREType>RENDERED");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.PICTURETypeRENDERED.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", ">PROGRAM");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.PROGRAM.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", ">State");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.State.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", ">Time");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.Time.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", ">TrafficControlSignal>Code");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.TrafficControlSignalCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", ">TrafficControlSignal>ContentType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.TrafficControlSignalContentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", ">TrafficControlSignal>DisplayMode");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.TrafficControlSignalDisplayMode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", "AREAType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.AREAType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", "DescrType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.DescrType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", "effect_enum");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.Effect_enum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", "effect_type");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.Effect_type.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", "figure_enum");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.Figure_enum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", "figure_type");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.Figure_type.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", "filled_type");
            cachedSerQNames.add(qName);
            cls = boolean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", "font_style_enum");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.Font_style_enum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", "function_enum");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.Function_enum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", "function_type");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.Function_type.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", "h_alignment_enum");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.H_alignment_enum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", "InfoPoint_Cmd");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_Cmd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", "InfoPoint_Data");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_Data.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", "InfoPoint_Descr");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_Descr.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", "integer_type");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", "light_type");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.Light_type.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", "LocationType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.LocationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", "MATRIXType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.MATRIXType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", "MULTILINEPOSITIONType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.MULTILINEPOSITIONType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", "MULTILINEType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.MULTILINEType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", "ParkingInfo");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.ParkingInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", "PICTUREType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.PICTUREType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", "PRISMType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.PRISMType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", "SEGMENTPOSITIONType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.SEGMENTPOSITIONType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", "SEGMENTType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.SEGMENTType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", "text_type");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.Text_type.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", "TrafficControlSignal");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.TrafficControlSignal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", "TrafficInfo");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.TrafficInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", "v_alignment_enum");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.vmsinstation.infopoint.V_alignment_enum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public void types(javax.xml.rpc.holders.ObjectHolder types) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("VmsInstationTypes#types");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/infopoint", "types"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {types.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                types.value = (java.lang.Object) _output.get(new javax.xml.namespace.QName("", "types"));
            } catch (java.lang.Exception _exception) {
                types.value = (java.lang.Object) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "types")), java.lang.Object.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
