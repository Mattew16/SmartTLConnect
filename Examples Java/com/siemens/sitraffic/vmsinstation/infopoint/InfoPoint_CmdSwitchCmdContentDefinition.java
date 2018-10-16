/**
 * InfoPoint_CmdSwitchCmdContentDefinition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.vmsinstation.infopoint;

public class InfoPoint_CmdSwitchCmdContentDefinition  implements java.io.Serializable {
    /* Contains a list of images each contains the attributes: cycle=intervallength
     * of this image/name=Reference of the image to keep control over layout
     * and included images and finally the element Text carriing the image
     * contents. */
    private com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_CmdSwitchCmdContentDefinitionImage[] image;

    private org.apache.axis.types.UnsignedShort addTo;  // attribute

    public InfoPoint_CmdSwitchCmdContentDefinition() {
    }

    public InfoPoint_CmdSwitchCmdContentDefinition(
           com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_CmdSwitchCmdContentDefinitionImage[] image,
           org.apache.axis.types.UnsignedShort addTo) {
           this.image = image;
           this.addTo = addTo;
    }


    /**
     * Gets the image value for this InfoPoint_CmdSwitchCmdContentDefinition.
     * 
     * @return image   * Contains a list of images each contains the attributes: cycle=intervallength
     * of this image/name=Reference of the image to keep control over layout
     * and included images and finally the element Text carriing the image
     * contents.
     */
    public com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_CmdSwitchCmdContentDefinitionImage[] getImage() {
        return image;
    }


    /**
     * Sets the image value for this InfoPoint_CmdSwitchCmdContentDefinition.
     * 
     * @param image   * Contains a list of images each contains the attributes: cycle=intervallength
     * of this image/name=Reference of the image to keep control over layout
     * and included images and finally the element Text carriing the image
     * contents.
     */
    public void setImage(com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_CmdSwitchCmdContentDefinitionImage[] image) {
        this.image = image;
    }

    public com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_CmdSwitchCmdContentDefinitionImage getImage(int i) {
        return this.image[i];
    }

    public void setImage(int i, com.siemens.sitraffic.vmsinstation.infopoint.InfoPoint_CmdSwitchCmdContentDefinitionImage _value) {
        this.image[i] = _value;
    }


    /**
     * Gets the addTo value for this InfoPoint_CmdSwitchCmdContentDefinition.
     * 
     * @return addTo
     */
    public org.apache.axis.types.UnsignedShort getAddTo() {
        return addTo;
    }


    /**
     * Sets the addTo value for this InfoPoint_CmdSwitchCmdContentDefinition.
     * 
     * @param addTo
     */
    public void setAddTo(org.apache.axis.types.UnsignedShort addTo) {
        this.addTo = addTo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InfoPoint_CmdSwitchCmdContentDefinition)) return false;
        InfoPoint_CmdSwitchCmdContentDefinition other = (InfoPoint_CmdSwitchCmdContentDefinition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.image==null && other.getImage()==null) || 
             (this.image!=null &&
              java.util.Arrays.equals(this.image, other.getImage()))) &&
            ((this.addTo==null && other.getAddTo()==null) || 
             (this.addTo!=null &&
              this.addTo.equals(other.getAddTo())));
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
        if (getImage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddTo() != null) {
            _hashCode += getAddTo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
