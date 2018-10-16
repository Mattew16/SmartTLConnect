/**
 * ActionContentType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.action;

public class ActionContentType  implements java.io.Serializable {
    private com.siemens.sitraffic.external.action.RecommendationType recommendation;

    private com.siemens.sitraffic.external.action.SignControlType signControl;

    private com.siemens.sitraffic.external.action.LinkControlType linkControl;

    private com.siemens.sitraffic.external.action.ActionContentTypeActiontype actiontype;  // attribute

    public ActionContentType() {
    }

    public ActionContentType(
           com.siemens.sitraffic.external.action.RecommendationType recommendation,
           com.siemens.sitraffic.external.action.SignControlType signControl,
           com.siemens.sitraffic.external.action.LinkControlType linkControl,
           com.siemens.sitraffic.external.action.ActionContentTypeActiontype actiontype) {
           this.recommendation = recommendation;
           this.signControl = signControl;
           this.linkControl = linkControl;
           this.actiontype = actiontype;
    }


    /**
     * Gets the recommendation value for this ActionContentType.
     * 
     * @return recommendation
     */
    public com.siemens.sitraffic.external.action.RecommendationType getRecommendation() {
        return recommendation;
    }


    /**
     * Sets the recommendation value for this ActionContentType.
     * 
     * @param recommendation
     */
    public void setRecommendation(com.siemens.sitraffic.external.action.RecommendationType recommendation) {
        this.recommendation = recommendation;
    }


    /**
     * Gets the signControl value for this ActionContentType.
     * 
     * @return signControl
     */
    public com.siemens.sitraffic.external.action.SignControlType getSignControl() {
        return signControl;
    }


    /**
     * Sets the signControl value for this ActionContentType.
     * 
     * @param signControl
     */
    public void setSignControl(com.siemens.sitraffic.external.action.SignControlType signControl) {
        this.signControl = signControl;
    }


    /**
     * Gets the linkControl value for this ActionContentType.
     * 
     * @return linkControl
     */
    public com.siemens.sitraffic.external.action.LinkControlType getLinkControl() {
        return linkControl;
    }


    /**
     * Sets the linkControl value for this ActionContentType.
     * 
     * @param linkControl
     */
    public void setLinkControl(com.siemens.sitraffic.external.action.LinkControlType linkControl) {
        this.linkControl = linkControl;
    }


    /**
     * Gets the actiontype value for this ActionContentType.
     * 
     * @return actiontype
     */
    public com.siemens.sitraffic.external.action.ActionContentTypeActiontype getActiontype() {
        return actiontype;
    }


    /**
     * Sets the actiontype value for this ActionContentType.
     * 
     * @param actiontype
     */
    public void setActiontype(com.siemens.sitraffic.external.action.ActionContentTypeActiontype actiontype) {
        this.actiontype = actiontype;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ActionContentType)) return false;
        ActionContentType other = (ActionContentType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.recommendation==null && other.getRecommendation()==null) || 
             (this.recommendation!=null &&
              this.recommendation.equals(other.getRecommendation()))) &&
            ((this.signControl==null && other.getSignControl()==null) || 
             (this.signControl!=null &&
              this.signControl.equals(other.getSignControl()))) &&
            ((this.linkControl==null && other.getLinkControl()==null) || 
             (this.linkControl!=null &&
              this.linkControl.equals(other.getLinkControl()))) &&
            ((this.actiontype==null && other.getActiontype()==null) || 
             (this.actiontype!=null &&
              this.actiontype.equals(other.getActiontype())));
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
        if (getRecommendation() != null) {
            _hashCode += getRecommendation().hashCode();
        }
        if (getSignControl() != null) {
            _hashCode += getSignControl().hashCode();
        }
        if (getLinkControl() != null) {
            _hashCode += getLinkControl().hashCode();
        }
        if (getActiontype() != null) {
            _hashCode += getActiontype().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
