/**
 * InfoPoint_CmdSwitchCmdContentDefinitionImage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.vmsinstation.infopoint;

public class InfoPoint_CmdSwitchCmdContentDefinitionImage  implements java.io.Serializable {
    /* Text to be included within the Imagereference (length of the
     * text is under senders responsibility). The attribute name identifies
     * the position within the image. */
    private com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_CmdSwitchCmdContentDefinitionImageText[] text;

    private org.apache.axis.types.UnsignedLong cycle;  // attribute

    private java.lang.String name;  // attribute

    public InfoPoint_CmdSwitchCmdContentDefinitionImage() {
    }

    public InfoPoint_CmdSwitchCmdContentDefinitionImage(
           com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_CmdSwitchCmdContentDefinitionImageText[] text,
           org.apache.axis.types.UnsignedLong cycle,
           java.lang.String name) {
           this.text = text;
           this.cycle = cycle;
           this.name = name;
    }


    /**
     * Gets the text value for this InfoPoint_CmdSwitchCmdContentDefinitionImage.
     * 
     * @return text   * Text to be included within the Imagereference (length of the
     * text is under senders responsibility). The attribute name identifies
     * the position within the image.
     */
    public com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_CmdSwitchCmdContentDefinitionImageText[] getText() {
        return text;
    }


    /**
     * Sets the text value for this InfoPoint_CmdSwitchCmdContentDefinitionImage.
     * 
     * @param text   * Text to be included within the Imagereference (length of the
     * text is under senders responsibility). The attribute name identifies
     * the position within the image.
     */
    public void setText(com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_CmdSwitchCmdContentDefinitionImageText[] text) {
        this.text = text;
    }

    public com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_CmdSwitchCmdContentDefinitionImageText getText(int i) {
        return this.text[i];
    }

    public void setText(int i, com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_CmdSwitchCmdContentDefinitionImageText _value) {
        this.text[i] = _value;
    }


    /**
     * Gets the cycle value for this InfoPoint_CmdSwitchCmdContentDefinitionImage.
     * 
     * @return cycle
     */
    public org.apache.axis.types.UnsignedLong getCycle() {
        return cycle;
    }


    /**
     * Sets the cycle value for this InfoPoint_CmdSwitchCmdContentDefinitionImage.
     * 
     * @param cycle
     */
    public void setCycle(org.apache.axis.types.UnsignedLong cycle) {
        this.cycle = cycle;
    }


    /**
     * Gets the name value for this InfoPoint_CmdSwitchCmdContentDefinitionImage.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this InfoPoint_CmdSwitchCmdContentDefinitionImage.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InfoPoint_CmdSwitchCmdContentDefinitionImage)) return false;
        InfoPoint_CmdSwitchCmdContentDefinitionImage other = (InfoPoint_CmdSwitchCmdContentDefinitionImage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              java.util.Arrays.equals(this.text, other.getText()))) &&
            ((this.cycle==null && other.getCycle()==null) || 
             (this.cycle!=null &&
              this.cycle.equals(other.getCycle()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName())));
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
        if (getText() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getText());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getText(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCycle() != null) {
            _hashCode += getCycle().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
