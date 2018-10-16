/**
 * PROGRAM.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.vmsinstation.infopoint;

public class PROGRAM  implements java.io.Serializable {
    /* enumaration of n pictures with defined duration in seconds
     * (duration is mandatory if only one picture defined) */
    private com.siemens.sitraffic.vmsinstation.infopoint.PICTUREType[] PICTURE;

    private java.lang.String id;  // attribute

    private java.util.Calendar dateTime;  // attribute

    public PROGRAM() {
    }

    public PROGRAM(
           com.siemens.sitraffic.vmsinstation.infopoint.PICTUREType[] PICTURE,
           java.lang.String id,
           java.util.Calendar dateTime) {
           this.PICTURE = PICTURE;
           this.id = id;
           this.dateTime = dateTime;
    }


    /**
     * Gets the PICTURE value for this PROGRAM.
     * 
     * @return PICTURE   * enumaration of n pictures with defined duration in seconds
     * (duration is mandatory if only one picture defined)
     */
    public com.siemens.sitraffic.vmsinstation.infopoint.PICTUREType[] getPICTURE() {
        return PICTURE;
    }


    /**
     * Sets the PICTURE value for this PROGRAM.
     * 
     * @param PICTURE   * enumaration of n pictures with defined duration in seconds
     * (duration is mandatory if only one picture defined)
     */
    public void setPICTURE(com.siemens.sitraffic.vmsinstation.infopoint.PICTUREType[] PICTURE) {
        this.PICTURE = PICTURE;
    }

    public com.siemens.sitraffic.vmsinstation.infopoint.PICTUREType getPICTURE(int i) {
        return this.PICTURE[i];
    }

    public void setPICTURE(int i, com.siemens.sitraffic.vmsinstation.infopoint.PICTUREType _value) {
        this.PICTURE[i] = _value;
    }


    /**
     * Gets the id value for this PROGRAM.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this PROGRAM.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the dateTime value for this PROGRAM.
     * 
     * @return dateTime
     */
    public java.util.Calendar getDateTime() {
        return dateTime;
    }


    /**
     * Sets the dateTime value for this PROGRAM.
     * 
     * @param dateTime
     */
    public void setDateTime(java.util.Calendar dateTime) {
        this.dateTime = dateTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PROGRAM)) return false;
        PROGRAM other = (PROGRAM) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PICTURE==null && other.getPICTURE()==null) || 
             (this.PICTURE!=null &&
              java.util.Arrays.equals(this.PICTURE, other.getPICTURE()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.dateTime==null && other.getDateTime()==null) || 
             (this.dateTime!=null &&
              this.dateTime.equals(other.getDateTime())));
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
        if (getPICTURE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPICTURE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPICTURE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getDateTime() != null) {
            _hashCode += getDateTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
