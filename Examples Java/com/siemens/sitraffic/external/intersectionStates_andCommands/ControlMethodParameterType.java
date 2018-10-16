/**
 * ControlMethodParameterType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.intersectionStates_andCommands;

public class ControlMethodParameterType  implements java.io.Serializable {
    /* Object id (lsa shortname) */
    private java.lang.String id;

    /* path for ApWertName in protocoll OCIT-O, e.g. VS-PLUS.NETZSTEUERUNG */
    private java.lang.String path;

    /* name of control method in the in the controller, e.g. VS-PLUS */
    private java.lang.String methodname;

    /* name of the interface in the controller, e.g. NETZSTEUERUNG */
    private java.lang.String interfacename;

    /* data content of the OCIT-O datatype APWertBlock (1:508) */
    private byte[] data;

    public ControlMethodParameterType() {
    }

    public ControlMethodParameterType(
           java.lang.String id,
           java.lang.String path,
           java.lang.String methodname,
           java.lang.String interfacename,
           byte[] data) {
           this.id = id;
           this.path = path;
           this.methodname = methodname;
           this.interfacename = interfacename;
           this.data = data;
    }


    /**
     * Gets the id value for this ControlMethodParameterType.
     * 
     * @return id   * Object id (lsa shortname)
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this ControlMethodParameterType.
     * 
     * @param id   * Object id (lsa shortname)
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the path value for this ControlMethodParameterType.
     * 
     * @return path   * path for ApWertName in protocoll OCIT-O, e.g. VS-PLUS.NETZSTEUERUNG
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this ControlMethodParameterType.
     * 
     * @param path   * path for ApWertName in protocoll OCIT-O, e.g. VS-PLUS.NETZSTEUERUNG
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the methodname value for this ControlMethodParameterType.
     * 
     * @return methodname   * name of control method in the in the controller, e.g. VS-PLUS
     */
    public java.lang.String getMethodname() {
        return methodname;
    }


    /**
     * Sets the methodname value for this ControlMethodParameterType.
     * 
     * @param methodname   * name of control method in the in the controller, e.g. VS-PLUS
     */
    public void setMethodname(java.lang.String methodname) {
        this.methodname = methodname;
    }


    /**
     * Gets the interfacename value for this ControlMethodParameterType.
     * 
     * @return interfacename   * name of the interface in the controller, e.g. NETZSTEUERUNG
     */
    public java.lang.String getInterfacename() {
        return interfacename;
    }


    /**
     * Sets the interfacename value for this ControlMethodParameterType.
     * 
     * @param interfacename   * name of the interface in the controller, e.g. NETZSTEUERUNG
     */
    public void setInterfacename(java.lang.String interfacename) {
        this.interfacename = interfacename;
    }


    /**
     * Gets the data value for this ControlMethodParameterType.
     * 
     * @return data   * data content of the OCIT-O datatype APWertBlock (1:508)
     */
    public byte[] getData() {
        return data;
    }


    /**
     * Sets the data value for this ControlMethodParameterType.
     * 
     * @param data   * data content of the OCIT-O datatype APWertBlock (1:508)
     */
    public void setData(byte[] data) {
        this.data = data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ControlMethodParameterType)) return false;
        ControlMethodParameterType other = (ControlMethodParameterType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.path==null && other.getPath()==null) || 
             (this.path!=null &&
              this.path.equals(other.getPath()))) &&
            ((this.methodname==null && other.getMethodname()==null) || 
             (this.methodname!=null &&
              this.methodname.equals(other.getMethodname()))) &&
            ((this.interfacename==null && other.getInterfacename()==null) || 
             (this.interfacename!=null &&
              this.interfacename.equals(other.getInterfacename()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              java.util.Arrays.equals(this.data, other.getData())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getPath() != null) {
            _hashCode += getPath().hashCode();
        }
        if (getMethodname() != null) {
            _hashCode += getMethodname().hashCode();
        }
        if (getInterfacename() != null) {
            _hashCode += getInterfacename().hashCode();
        }
        if (getData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
