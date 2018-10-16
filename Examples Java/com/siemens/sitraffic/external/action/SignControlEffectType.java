/**
 * SignControlEffectType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.action;

public class SignControlEffectType  implements java.io.Serializable {
    /* Umlaufzeit in Sekunden */
    private int circulationTime;

    private com.siemens.sitraffic.external.action.SignControlEffectTypeTurnGreenTime[] turnGreenTime;

    public SignControlEffectType() {
    }

    public SignControlEffectType(
           int circulationTime,
           com.siemens.sitraffic.external.action.SignControlEffectTypeTurnGreenTime[] turnGreenTime) {
           this.circulationTime = circulationTime;
           this.turnGreenTime = turnGreenTime;
    }


    /**
     * Gets the circulationTime value for this SignControlEffectType.
     * 
     * @return circulationTime   * Umlaufzeit in Sekunden
     */
    public int getCirculationTime() {
        return circulationTime;
    }


    /**
     * Sets the circulationTime value for this SignControlEffectType.
     * 
     * @param circulationTime   * Umlaufzeit in Sekunden
     */
    public void setCirculationTime(int circulationTime) {
        this.circulationTime = circulationTime;
    }


    /**
     * Gets the turnGreenTime value for this SignControlEffectType.
     * 
     * @return turnGreenTime
     */
    public com.siemens.sitraffic.external.action.SignControlEffectTypeTurnGreenTime[] getTurnGreenTime() {
        return turnGreenTime;
    }


    /**
     * Sets the turnGreenTime value for this SignControlEffectType.
     * 
     * @param turnGreenTime
     */
    public void setTurnGreenTime(com.siemens.sitraffic.external.action.SignControlEffectTypeTurnGreenTime[] turnGreenTime) {
        this.turnGreenTime = turnGreenTime;
    }

    public com.siemens.sitraffic.external.action.SignControlEffectTypeTurnGreenTime getTurnGreenTime(int i) {
        return this.turnGreenTime[i];
    }

    public void setTurnGreenTime(int i, com.siemens.sitraffic.external.action.SignControlEffectTypeTurnGreenTime _value) {
        this.turnGreenTime[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SignControlEffectType)) return false;
        SignControlEffectType other = (SignControlEffectType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.circulationTime == other.getCirculationTime() &&
            ((this.turnGreenTime==null && other.getTurnGreenTime()==null) || 
             (this.turnGreenTime!=null &&
              java.util.Arrays.equals(this.turnGreenTime, other.getTurnGreenTime())));
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
        _hashCode += getCirculationTime();
        if (getTurnGreenTime() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTurnGreenTime());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTurnGreenTime(), i);
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
