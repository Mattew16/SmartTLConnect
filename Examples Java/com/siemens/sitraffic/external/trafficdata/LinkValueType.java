/**
 * LinkValueType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.trafficdata;

public class LinkValueType  implements java.io.Serializable {
    /* Freifahrgeschwindigkeiten (km/h) */
    private java.lang.Integer vMax;

    /* Kapazität (Fzg/h) */
    private java.lang.Integer qMax;

    /* Geschwindigkeit (km/h) */
    private java.lang.Integer vVeh;

    /* Verkehrsstärke (Fzg/h) */
    private java.lang.Integer qVeh;

    /* Dichte (Fzg/km) */
    private java.lang.Integer dVeh;

    /* Zuverlässigkeit */
    private java.lang.Integer acc;

    /* Reisezeit (in s) */
    private java.lang.Integer travelTime;

    /* normierte Reisezeit (in s/m) */
    private java.lang.Integer normalizedTravelTime;

    /* Verkehrslage */
    private java.lang.Integer los;

    /* Rückstaulänge Anzahl Fahrzeuge */
    private java.lang.Integer congestion;

    /* Any additional information or additional values in any format,
     * e.g. comma separated values or XML format */
    private java.lang.String info;

    public LinkValueType() {
    }

    public LinkValueType(
           java.lang.Integer vMax,
           java.lang.Integer qMax,
           java.lang.Integer vVeh,
           java.lang.Integer qVeh,
           java.lang.Integer dVeh,
           java.lang.Integer acc,
           java.lang.Integer travelTime,
           java.lang.Integer normalizedTravelTime,
           java.lang.Integer los,
           java.lang.Integer congestion,
           java.lang.String info) {
           this.vMax = vMax;
           this.qMax = qMax;
           this.vVeh = vVeh;
           this.qVeh = qVeh;
           this.dVeh = dVeh;
           this.acc = acc;
           this.travelTime = travelTime;
           this.normalizedTravelTime = normalizedTravelTime;
           this.los = los;
           this.congestion = congestion;
           this.info = info;
    }


    /**
     * Gets the vMax value for this LinkValueType.
     * 
     * @return vMax   * Freifahrgeschwindigkeiten (km/h)
     */
    public java.lang.Integer getVMax() {
        return vMax;
    }


    /**
     * Sets the vMax value for this LinkValueType.
     * 
     * @param vMax   * Freifahrgeschwindigkeiten (km/h)
     */
    public void setVMax(java.lang.Integer vMax) {
        this.vMax = vMax;
    }


    /**
     * Gets the qMax value for this LinkValueType.
     * 
     * @return qMax   * Kapazität (Fzg/h)
     */
    public java.lang.Integer getQMax() {
        return qMax;
    }


    /**
     * Sets the qMax value for this LinkValueType.
     * 
     * @param qMax   * Kapazität (Fzg/h)
     */
    public void setQMax(java.lang.Integer qMax) {
        this.qMax = qMax;
    }


    /**
     * Gets the vVeh value for this LinkValueType.
     * 
     * @return vVeh   * Geschwindigkeit (km/h)
     */
    public java.lang.Integer getVVeh() {
        return vVeh;
    }


    /**
     * Sets the vVeh value for this LinkValueType.
     * 
     * @param vVeh   * Geschwindigkeit (km/h)
     */
    public void setVVeh(java.lang.Integer vVeh) {
        this.vVeh = vVeh;
    }


    /**
     * Gets the qVeh value for this LinkValueType.
     * 
     * @return qVeh   * Verkehrsstärke (Fzg/h)
     */
    public java.lang.Integer getQVeh() {
        return qVeh;
    }


    /**
     * Sets the qVeh value for this LinkValueType.
     * 
     * @param qVeh   * Verkehrsstärke (Fzg/h)
     */
    public void setQVeh(java.lang.Integer qVeh) {
        this.qVeh = qVeh;
    }


    /**
     * Gets the dVeh value for this LinkValueType.
     * 
     * @return dVeh   * Dichte (Fzg/km)
     */
    public java.lang.Integer getDVeh() {
        return dVeh;
    }


    /**
     * Sets the dVeh value for this LinkValueType.
     * 
     * @param dVeh   * Dichte (Fzg/km)
     */
    public void setDVeh(java.lang.Integer dVeh) {
        this.dVeh = dVeh;
    }


    /**
     * Gets the acc value for this LinkValueType.
     * 
     * @return acc   * Zuverlässigkeit
     */
    public java.lang.Integer getAcc() {
        return acc;
    }


    /**
     * Sets the acc value for this LinkValueType.
     * 
     * @param acc   * Zuverlässigkeit
     */
    public void setAcc(java.lang.Integer acc) {
        this.acc = acc;
    }


    /**
     * Gets the travelTime value for this LinkValueType.
     * 
     * @return travelTime   * Reisezeit (in s)
     */
    public java.lang.Integer getTravelTime() {
        return travelTime;
    }


    /**
     * Sets the travelTime value for this LinkValueType.
     * 
     * @param travelTime   * Reisezeit (in s)
     */
    public void setTravelTime(java.lang.Integer travelTime) {
        this.travelTime = travelTime;
    }


    /**
     * Gets the normalizedTravelTime value for this LinkValueType.
     * 
     * @return normalizedTravelTime   * normierte Reisezeit (in s/m)
     */
    public java.lang.Integer getNormalizedTravelTime() {
        return normalizedTravelTime;
    }


    /**
     * Sets the normalizedTravelTime value for this LinkValueType.
     * 
     * @param normalizedTravelTime   * normierte Reisezeit (in s/m)
     */
    public void setNormalizedTravelTime(java.lang.Integer normalizedTravelTime) {
        this.normalizedTravelTime = normalizedTravelTime;
    }


    /**
     * Gets the los value for this LinkValueType.
     * 
     * @return los   * Verkehrslage
     */
    public java.lang.Integer getLos() {
        return los;
    }


    /**
     * Sets the los value for this LinkValueType.
     * 
     * @param los   * Verkehrslage
     */
    public void setLos(java.lang.Integer los) {
        this.los = los;
    }


    /**
     * Gets the congestion value for this LinkValueType.
     * 
     * @return congestion   * Rückstaulänge Anzahl Fahrzeuge
     */
    public java.lang.Integer getCongestion() {
        return congestion;
    }


    /**
     * Sets the congestion value for this LinkValueType.
     * 
     * @param congestion   * Rückstaulänge Anzahl Fahrzeuge
     */
    public void setCongestion(java.lang.Integer congestion) {
        this.congestion = congestion;
    }


    /**
     * Gets the info value for this LinkValueType.
     * 
     * @return info   * Any additional information or additional values in any format,
     * e.g. comma separated values or XML format
     */
    public java.lang.String getInfo() {
        return info;
    }


    /**
     * Sets the info value for this LinkValueType.
     * 
     * @param info   * Any additional information or additional values in any format,
     * e.g. comma separated values or XML format
     */
    public void setInfo(java.lang.String info) {
        this.info = info;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LinkValueType)) return false;
        LinkValueType other = (LinkValueType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vMax==null && other.getVMax()==null) || 
             (this.vMax!=null &&
              this.vMax.equals(other.getVMax()))) &&
            ((this.qMax==null && other.getQMax()==null) || 
             (this.qMax!=null &&
              this.qMax.equals(other.getQMax()))) &&
            ((this.vVeh==null && other.getVVeh()==null) || 
             (this.vVeh!=null &&
              this.vVeh.equals(other.getVVeh()))) &&
            ((this.qVeh==null && other.getQVeh()==null) || 
             (this.qVeh!=null &&
              this.qVeh.equals(other.getQVeh()))) &&
            ((this.dVeh==null && other.getDVeh()==null) || 
             (this.dVeh!=null &&
              this.dVeh.equals(other.getDVeh()))) &&
            ((this.acc==null && other.getAcc()==null) || 
             (this.acc!=null &&
              this.acc.equals(other.getAcc()))) &&
            ((this.travelTime==null && other.getTravelTime()==null) || 
             (this.travelTime!=null &&
              this.travelTime.equals(other.getTravelTime()))) &&
            ((this.normalizedTravelTime==null && other.getNormalizedTravelTime()==null) || 
             (this.normalizedTravelTime!=null &&
              this.normalizedTravelTime.equals(other.getNormalizedTravelTime()))) &&
            ((this.los==null && other.getLos()==null) || 
             (this.los!=null &&
              this.los.equals(other.getLos()))) &&
            ((this.congestion==null && other.getCongestion()==null) || 
             (this.congestion!=null &&
              this.congestion.equals(other.getCongestion()))) &&
            ((this.info==null && other.getInfo()==null) || 
             (this.info!=null &&
              this.info.equals(other.getInfo())));
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
        if (getVMax() != null) {
            _hashCode += getVMax().hashCode();
        }
        if (getQMax() != null) {
            _hashCode += getQMax().hashCode();
        }
        if (getVVeh() != null) {
            _hashCode += getVVeh().hashCode();
        }
        if (getQVeh() != null) {
            _hashCode += getQVeh().hashCode();
        }
        if (getDVeh() != null) {
            _hashCode += getDVeh().hashCode();
        }
        if (getAcc() != null) {
            _hashCode += getAcc().hashCode();
        }
        if (getTravelTime() != null) {
            _hashCode += getTravelTime().hashCode();
        }
        if (getNormalizedTravelTime() != null) {
            _hashCode += getNormalizedTravelTime().hashCode();
        }
        if (getLos() != null) {
            _hashCode += getLos().hashCode();
        }
        if (getCongestion() != null) {
            _hashCode += getCongestion().hashCode();
        }
        if (getInfo() != null) {
            _hashCode += getInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
