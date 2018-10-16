/**
 * AREAType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.vmsinstation.infopoint;

public class AREAType  implements java.io.Serializable {
    /* free text with attributes like font, size and style */
    private com.siemens.sitraffic.vmsinstation.infopoint.Text_type TEXT;

    /* name of an image ressource (bitmap) */
    private java.lang.String IMAGE;

    /* name of a function, wich does a replacement inside the sign
     * with the current value (like date, time or temperature) */
    private com.siemens.sitraffic.vmsinstation.infopoint.Function_type FUNCTION;

    private java.lang.String SYMBOL;

    /* figure of type rect, line or ellipse inside current area */
    private com.siemens.sitraffic.vmsinstation.infopoint.Figure_type[] SHAPE;

    /* optional effect (e.g. scrolling, blinking) */
    private com.siemens.sitraffic.vmsinstation.infopoint.Effect_type EFFECT;

    private java.math.BigInteger top;  // attribute

    private java.math.BigInteger left;  // attribute

    private java.math.BigInteger bottom;  // attribute

    private java.math.BigInteger right;  // attribute

    private org.apache.axis.types.NonNegativeInteger color;  // attribute

    private org.apache.axis.types.NonNegativeInteger bg_color;  // attribute

    private com.siemens.sitraffic.vmsinstation.infopoint.H_alignment_enum h_alignment;  // attribute

    private com.siemens.sitraffic.vmsinstation.infopoint.V_alignment_enum v_alignment;  // attribute

    public AREAType() {
    }

    public AREAType(
           com.siemens.sitraffic.vmsinstation.infopoint.Text_type TEXT,
           java.lang.String IMAGE,
           com.siemens.sitraffic.vmsinstation.infopoint.Function_type FUNCTION,
           java.lang.String SYMBOL,
           com.siemens.sitraffic.vmsinstation.infopoint.Figure_type[] SHAPE,
           com.siemens.sitraffic.vmsinstation.infopoint.Effect_type EFFECT,
           java.math.BigInteger top,
           java.math.BigInteger left,
           java.math.BigInteger bottom,
           java.math.BigInteger right,
           org.apache.axis.types.NonNegativeInteger color,
           org.apache.axis.types.NonNegativeInteger bg_color,
           com.siemens.sitraffic.vmsinstation.infopoint.H_alignment_enum h_alignment,
           com.siemens.sitraffic.vmsinstation.infopoint.V_alignment_enum v_alignment) {
           this.TEXT = TEXT;
           this.IMAGE = IMAGE;
           this.FUNCTION = FUNCTION;
           this.SYMBOL = SYMBOL;
           this.SHAPE = SHAPE;
           this.EFFECT = EFFECT;
           this.top = top;
           this.left = left;
           this.bottom = bottom;
           this.right = right;
           this.color = color;
           this.bg_color = bg_color;
           this.h_alignment = h_alignment;
           this.v_alignment = v_alignment;
    }


    /**
     * Gets the TEXT value for this AREAType.
     * 
     * @return TEXT   * free text with attributes like font, size and style
     */
    public com.siemens.sitraffic.vmsinstation.infopoint.Text_type getTEXT() {
        return TEXT;
    }


    /**
     * Sets the TEXT value for this AREAType.
     * 
     * @param TEXT   * free text with attributes like font, size and style
     */
    public void setTEXT(com.siemens.sitraffic.vmsinstation.infopoint.Text_type TEXT) {
        this.TEXT = TEXT;
    }


    /**
     * Gets the IMAGE value for this AREAType.
     * 
     * @return IMAGE   * name of an image ressource (bitmap)
     */
    public java.lang.String getIMAGE() {
        return IMAGE;
    }


    /**
     * Sets the IMAGE value for this AREAType.
     * 
     * @param IMAGE   * name of an image ressource (bitmap)
     */
    public void setIMAGE(java.lang.String IMAGE) {
        this.IMAGE = IMAGE;
    }


    /**
     * Gets the FUNCTION value for this AREAType.
     * 
     * @return FUNCTION   * name of a function, wich does a replacement inside the sign
     * with the current value (like date, time or temperature)
     */
    public com.siemens.sitraffic.vmsinstation.infopoint.Function_type getFUNCTION() {
        return FUNCTION;
    }


    /**
     * Sets the FUNCTION value for this AREAType.
     * 
     * @param FUNCTION   * name of a function, wich does a replacement inside the sign
     * with the current value (like date, time or temperature)
     */
    public void setFUNCTION(com.siemens.sitraffic.vmsinstation.infopoint.Function_type FUNCTION) {
        this.FUNCTION = FUNCTION;
    }


    /**
     * Gets the SYMBOL value for this AREAType.
     * 
     * @return SYMBOL
     */
    public java.lang.String getSYMBOL() {
        return SYMBOL;
    }


    /**
     * Sets the SYMBOL value for this AREAType.
     * 
     * @param SYMBOL
     */
    public void setSYMBOL(java.lang.String SYMBOL) {
        this.SYMBOL = SYMBOL;
    }


    /**
     * Gets the SHAPE value for this AREAType.
     * 
     * @return SHAPE   * figure of type rect, line or ellipse inside current area
     */
    public com.siemens.sitraffic.vmsinstation.infopoint.Figure_type[] getSHAPE() {
        return SHAPE;
    }


    /**
     * Sets the SHAPE value for this AREAType.
     * 
     * @param SHAPE   * figure of type rect, line or ellipse inside current area
     */
    public void setSHAPE(com.siemens.sitraffic.vmsinstation.infopoint.Figure_type[] SHAPE) {
        this.SHAPE = SHAPE;
    }

    public com.siemens.sitraffic.vmsinstation.infopoint.Figure_type getSHAPE(int i) {
        return this.SHAPE[i];
    }

    public void setSHAPE(int i, com.siemens.sitraffic.vmsinstation.infopoint.Figure_type _value) {
        this.SHAPE[i] = _value;
    }


    /**
     * Gets the EFFECT value for this AREAType.
     * 
     * @return EFFECT   * optional effect (e.g. scrolling, blinking)
     */
    public com.siemens.sitraffic.vmsinstation.infopoint.Effect_type getEFFECT() {
        return EFFECT;
    }


    /**
     * Sets the EFFECT value for this AREAType.
     * 
     * @param EFFECT   * optional effect (e.g. scrolling, blinking)
     */
    public void setEFFECT(com.siemens.sitraffic.vmsinstation.infopoint.Effect_type EFFECT) {
        this.EFFECT = EFFECT;
    }


    /**
     * Gets the top value for this AREAType.
     * 
     * @return top
     */
    public java.math.BigInteger getTop() {
        return top;
    }


    /**
     * Sets the top value for this AREAType.
     * 
     * @param top
     */
    public void setTop(java.math.BigInteger top) {
        this.top = top;
    }


    /**
     * Gets the left value for this AREAType.
     * 
     * @return left
     */
    public java.math.BigInteger getLeft() {
        return left;
    }


    /**
     * Sets the left value for this AREAType.
     * 
     * @param left
     */
    public void setLeft(java.math.BigInteger left) {
        this.left = left;
    }


    /**
     * Gets the bottom value for this AREAType.
     * 
     * @return bottom
     */
    public java.math.BigInteger getBottom() {
        return bottom;
    }


    /**
     * Sets the bottom value for this AREAType.
     * 
     * @param bottom
     */
    public void setBottom(java.math.BigInteger bottom) {
        this.bottom = bottom;
    }


    /**
     * Gets the right value for this AREAType.
     * 
     * @return right
     */
    public java.math.BigInteger getRight() {
        return right;
    }


    /**
     * Sets the right value for this AREAType.
     * 
     * @param right
     */
    public void setRight(java.math.BigInteger right) {
        this.right = right;
    }


    /**
     * Gets the color value for this AREAType.
     * 
     * @return color
     */
    public org.apache.axis.types.NonNegativeInteger getColor() {
        return color;
    }


    /**
     * Sets the color value for this AREAType.
     * 
     * @param color
     */
    public void setColor(org.apache.axis.types.NonNegativeInteger color) {
        this.color = color;
    }


    /**
     * Gets the bg_color value for this AREAType.
     * 
     * @return bg_color
     */
    public org.apache.axis.types.NonNegativeInteger getBg_color() {
        return bg_color;
    }


    /**
     * Sets the bg_color value for this AREAType.
     * 
     * @param bg_color
     */
    public void setBg_color(org.apache.axis.types.NonNegativeInteger bg_color) {
        this.bg_color = bg_color;
    }


    /**
     * Gets the h_alignment value for this AREAType.
     * 
     * @return h_alignment
     */
    public com.siemens.sitraffic.vmsinstation.infopoint.H_alignment_enum getH_alignment() {
        return h_alignment;
    }


    /**
     * Sets the h_alignment value for this AREAType.
     * 
     * @param h_alignment
     */
    public void setH_alignment(com.siemens.sitraffic.vmsinstation.infopoint.H_alignment_enum h_alignment) {
        this.h_alignment = h_alignment;
    }


    /**
     * Gets the v_alignment value for this AREAType.
     * 
     * @return v_alignment
     */
    public com.siemens.sitraffic.vmsinstation.infopoint.V_alignment_enum getV_alignment() {
        return v_alignment;
    }


    /**
     * Sets the v_alignment value for this AREAType.
     * 
     * @param v_alignment
     */
    public void setV_alignment(com.siemens.sitraffic.vmsinstation.infopoint.V_alignment_enum v_alignment) {
        this.v_alignment = v_alignment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AREAType)) return false;
        AREAType other = (AREAType) obj;
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
            ((this.IMAGE==null && other.getIMAGE()==null) || 
             (this.IMAGE!=null &&
              this.IMAGE.equals(other.getIMAGE()))) &&
            ((this.FUNCTION==null && other.getFUNCTION()==null) || 
             (this.FUNCTION!=null &&
              this.FUNCTION.equals(other.getFUNCTION()))) &&
            ((this.SYMBOL==null && other.getSYMBOL()==null) || 
             (this.SYMBOL!=null &&
              this.SYMBOL.equals(other.getSYMBOL()))) &&
            ((this.SHAPE==null && other.getSHAPE()==null) || 
             (this.SHAPE!=null &&
              java.util.Arrays.equals(this.SHAPE, other.getSHAPE()))) &&
            ((this.EFFECT==null && other.getEFFECT()==null) || 
             (this.EFFECT!=null &&
              this.EFFECT.equals(other.getEFFECT()))) &&
            ((this.top==null && other.getTop()==null) || 
             (this.top!=null &&
              this.top.equals(other.getTop()))) &&
            ((this.left==null && other.getLeft()==null) || 
             (this.left!=null &&
              this.left.equals(other.getLeft()))) &&
            ((this.bottom==null && other.getBottom()==null) || 
             (this.bottom!=null &&
              this.bottom.equals(other.getBottom()))) &&
            ((this.right==null && other.getRight()==null) || 
             (this.right!=null &&
              this.right.equals(other.getRight()))) &&
            ((this.color==null && other.getColor()==null) || 
             (this.color!=null &&
              this.color.equals(other.getColor()))) &&
            ((this.bg_color==null && other.getBg_color()==null) || 
             (this.bg_color!=null &&
              this.bg_color.equals(other.getBg_color()))) &&
            ((this.h_alignment==null && other.getH_alignment()==null) || 
             (this.h_alignment!=null &&
              this.h_alignment.equals(other.getH_alignment()))) &&
            ((this.v_alignment==null && other.getV_alignment()==null) || 
             (this.v_alignment!=null &&
              this.v_alignment.equals(other.getV_alignment())));
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
        if (getIMAGE() != null) {
            _hashCode += getIMAGE().hashCode();
        }
        if (getFUNCTION() != null) {
            _hashCode += getFUNCTION().hashCode();
        }
        if (getSYMBOL() != null) {
            _hashCode += getSYMBOL().hashCode();
        }
        if (getSHAPE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSHAPE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSHAPE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEFFECT() != null) {
            _hashCode += getEFFECT().hashCode();
        }
        if (getTop() != null) {
            _hashCode += getTop().hashCode();
        }
        if (getLeft() != null) {
            _hashCode += getLeft().hashCode();
        }
        if (getBottom() != null) {
            _hashCode += getBottom().hashCode();
        }
        if (getRight() != null) {
            _hashCode += getRight().hashCode();
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
        if (getV_alignment() != null) {
            _hashCode += getV_alignment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
