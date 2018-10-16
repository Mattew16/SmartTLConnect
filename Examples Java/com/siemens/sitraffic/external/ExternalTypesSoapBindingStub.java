/**
 * ExternalTypesSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external;

public class ExternalTypesSoapBindingStub extends org.apache.axis.client.Stub implements com.siemens.sitraffic.external.ExternalTypes {
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

    public ExternalTypesSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ExternalTypesSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ExternalTypesSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
        addBindings0();
        addBindings1();
        addBindings2();
        addBindings3();
    }

    private void addBindings0() {
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
            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/action", ">>signControlEffectType>turnGreenTime>greenTime");
            cachedSerQNames.add(qName);
            cls = float.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/action", ">actionContentType>actiontype");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.action.ActionContentTypeActiontype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/action", ">actionType>influencedVehicleType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.action.ActionTypeInfluencedVehicleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/action", ">diversionEffectType>adherence");
            cachedSerQNames.add(qName);
            cls = float.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/action", ">linkControlEffectType>restrictiontype");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.action.LinkControlEffectTypeRestrictiontype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/action", ">recommendationType>kind");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.action.RecommendationTypeKind.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/action", ">signControlEffectType>turnGreenTime");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.action.SignControlEffectTypeTurnGreenTime.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/action", "actionContentType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.action.ActionContentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/action", "actionType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.action.ActionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/action", "diversionEffectType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.action.DiversionEffectType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/action", "linkControlEffectType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.action.LinkControlEffectType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/action", "linkControlType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.action.LinkControlType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/action", "linkLocationsType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.action.LinkLocationsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/action", "linkLocationType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.action.LinkLocationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/action", "recommendationType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.action.RecommendationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/action", "signControlEffectType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.action.SignControlEffectType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/action", "signControlType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.action.SignControlType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/action", "validityType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.action.ValidityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/cctv", ">Camera_InfoType>State");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.cctv.Camera_InfoTypeState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/cctv", ">CCTV");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.cctv.CCTV.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/cctv", ">VideoPort_InfoType>State");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.cctv.VideoPort_InfoTypeState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/cctv", "Camera_CmdType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.cctv.Camera_CmdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/cctv", "Camera_InfoType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.cctv.Camera_InfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/cctv", "CCTV_ImageType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.cctv.CCTV_ImageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/cctv", "VideoPort_CmdType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.cctv.VideoPort_CmdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/cctv", "VideoPort_InfoType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.cctv.VideoPort_InfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/control", ">Control");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.control.Control.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/control", "ControlDescription");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.control.ControlDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/control", "ControlValue");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.control.ControlValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/control", "SituationValueType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.control.SituationValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/environmentsensor", ">>>>LocationType>Net>Net>Attributsaenderung>Typ");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.environmentsensor.LocationTypeNetNetAttributsaenderungTyp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/environmentsensor", ">>>LocationType>Net>Net>Attributsaenderung");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.environmentsensor.LocationTypeNetNetAttributsaenderung.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/environmentsensor", ">>>WeatherType>Temperatur>Depth>depthType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.environmentsensor.WeatherTypeTemperaturDepthDepthType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/environmentsensor", ">>DataType>Environment>Forecast");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.environmentsensor.DataTypeEnvironmentForecast.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/environmentsensor", ">>DataType>Weather>Forecast");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.environmentsensor.DataTypeWeatherForecast.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/environmentsensor", ">>LocationType>Geom>CO");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.environmentsensor.LocationTypeGeomCO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/environmentsensor", ">>LocationType>Geom>System");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.environmentsensor.LocationTypeGeomSystem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/environmentsensor", ">>LocationType>Net>Net");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.environmentsensor.LocationTypeNetNet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/environmentsensor", ">>LocationType>Net>Netref");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.environmentsensor.LocationTypeNetNetref.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/environmentsensor", ">>LocationType>Roads>ctrl");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.environmentsensor.LocationTypeRoadsCtrl.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/environmentsensor", ">>WeatherType>Temperatur>Air");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.environmentsensor.WeatherTypeTemperaturAir.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/environmentsensor", ">>WeatherType>Temperatur>Depth");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.environmentsensor.WeatherTypeTemperaturDepth.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/environmentsensor", ">>WeatherType>Wind>Speed");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.environmentsensor.WeatherTypeWindSpeed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/environmentsensor", ">DataType>Environment");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.environmentsensor.DataTypeEnvironment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/environmentsensor", ">DataType>Weather");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.environmentsensor.DataTypeWeather.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/environmentsensor", ">EnvironmentSensor");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.environmentsensor.EnvironmentSensor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/environmentsensor", ">LocationType>Geom");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.environmentsensor.LocationTypeGeom.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/environmentsensor", ">LocationType>Net");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.environmentsensor.LocationTypeNet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/environmentsensor", ">LocationType>Roads");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.environmentsensor.LocationTypeRoads.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/environmentsensor", ">State");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.environmentsensor.State.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/environmentsensor", ">Time");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.environmentsensor.Time.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/environmentsensor", ">WeatherType>Humidity");
            cachedSerQNames.add(qName);
            cls = int.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/environmentsensor", ">WeatherType>Precipitation");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.environmentsensor.WeatherTypePrecipitation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/environmentsensor", ">WeatherType>Salt");
            cachedSerQNames.add(qName);
            cls = int.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/environmentsensor", ">WeatherType>StateOfLane");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.environmentsensor.WeatherTypeStateOfLane.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/environmentsensor", ">WeatherType>Temperatur");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.environmentsensor.WeatherTypeTemperatur.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/environmentsensor", ">WeatherType>Wind");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.environmentsensor.WeatherTypeWind.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/environmentsensor", "DataType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.environmentsensor.DataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/environmentsensor", "DescrType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.environmentsensor.DescrType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/environmentsensor", "EnvironmentType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.environmentsensor.EnvironmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/environmentsensor", "LocationType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.environmentsensor.LocationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/environmentsensor", "WeatherType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.environmentsensor.WeatherType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/evr", ">CommandType>Command");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.evr.CommandTypeCommand.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/evr", ">DescriptionType>Route_Coordinates");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.evr.DescriptionTypeRoute_Coordinates.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/evr", ">DescriptionType>Vehicle_Group");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.evr.DescriptionTypeVehicle_Group.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/evr", ">evr");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.evr.Evr.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/evr", ">StatusType>State");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.evr.StatusTypeState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/evr", "CommandType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.evr.CommandType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/evr", "coordType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.evr.CoordType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/evr", "DataType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.evr.DataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/evr", "DescriptionType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.evr.DescriptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/evr", "StatusType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.evr.StatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/evr", "vehiclePositionType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.evr.VehiclePositionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/global", ">>locationType>roaddescription>direction");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.global.LocationTypeRoaddescriptionDirection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/global", ">>restrictionType>capacity_reduction>kind");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.global.RestrictionTypeCapacity_reductionKind.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/global", ">global");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.global.Global.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/global", ">locationType>co_description");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.global.LocationTypeCo_description.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/global", ">locationType>netref");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.global.LocationTypeNetref.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/global", ">locationType>reference");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.global.LocationTypeReference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/global", ">locationType>roaddescription");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.global.LocationTypeRoaddescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/global", ">restrictionType>capacity_reduction");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.global.RestrictionTypeCapacity_reduction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/global", ">restrictionType>inLanes");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.global.RestrictionTypeInLanes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/global", ">ServiceExtension>device");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.global.ServiceExtensionDevice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/global", "coType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.global.CoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/global", "Description");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.global.Description.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/global", "locationType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.global.LocationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/global", "restrictionType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.global.RestrictionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/global", "ServiceExtension");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.global.ServiceExtension.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/global", "State");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.global.State.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/global", "Timeline");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.global.Timeline.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/har", ">HAR");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.har.HAR.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/har", ">HarCmd>Playlist");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.har.HarCmdPlaylist.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/har", ">HarMsgList>HarMsg");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.har.HarMsgListHarMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/har", ">HarStatus>Playlist");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.har.HarStatusPlaylist.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/har", "HarCmd");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.har.HarCmd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/har", "HarMsgList");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.har.HarMsgList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/har", "HarStatus");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.har.HarStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", ">>>>InfoPoint_Cmd>SwitchCmd>ContentDefinition>Image>Text");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.infopoint.InfoPoint_CmdSwitchCmdContentDefinitionImageText.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", ">>>InfoPoint_Cmd>SwitchCmd>ContentDefinition>Image");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.infopoint.InfoPoint_CmdSwitchCmdContentDefinitionImage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", ">>InfoPoint_Cmd>SwitchCmd>ContentDefinition");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.infopoint.InfoPoint_CmdSwitchCmdContentDefinition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
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
            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", ">>PICTUREType>RENDERED>imgtype");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.infopoint.PICTURETypeRENDEREDImgtype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", ">DisplayUnitType>LaneImportance");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.infopoint.DisplayUnitTypeLaneImportance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", ">DisplayUnitType>Mode");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.infopoint.DisplayUnitTypeMode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", ">DisplayUnitType>ModeLighting");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.infopoint.DisplayUnitTypeModeLighting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", ">DisplayUnitType>State");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.infopoint.DisplayUnitTypeState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", ">DisplayUnitType>StateLighting");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.infopoint.DisplayUnitTypeStateLighting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", ">DisplayUnitType>Type");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.infopoint.DisplayUnitTypeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", ">InfoPoint");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.infopoint.InfoPoint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", ">InfoPoint_Cmd>SwitchCmd");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.infopoint.InfoPoint_CmdSwitchCmd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", ">InfoPoint_Data>DetailedStates");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.infopoint.InfoPoint_DataDetailedStates.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", ">InfoPoint_Data>SwitchReason");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", ">light_type>BRIGHTNESS");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.UnsignedByte.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", ">light_type>SWITCH");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.infopoint.Light_typeSWITCH.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", ">MULTILINEPOSITIONType>SYMBOL");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.infopoint.MULTILINEPOSITIONTypeSYMBOL.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", ">PICTUREType>RENDERED");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.infopoint.PICTURETypeRENDERED.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", ">PROGRAM");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.infopoint.PROGRAM.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", ">TrafficControlSignal>Code");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.infopoint.TrafficControlSignalCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", ">TrafficControlSignal>ContentType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.infopoint.TrafficControlSignalContentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", ">TrafficControlSignal>DisplayMode");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.infopoint.TrafficControlSignalDisplayMode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", "AREAType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.infopoint.AREAType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", "DetailedStateType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.infopoint.DetailedStateType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", "DisplayUnitType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.infopoint.DisplayUnitType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", "effect_enum");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.infopoint.Effect_enum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", "effect_type");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.infopoint.Effect_type.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", "figure_enum");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.infopoint.Figure_enum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", "figure_type");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.infopoint.Figure_type.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", "filled_type");
            cachedSerQNames.add(qName);
            cls = boolean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", "font_style_enum");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.infopoint.Font_style_enum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", "function_enum");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.infopoint.Function_enum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", "function_type");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.infopoint.Function_type.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", "h_alignment_enum");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.infopoint.H_alignment_enum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", "InfoPoint_Cmd");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.infopoint.InfoPoint_Cmd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", "InfoPoint_Data");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.infopoint.InfoPoint_Data.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", "integer_type");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", "light_type");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.infopoint.Light_type.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", "MATRIXType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.infopoint.MATRIXType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", "MULTILINEPOSITIONType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.infopoint.MULTILINEPOSITIONType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", "MULTILINEType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.infopoint.MULTILINEType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", "ParkingInfo");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.infopoint.ParkingInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", "PICTUREType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.infopoint.PICTUREType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", "PRISMType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.infopoint.PRISMType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", "SEGMENTPOSITIONType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.infopoint.SEGMENTPOSITIONType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", "SEGMENTType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.infopoint.SEGMENTType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", "text_type");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.infopoint.Text_type.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", "TrafficControlSignal");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.infopoint.TrafficControlSignal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", "TrafficInfo");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.infopoint.TrafficInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/infopoint", "v_alignment_enum");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.infopoint.V_alignment_enum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersection_sg_data", ">SGTimesType>sg_values");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.intersection_sg_data.SGTimesTypeSg_values.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersection_sg_data", ">valuesType>sg_id");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersection_sg_data", "Id");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.intersection_sg_data.Id.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersection_sg_data", "SGTimesType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.intersection_sg_data.SGTimesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersection_sg_data", "State");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.intersection_sg_data.State.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersection_sg_data", "stateType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.intersection_sg_data.StateType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersection_sg_data", "timelineType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.intersection_sg_data.TimelineType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersection_sg_data", "tsType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.intersection_sg_data.TsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersection_sg_data", "valuesType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.intersection_sg_data.ValuesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersectionStates_andCommands", ">EmGet>echo");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.intersectionStates_andCommands.EmGetEcho.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersectionStates_andCommands", ">EmGet>respond");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.intersectionStates_andCommands.EmGetRespond.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersectionStates_andCommands", ">EmPut>cmdLine");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.intersectionStates_andCommands.EmPutCmdLine.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersectionStates_andCommands", ">featuresType>numberOfSubIntersections");
            cachedSerQNames.add(qName);
            cls = int.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersectionStates_andCommands", ">featuresType>ProjSpecificMod");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.intersectionStates_andCommands.FeaturesTypeProjSpecificMod.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersectionStates_andCommands", ">intersectionStates_andCommands");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.intersectionStates_andCommands.IntersectionStates_andCommands.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersectionStates_andCommands", ">projectSpecificOnOffType>parameter");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.intersectionStates_andCommands.ProjectSpecificOnOffTypeParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersectionStates_andCommands", ">projSpecificModificationType>number");
            cachedSerQNames.add(qName);
            cls = int.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersectionStates_andCommands", ">projSpecificModificationType>parameter");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.intersectionStates_andCommands.ProjSpecificModificationTypeParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersectionStates_andCommands", ">signalPlansType>number");
            cachedSerQNames.add(qName);
            cls = int.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersectionStates_andCommands", ">signalPlansType>routeNumber");
            cachedSerQNames.add(qName);
            cls = int.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersectionStates_andCommands", ">signalProgramType>spNr");
            cachedSerQNames.add(qName);
            cls = short.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersectionStates_andCommands", ">spType>spNr");
            cachedSerQNames.add(qName);
            cls = short.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersectionStates_andCommands", ">subIntersectionType>number");
            cachedSerQNames.add(qName);
            cls = int.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersectionStates_andCommands", "baseIsOnOffEnum");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.intersectionStates_andCommands.BaseIsOnOffEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersectionStates_andCommands", "baseOnOffEnum");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.intersectionStates_andCommands.BaseOnOffEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersectionStates_andCommands", "baseOnOffType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.intersectionStates_andCommands.BaseOnOffType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersectionStates_andCommands", "ControlMethodParameterType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.intersectionStates_andCommands.ControlMethodParameterType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersectionStates_andCommands", "controlModeEnum");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.intersectionStates_andCommands.ControlModeEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersectionStates_andCommands", "controlModeType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.intersectionStates_andCommands.ControlModeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersectionStates_andCommands", "EmGet");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.intersectionStates_andCommands.EmGet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersectionStates_andCommands", "EmPut");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.intersectionStates_andCommands.EmPut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersectionStates_andCommands", "faultStatusType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.intersectionStates_andCommands.FaultStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersectionStates_andCommands", "featuresType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.intersectionStates_andCommands.FeaturesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersectionStates_andCommands", "intersectionOnOffType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.intersectionStates_andCommands.IntersectionOnOffType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersectionStates_andCommands", "IntersectionStatus");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.intersectionStates_andCommands.IntersectionStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersectionStates_andCommands", "IsCommandType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.intersectionStates_andCommands.IsCommandType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersectionStates_andCommands", "IsFeatureType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.intersectionStates_andCommands.IsFeatureType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersectionStates_andCommands", "isOnOffEnum");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.intersectionStates_andCommands.IsOnOffEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersectionStates_andCommands", "isOnOffType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.intersectionStates_andCommands.IsOnOffType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersectionStates_andCommands", "itOnOffType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.intersectionStates_andCommands.ItOnOffType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersectionStates_andCommands", "PredefCommand");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.intersectionStates_andCommands.PredefCommand.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersectionStates_andCommands", "projectSpecificOnOffType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.intersectionStates_andCommands.ProjectSpecificOnOffType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersectionStates_andCommands", "projSpecificModificationType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.intersectionStates_andCommands.ProjSpecificModificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersectionStates_andCommands", "ptOnOffType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.intersectionStates_andCommands.PtOnOffType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersectionStates_andCommands", "signalPlansType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.intersectionStates_andCommands.SignalPlansType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersectionStates_andCommands", "signalProgramType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.intersectionStates_andCommands.SignalProgramType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersectionStates_andCommands", "spType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.intersectionStates_andCommands.SpType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersectionStates_andCommands", "stateIsOnOffEnum");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.intersectionStates_andCommands.StateIsOnOffEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersectionStates_andCommands", "stateType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.intersectionStates_andCommands.StateType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersectionStates_andCommands", "subIntersectionOnOffType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.intersectionStates_andCommands.SubIntersectionOnOffType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersectionStates_andCommands", "subIntersectionType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.intersectionStates_andCommands.SubIntersectionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersectionStates_andCommands", "taOnOffType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.intersectionStates_andCommands.TaOnOffType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/intersectionStates_andCommands", "timelineType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.intersectionStates_andCommands.TimelineType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings2() {
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
            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/link_cong_data", "Id");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.link_cong_data.Id.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/link_cong_data", "LinkCongType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.link_cong_data.LinkCongType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/link_cong_data", "State");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.link_cong_data.State.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/link_cong_data", "stateType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.link_cong_data.StateType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/link_cong_data", "timelineType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.link_cong_data.TimelineType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/link_cong_data", "tsType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.link_cong_data.TsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/link_cong_data", "valuesType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.link_cong_data.ValuesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/operatingmessages", ">>MessageType>Param>ParamId");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.operatingmessages.MessageTypeParamParamId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/operatingmessages", ">>MessageType>State>matchcode");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.operatingmessages.MessageTypeStateMatchcode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/operatingmessages", ">MessageType>Param");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.operatingmessages.MessageTypeParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/operatingmessages", ">MessageType>State");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.operatingmessages.MessageTypeState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/operatingmessages", ">OperatingMessages");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.operatingmessages.OperatingMessages.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/operatingmessages", "MessageType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.operatingmessages.MessageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/operatingmessages", "MessageTypeExt");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.operatingmessages.MessageTypeExt.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/operatingmessages", "OperatingMessage");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.operatingmessages.OperatingMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/parking", ">OutletType>Socket");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.parking.OutletTypeSocket.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/parking", ">Parking");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.parking.Parking.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/parking", ">ParkingData>DetailedStates");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.parking.ParkingDataDetailedStates.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/parking", ">ParkingData>OpeningState");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.parking.ParkingDataOpeningState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/parking", ">ParkingValue>Capacity");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.parking.ParkingValueCapacity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/parking", ">ParkingValue>DriveIn");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.parking.ParkingValueDriveIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/parking", ">ParkingValue>DriveOut");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.parking.ParkingValueDriveOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/parking", ">ParkingValue>Trend");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.parking.ParkingValueTrend.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/parking", ">ParkingValue>Type");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.parking.ParkingValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/parking", "DetailedStateType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.parking.DetailedStateType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/parking", "EposDataType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.parking.EposDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/parking", "OutletType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.parking.OutletType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/parking", "ParkingData");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.parking.ParkingData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/parking", "ParkingValue");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.parking.ParkingValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/parking", "PdmDataType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.parking.PdmDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/parking", "PdmDescriptionType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.parking.PdmDescriptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/pt", ">LinePerLinkType>lineIdentification");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.pt.LinePerLinkTypeLineIdentification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/pt", ">PT");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.pt.PT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/pt", ">State");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.pt.State.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/pt", ">valuesType>ptType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.pt.ValuesTypePtType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/pt", "LinePerLinkType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.pt.LinePerLinkType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/pt", "LinkType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.pt.LinkType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/pt", "stateType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.pt.StateType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/pt", "timelineType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.pt.TimelineType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/pt", "tsType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.pt.TsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/pt", "valuesType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.pt.ValuesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/simulation", "actionsCompletedType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.simulation.ActionsCompletedType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/simulation", "measurementsCompletedType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.simulation.MeasurementsCompletedType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/simulation", "simControlType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.simulation.SimControlType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/subsystem", ">Subsystem");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.subsystem.Subsystem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/subsystem", "FaultStatusType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.subsystem.FaultStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/subsystem", "SubsystemDataType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.subsystem.SubsystemDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/subsystem", "TimelineType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.subsystem.TimelineType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/subsystem", "ValueType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.subsystem.ValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficdata", ">calculatedValueType>id");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficdata", ">currentLinkType>currentLinkValue");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficdata.CurrentLinkTypeCurrentLinkValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficdata", ">currentValueType>alarm");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficdata.CurrentValueTypeAlarm.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficdata", ">currentValueType>id");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficdata", ">currentValueType>quality");
            cachedSerQNames.add(qName);
            cls = int.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficdata", ">losValueType>quality");
            cachedSerQNames.add(qName);
            cls = int.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficdata", ">predictionLinkType>predictionLinkValue");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficdata.PredictionLinkTypePredictionLinkValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficdata", ">trafficData");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficdata.TrafficData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficdata", ">traveltimeValueType>quality");
            cachedSerQNames.add(qName);
            cls = int.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficdata", "accumulatedValueType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficdata.AccumulatedValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficdata", "calculatedValueType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficdata.CalculatedValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficdata", "commonLinkType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficdata.CommonLinkType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficdata", "currentLinkType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficdata.CurrentLinkType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficdata", "currentValueType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficdata.CurrentValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficdata", "detectorGroupType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficdata.DetectorGroupType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficdata", "detectorStateType");
            cachedSerQNames.add(qName);
            cls = int.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficdata", "detectorType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficdata.DetectorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficdata", "linkType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficdata.LinkType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficdata", "linkValueType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficdata.LinkValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficdata", "losType");
            cachedSerQNames.add(qName);
            cls = int.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficdata", "losValueType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficdata.LosValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficdata", "predictionLinkType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficdata.PredictionLinkType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficdata", "predictionVehicleType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficdata.PredictionVehicleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficdata", "timelineType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficdata.TimelineType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficdata", "trafficAreaType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficdata.TrafficAreaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficdata", "trafficSectionType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficdata.TrafficSectionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficdata", "trafficSubAreaType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficdata.TrafficSubAreaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficdata", "trafficSubSectionType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficdata.TrafficSubSectionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficdata", "traveltimeValueType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficdata.TraveltimeValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficdata", "valueType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficdata.ValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficdata", "vehicleType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficdata.VehicleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficmessages", ">>adminType>publicdisplay>kind");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficmessages.AdminTypePublicdisplayKind.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficmessages", ">>locationType>co_description>co");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficmessages.LocationTypeCo_descriptionCo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficmessages", ">>locationType>roaddescription>direction");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficmessages.LocationTypeRoaddescriptionDirection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficmessages", ">>restrictionType>capacity_reduction>kind");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficmessages.RestrictionTypeCapacity_reductionKind.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficmessages", ">adminType>publicdisplay");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficmessages.AdminTypePublicdisplay.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficmessages", ">adminType>subsystem");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficmessages", ">depending_messagesType>detectiontype");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficmessages.Depending_messagesTypeDetectiontype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficmessages", ">depending_messagesType>messagetype");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficmessages.Depending_messagesTypeMessagetype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficmessages", ">locationType>co_description");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficmessages.LocationTypeCo_description.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficmessages", ">locationType>netref");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficmessages.LocationTypeNetref.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficmessages", ">locationType>reference");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficmessages.LocationTypeReference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficmessages", ">locationType>roaddescription");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficmessages.LocationTypeRoaddescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficmessages", ">restrictionType>capacity_reduction");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficmessages.RestrictionTypeCapacity_reduction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficmessages", ">restrictionType>inLanes");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficmessages.RestrictionTypeInLanes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficmessages", ">TMType>admin");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficmessages.TMTypeAdmin.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficmessages", ">TMType>comment");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficmessages.TMTypeComment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficmessages", ">TMType>state");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficmessages.TMTypeState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficmessages", ">TMTypeEx>AddInfo");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficmessages.TMTypeExAddInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficmessages", ">TrafficMessages");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficmessages.TrafficMessages.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficmessages", ">validityType>kind");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficmessages.ValidityTypeKind.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }
    private void addBindings3() {
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
            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficmessages", "adminType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficmessages.AdminType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficmessages", "depending_messagesType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficmessages.Depending_messagesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficmessages", "locationType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficmessages.LocationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficmessages", "restrictionType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficmessages.RestrictionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficmessages", "TMType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficmessages.TMType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficmessages", "TMTypeEx");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficmessages.TMTypeEx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/trafficmessages", "validityType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.trafficmessages.ValidityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/triggerarea", ">>>triggerAreaRelatedInfoType>Info>description>text");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoTypeInfoDescriptionText.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/triggerarea", ">>triggerAreaDescriptionType>filter>speedRange");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.triggerarea.TriggerAreaDescriptionTypeFilterSpeedRange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/triggerarea", ">>triggerAreaRelatedInfoType>Info>bitmap");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoTypeInfoBitmap.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/triggerarea", ">>triggerAreaRelatedInfoType>Info>description");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoTypeInfoDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/triggerarea", ">>triggerAreaRelatedInfoType>Info>objectRef");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoTypeInfoObjectRef.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/triggerarea", ">>triggerAreaRelatedInfoType>Info>validity");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoTypeInfoValidity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/triggerarea", ">TriggerArea");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.triggerarea.TriggerArea.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/triggerarea", ">triggerAreaDescriptionType>filter");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.triggerarea.TriggerAreaDescriptionTypeFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/triggerarea", ">triggerAreaRelatedInfoType>Info");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoTypeInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/triggerarea", "triggerAreaDescriptionType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.triggerarea.TriggerAreaDescriptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external/triggerarea", "triggerAreaRelatedInfoType");
            cachedSerQNames.add(qName);
            cls = com.siemens.sitraffic.external.triggerarea.TriggerAreaRelatedInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

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
        _call.setSOAPActionURI("ExternalTypes#types");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://sitraffic.siemens.com/ws/external", "types"));

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
