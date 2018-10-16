/**
 * PICTUREType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.vmsinstation.infopoint;

public class PICTUREType  implements java.io.Serializable {
    /* definition of display elements with free pixel-related format
     * and free font capabilities */
    private com.siemens.sitraffic.vmsinstation.infopoint.MATRIXType[] MATRIX;

    /* definition of display elements with line orientated format */
    private com.siemens.sitraffic.vmsinstation.infopoint.MULTILINEType[] MULTILINE;

    /* definition of segment orientated display element (no font definition,
     * position is  based on character position, not pixel orientated) */
    private com.siemens.sitraffic.vmsinstation.infopoint.SEGMENTType[] SEGMENT;

    /* definition of prism orientated display element (only index
     * of prism given) */
    private com.siemens.sitraffic.vmsinstation.infopoint.PRISMType[] PRISM;

    /* rendered whole contents into "imgtype" (e.g. jpg) */
    private com.siemens.sitraffic.vmsinstation.infopoint.PICTURETypeRENDERED[] RENDERED;

    private java.lang.String id;  // attribute

    private java.lang.String duration;  // attribute

    public PICTUREType() {
    }

    public PICTUREType(
           com.siemens.sitraffic.vmsinstation.infopoint.MATRIXType[] MATRIX,
           com.siemens.sitraffic.vmsinstation.infopoint.MULTILINEType[] MULTILINE,
           com.siemens.sitraffic.vmsinstation.infopoint.SEGMENTType[] SEGMENT,
           com.siemens.sitraffic.vmsinstation.infopoint.PRISMType[] PRISM,
           com.siemens.sitraffic.vmsinstation.infopoint.PICTURETypeRENDERED[] RENDERED,
           java.lang.String id,
           java.lang.String duration) {
           this.MATRIX = MATRIX;
           this.MULTILINE = MULTILINE;
           this.SEGMENT = SEGMENT;
           this.PRISM = PRISM;
           this.RENDERED = RENDERED;
           this.id = id;
           this.duration = duration;
    }


    /**
     * Gets the MATRIX value for this PICTUREType.
     * 
     * @return MATRIX   * definition of display elements with free pixel-related format
     * and free font capabilities
     */
    public com.siemens.sitraffic.vmsinstation.infopoint.MATRIXType[] getMATRIX() {
        return MATRIX;
    }


    /**
     * Sets the MATRIX value for this PICTUREType.
     * 
     * @param MATRIX   * definition of display elements with free pixel-related format
     * and free font capabilities
     */
    public void setMATRIX(com.siemens.sitraffic.vmsinstation.infopoint.MATRIXType[] MATRIX) {
        this.MATRIX = MATRIX;
    }

    public com.siemens.sitraffic.vmsinstation.infopoint.MATRIXType getMATRIX(int i) {
        return this.MATRIX[i];
    }

    public void setMATRIX(int i, com.siemens.sitraffic.vmsinstation.infopoint.MATRIXType _value) {
        this.MATRIX[i] = _value;
    }


    /**
     * Gets the MULTILINE value for this PICTUREType.
     * 
     * @return MULTILINE   * definition of display elements with line orientated format
     */
    public com.siemens.sitraffic.vmsinstation.infopoint.MULTILINEType[] getMULTILINE() {
        return MULTILINE;
    }


    /**
     * Sets the MULTILINE value for this PICTUREType.
     * 
     * @param MULTILINE   * definition of display elements with line orientated format
     */
    public void setMULTILINE(com.siemens.sitraffic.vmsinstation.infopoint.MULTILINEType[] MULTILINE) {
        this.MULTILINE = MULTILINE;
    }

    public com.siemens.sitraffic.vmsinstation.infopoint.MULTILINEType getMULTILINE(int i) {
        return this.MULTILINE[i];
    }

    public void setMULTILINE(int i, com.siemens.sitraffic.vmsinstation.infopoint.MULTILINEType _value) {
        this.MULTILINE[i] = _value;
    }


    /**
     * Gets the SEGMENT value for this PICTUREType.
     * 
     * @return SEGMENT   * definition of segment orientated display element (no font definition,
     * position is  based on character position, not pixel orientated)
     */
    public com.siemens.sitraffic.vmsinstation.infopoint.SEGMENTType[] getSEGMENT() {
        return SEGMENT;
    }


    /**
     * Sets the SEGMENT value for this PICTUREType.
     * 
     * @param SEGMENT   * definition of segment orientated display element (no font definition,
     * position is  based on character position, not pixel orientated)
     */
    public void setSEGMENT(com.siemens.sitraffic.vmsinstation.infopoint.SEGMENTType[] SEGMENT) {
        this.SEGMENT = SEGMENT;
    }

    public com.siemens.sitraffic.vmsinstation.infopoint.SEGMENTType getSEGMENT(int i) {
        return this.SEGMENT[i];
    }

    public void setSEGMENT(int i, com.siemens.sitraffic.vmsinstation.infopoint.SEGMENTType _value) {
        this.SEGMENT[i] = _value;
    }


    /**
     * Gets the PRISM value for this PICTUREType.
     * 
     * @return PRISM   * definition of prism orientated display element (only index
     * of prism given)
     */
    public com.siemens.sitraffic.vmsinstation.infopoint.PRISMType[] getPRISM() {
        return PRISM;
    }


    /**
     * Sets the PRISM value for this PICTUREType.
     * 
     * @param PRISM   * definition of prism orientated display element (only index
     * of prism given)
     */
    public void setPRISM(com.siemens.sitraffic.vmsinstation.infopoint.PRISMType[] PRISM) {
        this.PRISM = PRISM;
    }

    public com.siemens.sitraffic.vmsinstation.infopoint.PRISMType getPRISM(int i) {
        return this.PRISM[i];
    }

    public void setPRISM(int i, com.siemens.sitraffic.vmsinstation.infopoint.PRISMType _value) {
        this.PRISM[i] = _value;
    }


    /**
     * Gets the RENDERED value for this PICTUREType.
     * 
     * @return RENDERED   * rendered whole contents into "imgtype" (e.g. jpg)
     */
    public com.siemens.sitraffic.vmsinstation.infopoint.PICTURETypeRENDERED[] getRENDERED() {
        return RENDERED;
    }


    /**
     * Sets the RENDERED value for this PICTUREType.
     * 
     * @param RENDERED   * rendered whole contents into "imgtype" (e.g. jpg)
     */
    public void setRENDERED(com.siemens.sitraffic.vmsinstation.infopoint.PICTURETypeRENDERED[] RENDERED) {
        this.RENDERED = RENDERED;
    }

    public com.siemens.sitraffic.vmsinstation.infopoint.PICTURETypeRENDERED getRENDERED(int i) {
        return this.RENDERED[i];
    }

    public void setRENDERED(int i, com.siemens.sitraffic.vmsinstation.infopoint.PICTURETypeRENDERED _value) {
        this.RENDERED[i] = _value;
    }


    /**
     * Gets the id value for this PICTUREType.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this PICTUREType.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the duration value for this PICTUREType.
     * 
     * @return duration
     */
    public java.lang.String getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this PICTUREType.
     * 
     * @param duration
     */
    public void setDuration(java.lang.String duration) {
        this.duration = duration;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PICTUREType)) return false;
        PICTUREType other = (PICTUREType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MATRIX==null && other.getMATRIX()==null) || 
             (this.MATRIX!=null &&
              java.util.Arrays.equals(this.MATRIX, other.getMATRIX()))) &&
            ((this.MULTILINE==null && other.getMULTILINE()==null) || 
             (this.MULTILINE!=null &&
              java.util.Arrays.equals(this.MULTILINE, other.getMULTILINE()))) &&
            ((this.SEGMENT==null && other.getSEGMENT()==null) || 
             (this.SEGMENT!=null &&
              java.util.Arrays.equals(this.SEGMENT, other.getSEGMENT()))) &&
            ((this.PRISM==null && other.getPRISM()==null) || 
             (this.PRISM!=null &&
              java.util.Arrays.equals(this.PRISM, other.getPRISM()))) &&
            ((this.RENDERED==null && other.getRENDERED()==null) || 
             (this.RENDERED!=null &&
              java.util.Arrays.equals(this.RENDERED, other.getRENDERED()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.duration==null && other.getDuration()==null) || 
             (this.duration!=null &&
              this.duration.equals(other.getDuration())));
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
        if (getMATRIX() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMATRIX());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMATRIX(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMULTILINE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMULTILINE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMULTILINE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSEGMENT() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSEGMENT());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSEGMENT(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPRISM() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPRISM());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPRISM(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRENDERED() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRENDERED());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRENDERED(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getDuration() != null) {
            _hashCode += getDuration().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
