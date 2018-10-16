/**
 * SimControlType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.simulation;


/**
 * Simulation Control
 * objecttype Simulation_Control
 */
public class SimControlType  implements java.io.Serializable {
    /* Sent from PTV to Concert via put when all measuremen type have
     * been sent via put */
    private com.siemens.sitraffic.external.simulation.MeasurementsCompletedType measurementsCompleted;

    /* Sent from Concert to PTV via get when all actions have been
     * stored in the buffer and are ready to be read via get */
    private com.siemens.sitraffic.external.simulation.ActionsCompletedType actionsCompleted;

    public SimControlType() {
    }

    public SimControlType(
           com.siemens.sitraffic.external.simulation.MeasurementsCompletedType measurementsCompleted,
           com.siemens.sitraffic.external.simulation.ActionsCompletedType actionsCompleted) {
           this.measurementsCompleted = measurementsCompleted;
           this.actionsCompleted = actionsCompleted;
    }


    /**
     * Gets the measurementsCompleted value for this SimControlType.
     * 
     * @return measurementsCompleted   * Sent from PTV to Concert via put when all measuremen type have
     * been sent via put
     */
    public com.siemens.sitraffic.external.simulation.MeasurementsCompletedType getMeasurementsCompleted() {
        return measurementsCompleted;
    }


    /**
     * Sets the measurementsCompleted value for this SimControlType.
     * 
     * @param measurementsCompleted   * Sent from PTV to Concert via put when all measuremen type have
     * been sent via put
     */
    public void setMeasurementsCompleted(com.siemens.sitraffic.external.simulation.MeasurementsCompletedType measurementsCompleted) {
        this.measurementsCompleted = measurementsCompleted;
    }


    /**
     * Gets the actionsCompleted value for this SimControlType.
     * 
     * @return actionsCompleted   * Sent from Concert to PTV via get when all actions have been
     * stored in the buffer and are ready to be read via get
     */
    public com.siemens.sitraffic.external.simulation.ActionsCompletedType getActionsCompleted() {
        return actionsCompleted;
    }


    /**
     * Sets the actionsCompleted value for this SimControlType.
     * 
     * @param actionsCompleted   * Sent from Concert to PTV via get when all actions have been
     * stored in the buffer and are ready to be read via get
     */
    public void setActionsCompleted(com.siemens.sitraffic.external.simulation.ActionsCompletedType actionsCompleted) {
        this.actionsCompleted = actionsCompleted;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SimControlType)) return false;
        SimControlType other = (SimControlType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.measurementsCompleted==null && other.getMeasurementsCompleted()==null) || 
             (this.measurementsCompleted!=null &&
              this.measurementsCompleted.equals(other.getMeasurementsCompleted()))) &&
            ((this.actionsCompleted==null && other.getActionsCompleted()==null) || 
             (this.actionsCompleted!=null &&
              this.actionsCompleted.equals(other.getActionsCompleted())));
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
        if (getMeasurementsCompleted() != null) {
            _hashCode += getMeasurementsCompleted().hashCode();
        }
        if (getActionsCompleted() != null) {
            _hashCode += getActionsCompleted().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
