/**
 * SEGMENTPOSITIONType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.infopoint;

public class SEGMENTPOSITIONType  implements java.io.Serializable {
    /* data for segment display */
    private java.lang.String DATA;

    /* name of a function, wich does a replacement inside the sign
     * with the current value (like date, time or temperature) */
    private com.siemens.sitraffic.external.infopoint.Function_type FUNCTION;

    /* optional effect (e.g. scrolling, blinking) */
    private com.siemens.sitraffic.external.infopoint.Effect_type EFFECT;

    private org.apache.axis.types.UnsignedByte row;  // attribute

    private org.apache.axis.types.UnsignedShort col_start;  // attribute

    private org.apache.axis.types.UnsignedShort col_end;  // attribute

    private com.siemens.sitraffic.external.infopoint.H_alignment_enum h_alignment;  // attribute

    public SEGMENTPOSITIONType() {
    }

    public SEGMENTPOSITIONType(
           java.lang.String DATA,
           com.siemens.sitraffic.external.infopoint.Function_type FUNCTION,
           com.siemens.sitraffic.external.infopoint.Effect_type EFFECT,
           org.apache.axis.types.UnsignedByte row,
           org.apache.axis.types.UnsignedShort col_start,
           org.apache.axis.types.UnsignedShort col_end,
           com.siemens.sitraffic.external.infopoint.H_alignment_enum h_alignment) {
           this.DATA = DATA;
           this.FUNCTION = FUNCTION;
           this.EFFECT = EFFECT;
           this.row = row;
           this.col_start = col_start;
           this.col_end = col_end;
           this.h_alignment = h_alignment;
    }


    /**
     * Gets the DATA value for this SEGMENTPOSITIONType.
     * 
     * @return DATA   * data for segment display
     */
    public java.lang.String getDATA() {
        return DATA;
    }


    /**
     * Sets the DATA value for this SEGMENTPOSITIONType.
     * 
     * @param DATA   * data for segment display
     */
    public void setDATA(java.lang.String DATA) {
        this.DATA = DATA;
    }


    /**
     * Gets the FUNCTION value for this SEGMENTPOSITIONType.
     * 
     * @return FUNCTION   * name of a function, wich does a replacement inside the sign
     * with the current value (like date, time or temperature)
     */
    public com.siemens.sitraffic.external.infopoint.Function_type getFUNCTION() {
        return FUNCTION;
    }


    /**
     * Sets the FUNCTION value for this SEGMENTPOSITIONType.
     * 
     * @param FUNCTION   * name of a function, wich does a replacement inside the sign
     * with the current value (like date, time or temperature)
     */
    public void setFUNCTION(com.siemens.sitraffic.external.infopoint.Function_type FUNCTION) {
        this.FUNCTION = FUNCTION;
    }


    /**
     * Gets the EFFECT value for this SEGMENTPOSITIONType.
     * 
     * @return EFFECT   * optional effect (e.g. scrolling, blinking)
     */
    public com.siemens.sitraffic.external.infopoint.Effect_type getEFFECT() {
        return EFFECT;
    }


    /**
     * Sets the EFFECT value for this SEGMENTPOSITIONType.
     * 
     * @param EFFECT   * optional effect (e.g. scrolling, blinking)
     */
    public void setEFFECT(com.siemens.sitraffic.external.infopoint.Effect_type EFFECT) {
        this.EFFECT = EFFECT;
    }


    /**
     * Gets the row value for this SEGMENTPOSITIONType.
     * 
     * @return row
     */
    public org.apache.axis.types.UnsignedByte getRow() {
        return row;
    }


    /**
     * Sets the row value for this SEGMENTPOSITIONType.
     * 
     * @param row
     */
    public void setRow(org.apache.axis.types.UnsignedByte row) {
        this.row = row;
    }


    /**
     * Gets the col_start value for this SEGMENTPOSITIONType.
     * 
     * @return col_start
     */
    public org.apache.axis.types.UnsignedShort getCol_start() {
        return col_start;
    }


    /**
     * Sets the col_start value for this SEGMENTPOSITIONType.
     * 
     * @param col_start
     */
    public void setCol_start(org.apache.axis.types.UnsignedShort col_start) {
        this.col_start = col_start;
    }


    /**
     * Gets the col_end value for this SEGMENTPOSITIONType.
     * 
     * @return col_end
     */
    public org.apache.axis.types.UnsignedShort getCol_end() {
        return col_end;
    }


    /**
     * Sets the col_end value for this SEGMENTPOSITIONType.
     * 
     * @param col_end
     */
    public void setCol_end(org.apache.axis.types.UnsignedShort col_end) {
        this.col_end = col_end;
    }


    /**
     * Gets the h_alignment value for this SEGMENTPOSITIONType.
     * 
     * @return h_alignment
     */
    public com.siemens.sitraffic.external.infopoint.H_alignment_enum getH_alignment() {
        return h_alignment;
    }


    /**
     * Sets the h_alignment value for this SEGMENTPOSITIONType.
     * 
     * @param h_alignment
     */
    public void setH_alignment(com.siemens.sitraffic.external.infopoint.H_alignment_enum h_alignment) {
        this.h_alignment = h_alignment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SEGMENTPOSITIONType)) return false;
        SEGMENTPOSITIONType other = (SEGMENTPOSITIONType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DATA==null && other.getDATA()==null) || 
             (this.DATA!=null &&
              this.DATA.equals(other.getDATA()))) &&
            ((this.FUNCTION==null && other.getFUNCTION()==null) || 
             (this.FUNCTION!=null &&
              this.FUNCTION.equals(other.getFUNCTION()))) &&
            ((this.EFFECT==null && other.getEFFECT()==null) || 
             (this.EFFECT!=null &&
              this.EFFECT.equals(other.getEFFECT()))) &&
            ((this.row==null && other.getRow()==null) || 
             (this.row!=null &&
              this.row.equals(other.getRow()))) &&
            ((this.col_start==null && other.getCol_start()==null) || 
             (this.col_start!=null &&
              this.col_start.equals(other.getCol_start()))) &&
            ((this.col_end==null && other.getCol_end()==null) || 
             (this.col_end!=null &&
              this.col_end.equals(other.getCol_end()))) &&
            ((this.h_alignment==null && other.getH_alignment()==null) || 
             (this.h_alignment!=null &&
              this.h_alignment.equals(other.getH_alignment())));
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
        if (getDATA() != null) {
            _hashCode += getDATA().hashCode();
        }
        if (getFUNCTION() != null) {
            _hashCode += getFUNCTION().hashCode();
        }
        if (getEFFECT() != null) {
            _hashCode += getEFFECT().hashCode();
        }
        if (getRow() != null) {
            _hashCode += getRow().hashCode();
        }
        if (getCol_start() != null) {
            _hashCode += getCol_start().hashCode();
        }
        if (getCol_end() != null) {
            _hashCode += getCol_end().hashCode();
        }
        if (getH_alignment() != null) {
            _hashCode += getH_alignment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
