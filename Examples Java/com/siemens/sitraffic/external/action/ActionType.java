/**
 * ActionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.action;

public class ActionType  implements java.io.Serializable {
    /* id of the action within the action plan */
    private int actionId;

    /* id of the action plan which includes and issues the action */
    private int actionPlanId;

    /* name of the action */
    private java.lang.String name;

    /* time, when the action has been issued */
    private java.util.Calendar timeStamp;

    /* validity of this action in s in case it can be calculated */
    private com.siemens.sitraffic.external.action.ValidityType validity;

    /* type of the action e.g. sign control, lsa control ... */
    private com.siemens.sitraffic.external.action.ActionContentType content;

    /* influenced vehicle types */
    private com.siemens.sitraffic.external.action.ActionTypeInfluencedVehicleType[] influencedVehicleType;

    public ActionType() {
    }

    public ActionType(
           int actionId,
           int actionPlanId,
           java.lang.String name,
           java.util.Calendar timeStamp,
           com.siemens.sitraffic.external.action.ValidityType validity,
           com.siemens.sitraffic.external.action.ActionContentType content,
           com.siemens.sitraffic.external.action.ActionTypeInfluencedVehicleType[] influencedVehicleType) {
           this.actionId = actionId;
           this.actionPlanId = actionPlanId;
           this.name = name;
           this.timeStamp = timeStamp;
           this.validity = validity;
           this.content = content;
           this.influencedVehicleType = influencedVehicleType;
    }


    /**
     * Gets the actionId value for this ActionType.
     * 
     * @return actionId   * id of the action within the action plan
     */
    public int getActionId() {
        return actionId;
    }


    /**
     * Sets the actionId value for this ActionType.
     * 
     * @param actionId   * id of the action within the action plan
     */
    public void setActionId(int actionId) {
        this.actionId = actionId;
    }


    /**
     * Gets the actionPlanId value for this ActionType.
     * 
     * @return actionPlanId   * id of the action plan which includes and issues the action
     */
    public int getActionPlanId() {
        return actionPlanId;
    }


    /**
     * Sets the actionPlanId value for this ActionType.
     * 
     * @param actionPlanId   * id of the action plan which includes and issues the action
     */
    public void setActionPlanId(int actionPlanId) {
        this.actionPlanId = actionPlanId;
    }


    /**
     * Gets the name value for this ActionType.
     * 
     * @return name   * name of the action
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ActionType.
     * 
     * @param name   * name of the action
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the timeStamp value for this ActionType.
     * 
     * @return timeStamp   * time, when the action has been issued
     */
    public java.util.Calendar getTimeStamp() {
        return timeStamp;
    }


    /**
     * Sets the timeStamp value for this ActionType.
     * 
     * @param timeStamp   * time, when the action has been issued
     */
    public void setTimeStamp(java.util.Calendar timeStamp) {
        this.timeStamp = timeStamp;
    }


    /**
     * Gets the validity value for this ActionType.
     * 
     * @return validity   * validity of this action in s in case it can be calculated
     */
    public com.siemens.sitraffic.external.action.ValidityType getValidity() {
        return validity;
    }


    /**
     * Sets the validity value for this ActionType.
     * 
     * @param validity   * validity of this action in s in case it can be calculated
     */
    public void setValidity(com.siemens.sitraffic.external.action.ValidityType validity) {
        this.validity = validity;
    }


    /**
     * Gets the content value for this ActionType.
     * 
     * @return content   * type of the action e.g. sign control, lsa control ...
     */
    public com.siemens.sitraffic.external.action.ActionContentType getContent() {
        return content;
    }


    /**
     * Sets the content value for this ActionType.
     * 
     * @param content   * type of the action e.g. sign control, lsa control ...
     */
    public void setContent(com.siemens.sitraffic.external.action.ActionContentType content) {
        this.content = content;
    }


    /**
     * Gets the influencedVehicleType value for this ActionType.
     * 
     * @return influencedVehicleType   * influenced vehicle types
     */
    public com.siemens.sitraffic.external.action.ActionTypeInfluencedVehicleType[] getInfluencedVehicleType() {
        return influencedVehicleType;
    }


    /**
     * Sets the influencedVehicleType value for this ActionType.
     * 
     * @param influencedVehicleType   * influenced vehicle types
     */
    public void setInfluencedVehicleType(com.siemens.sitraffic.external.action.ActionTypeInfluencedVehicleType[] influencedVehicleType) {
        this.influencedVehicleType = influencedVehicleType;
    }

    public com.siemens.sitraffic.external.action.ActionTypeInfluencedVehicleType getInfluencedVehicleType(int i) {
        return this.influencedVehicleType[i];
    }

    public void setInfluencedVehicleType(int i, com.siemens.sitraffic.external.action.ActionTypeInfluencedVehicleType _value) {
        this.influencedVehicleType[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ActionType)) return false;
        ActionType other = (ActionType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.actionId == other.getActionId() &&
            this.actionPlanId == other.getActionPlanId() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.timeStamp==null && other.getTimeStamp()==null) || 
             (this.timeStamp!=null &&
              this.timeStamp.equals(other.getTimeStamp()))) &&
            ((this.validity==null && other.getValidity()==null) || 
             (this.validity!=null &&
              this.validity.equals(other.getValidity()))) &&
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              this.content.equals(other.getContent()))) &&
            ((this.influencedVehicleType==null && other.getInfluencedVehicleType()==null) || 
             (this.influencedVehicleType!=null &&
              java.util.Arrays.equals(this.influencedVehicleType, other.getInfluencedVehicleType())));
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
        _hashCode += getActionId();
        _hashCode += getActionPlanId();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getTimeStamp() != null) {
            _hashCode += getTimeStamp().hashCode();
        }
        if (getValidity() != null) {
            _hashCode += getValidity().hashCode();
        }
        if (getContent() != null) {
            _hashCode += getContent().hashCode();
        }
        if (getInfluencedVehicleType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInfluencedVehicleType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInfluencedVehicleType(), i);
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
