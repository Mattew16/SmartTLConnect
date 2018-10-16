/**
 * LocationTypeNet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.vmsinstation.infopoint;

public class LocationTypeNet  implements java.io.Serializable {
    /* Description of the used net */
    private com.siemens.sitraffic.vmsinstation.infopoint.LocationTypeNetNetref netref;

    private com.siemens.sitraffic.vmsinstation.infopoint.LocationTypeNetNet[] net;

    public LocationTypeNet() {
    }

    public LocationTypeNet(
           com.siemens.sitraffic.vmsinstation.infopoint.LocationTypeNetNetref netref,
           com.siemens.sitraffic.vmsinstation.infopoint.LocationTypeNetNet[] net) {
           this.netref = netref;
           this.net = net;
    }


    /**
     * Gets the netref value for this LocationTypeNet.
     * 
     * @return netref   * Description of the used net
     */
    public com.siemens.sitraffic.vmsinstation.infopoint.LocationTypeNetNetref getNetref() {
        return netref;
    }


    /**
     * Sets the netref value for this LocationTypeNet.
     * 
     * @param netref   * Description of the used net
     */
    public void setNetref(com.siemens.sitraffic.vmsinstation.infopoint.LocationTypeNetNetref netref) {
        this.netref = netref;
    }


    /**
     * Gets the net value for this LocationTypeNet.
     * 
     * @return net
     */
    public com.siemens.sitraffic.vmsinstation.infopoint.LocationTypeNetNet[] getNet() {
        return net;
    }


    /**
     * Sets the net value for this LocationTypeNet.
     * 
     * @param net
     */
    public void setNet(com.siemens.sitraffic.vmsinstation.infopoint.LocationTypeNetNet[] net) {
        this.net = net;
    }

    public com.siemens.sitraffic.vmsinstation.infopoint.LocationTypeNetNet getNet(int i) {
        return this.net[i];
    }

    public void setNet(int i, com.siemens.sitraffic.vmsinstation.infopoint.LocationTypeNetNet _value) {
        this.net[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocationTypeNet)) return false;
        LocationTypeNet other = (LocationTypeNet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.netref==null && other.getNetref()==null) || 
             (this.netref!=null &&
              this.netref.equals(other.getNetref()))) &&
            ((this.net==null && other.getNet()==null) || 
             (this.net!=null &&
              java.util.Arrays.equals(this.net, other.getNet())));
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
        if (getNetref() != null) {
            _hashCode += getNetref().hashCode();
        }
        if (getNet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNet(), i);
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
