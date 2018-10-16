/**
 * MULTILINEPOSITIONType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.infopoint;

public class MULTILINEPOSITIONType  implements java.io.Serializable {
    /* free text with optional attributes like font, size and style
     * (mostly not part of multiline orientated signs) */
    private com.siemens.sitraffic.external.infopoint.Text_type TEXT;

    /* name of a function, wich does a replacement inside the sign
     * with the current value (like date, time or temperature) */
    private com.siemens.sitraffic.external.infopoint.Function_type FUNCTION;

    private com.siemens.sitraffic.external.infopoint.MULTILINEPOSITIONTypeSYMBOL SYMBOL;

    /* optional effect (e.g. scrolling, blinking) */
    private com.siemens.sitraffic.external.infopoint.Effect_type EFFECT;

    private org.apache.axis.types.UnsignedByte row;  // attribute

    private org.apache.axis.types.UnsignedShort col_start;  // attribute

    private org.apache.axis.types.UnsignedShort col_end;  // attribute

    private org.apache.axis.types.NonNegativeInteger color;  // attribute

    private org.apache.axis.types.NonNegativeInteger bg_color;  // attribute

    private com.siemens.sitraffic.external.infopoint.H_alignment_enum h_alignment;  // attribute

    public MULTILINEPOSITIONType() {
    }

    public MULTILINEPOSITIONType(
           com.siemens.sitraffic.external.infopoint.Text_type TEXT,
           com.siemens.sitraffic.external.infopoint.Function_type FUNCTION,
           com.siemens.sitraffic.external.infopoint.MULTILINEPOSITIONTypeSYMBOL SYMBOL,
           com.siemens.sitraffic.external.infopoint.Effect_type EFFECT,
           org.apache.axis.types.UnsignedByte row,
           org.apache.axis.types.UnsignedShort col_start,
           org.apache.axis.types.UnsignedShort col_end,
           org.apache.axis.types.NonNegativeInteger color,
           org.apache.axis.types.NonNegativeInteger bg_color,
           com.siemens.sitraffic.external.infopoint.H_alignment_enum h_alignment) {
           this.TEXT = TEXT;
           this.FUNCTION = FUNCTION;
           this.SYMBOL = SYMBOL;
           this.EFFECT = EFFECT;
           this.row = row;
           this.col_start = col_start;
           this.col_end = col_end;
           this.color = color;
           this.bg_color = bg_color;
           this.h_alignment = h_alignment;
    }


    /**
     * Gets the TEXT value for this MULTILINEPOSITIONType.
     * 
     * @return TEXT   * free text with optional attributes like font, size and style
     * (mostly not part of multiline orientated signs)
     */
    public com.siemens.sitraffic.external.infopoint.Text_type getTEXT() {
        return TEXT;
    }


    /**
     * Sets the TEXT value for this MULTILINEPOSITIONType.
     * 
     * @param TEXT   * free text with optional attributes like font, size and style
     * (mostly not part of multiline orientated signs)
     */
    public void setTEXT(com.siemens.sitraffic.external.infopoint.Text_type TEXT) {
        this.TEXT = TEXT;
    }


    /**
     * Gets the FUNCTION value for this MULTILINEPOSITIONType.
     * 
     * @return FUNCTION   * name of a function, wich does a replacement inside the sign
     * with the current value (like date, time or temperature)
     */
    public com.siemens.sitraffic.external.infopoint.Function_type getFUNCTION() {
        return FUNCTION;
    }


    /**
     * Sets the FUNCTION value for this MULTILINEPOSITIONType.
     * 
     * @param FUNCTION   * name of a function, wich does a replacement inside the sign
     * with the current value (like date, time or temperature)
     */
    public void setFUNCTION(com.siemens.sitraffic.external.infopoint.Function_type FUNCTION) {
        this.FUNCTION = FUNCTION;
    }


    /**
     * Gets the SYMBOL value for this MULTILINEPOSITIONType.
     * 
     * @return SYMBOL
     */
    public com.siemens.sitraffic.external.infopoint.MULTILINEPOSITIONTypeSYMBOL getSYMBOL() {
        return SYMBOL;
    }


    /**
     * Sets the SYMBOL value for this MULTILINEPOSITIONType.
     * 
     * @param SYMBOL
     */
    public void setSYMBOL(com.siemens.sitraffic.external.infopoint.MULTILINEPOSITIONTypeSYMBOL SYMBOL) {
        this.SYMBOL = SYMBOL;
    }


    /**
     * Gets the EFFECT value for this MULTILINEPOSITIONType.
     * 
     * @return EFFECT   * optional effect (e.g. scrolling, blinking)
     */
    public com.siemens.sitraffic.external.infopoint.Effect_type getEFFECT() {
        return EFFECT;
    }


    /**
     * Sets the EFFECT value for this MULTILINEPOSITIONType.
     * 
     * @param EFFECT   * optional effect (e.g. scrolling, blinking)
     */
    public void setEFFECT(com.siemens.sitraffic.external.infopoint.Effect_type EFFECT) {
        this.EFFECT = EFFECT;
    }


    /**
     * Gets the row value for this MULTILINEPOSITIONType.
     * 
     * @return row
     */
    public org.apache.axis.types.UnsignedByte getRow() {
        return row;
    }


    /**
     * Sets the row value for this MULTILINEPOSITIONType.
     * 
     * @param row
     */
    public void setRow(org.apache.axis.types.UnsignedByte row) {
        this.row = row;
    }


    /**
     * Gets the col_start value for this MULTILINEPOSITIONType.
     * 
     * @return col_start
     */
    public org.apache.axis.types.UnsignedShort getCol_start() {
        return col_start;
    }


    /**
     * Sets the col_start value for this MULTILINEPOSITIONType.
     * 
     * @param col_start
     */
    public void setCol_start(org.apache.axis.types.UnsignedShort col_start) {
        this.col_start = col_start;
    }


    /**
     * Gets the col_end value for this MULTILINEPOSITIONType.
     * 
     * @return col_end
     */
    public org.apache.axis.types.UnsignedShort getCol_end() {
        return col_end;
    }


    /**
     * Sets the col_end value for this MULTILINEPOSITIONType.
     * 
     * @param col_end
     */
    public void setCol_end(org.apache.axis.types.UnsignedShort col_end) {
        this.col_end = col_end;
    }


    /**
     * Gets the color value for this MULTILINEPOSITIONType.
     * 
     * @return color
     */
    public org.apache.axis.types.NonNegativeInteger getColor() {
        return color;
    }


    /**
     * Sets the color value for this MULTILINEPOSITIONType.
     * 
     * @param color
     */
    public void setColor(org.apache.axis.types.NonNegativeInteger color) {
        this.color = color;
    }


    /**
     * Gets the bg_color value for this MULTILINEPOSITIONType.
     * 
     * @return bg_color
     */
    public org.apache.axis.types.NonNegativeInteger getBg_color() {
        return bg_color;
    }


    /**
     * Sets the bg_color value for this MULTILINEPOSITIONType.
     * 
     * @param bg_color
     */
    public void setBg_color(org.apache.axis.types.NonNegativeInteger bg_color) {
        this.bg_color = bg_color;
    }


    /**
     * Gets the h_alignment value for this MULTILINEPOSITIONType.
     * 
     * @return h_alignment
     */
    public com.siemens.sitraffic.external.infopoint.H_alignment_enum getH_alignment() {
        return h_alignment;
    }


    /**
     * Sets the h_alignment value for this MULTILINEPOSITIONType.
     * 
     * @param h_alignment
     */
    public void setH_alignment(com.siemens.sitraffic.external.infopoint.H_alignment_enum h_alignment) {
        this.h_alignment = h_alignment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MULTILINEPOSITIONType)) return false;
        MULTILINEPOSITIONType other = (MULTILINEPOSITIONType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.TEXT==null && other.getTEXT()==null) || 
             (this.TEXT!=null &&
              this.TEXT.equals(other.getTEXT()))) &&
            ((this.FUNCTION==null && other.getFUNCTION()==null) || 
             (this.FUNCTION!=null &&
              this.FUNCTION.equals(other.getFUNCTION()))) &&
            ((this.SYMBOL==null && other.getSYMBOL()==null) || 
             (this.SYMBOL!=null &&
              this.SYMBOL.equals(other.getSYMBOL()))) &&
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
            ((this.color==null && other.getColor()==null) || 
             (this.color!=null &&
              this.color.equals(other.getColor()))) &&
            ((this.bg_color==null && other.getBg_color()==null) || 
             (this.bg_color!=null &&
              this.bg_color.equals(other.getBg_color()))) &&
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
        if (getTEXT() != null) {
            _hashCode += getTEXT().hashCode();
        }
        if (getFUNCTION() != null) {
            _hashCode += getFUNCTION().hashCode();
        }
        if (getSYMBOL() != null) {
            _hashCode += getSYMBOL().hashCode();
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
        if (getColor() != null) {
            _hashCode += getColor().hashCode();
        }
        if (getBg_color() != null) {
            _hashCode += getBg_color().hashCode();
        }
        if (getH_alignment() != null) {
            _hashCode += getH_alignment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
