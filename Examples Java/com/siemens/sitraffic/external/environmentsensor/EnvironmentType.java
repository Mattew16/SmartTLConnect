/**
 * EnvironmentType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.environmentsensor;

public class EnvironmentType  implements java.io.Serializable {
    /* Ozongehalt [ug/m3] */
    private java.lang.Double o3;

    /* Schwefeloxidegehalt [ug/m3] */
    private java.lang.Double SOx;

    /* Stickoxidegehalt [ug/m3] */
    private java.lang.Double NOx;

    /* Stickstoffdioxidegehalt [ug/m3] */
    private java.lang.Double NO2;

    /* Nitrogen monoxide [μg/m³] */
    private java.lang.Double NO;

    /* Kohlenmonoxidgehalt [ug/m3] */
    private java.lang.Double CO;

    /* Kohlendioxidgehalt [ug/m3] */
    private java.lang.Double CO2;

    /* Staubgehalt [ug/m3] */
    private java.lang.Double dust;

    /* Additional Information as text */
    private java.lang.String textInfo;

    /* Benzolgehalt [ug/m3] */
    private java.lang.Double benzene;

    /* Rußgehalt [ug/m3] */
    private java.lang.Double c_pm;

    /* PM10 */
    private java.lang.Double PM10;

    /* PM2,5 */
    private java.lang.Double PM25;

    /* noise [dB] */
    private java.lang.Double noise;

    public EnvironmentType() {
    }

    public EnvironmentType(
           java.lang.Double o3,
           java.lang.Double SOx,
           java.lang.Double NOx,
           java.lang.Double NO2,
           java.lang.Double NO,
           java.lang.Double CO,
           java.lang.Double CO2,
           java.lang.Double dust,
           java.lang.String textInfo,
           java.lang.Double benzene,
           java.lang.Double c_pm,
           java.lang.Double PM10,
           java.lang.Double PM25,
           java.lang.Double noise) {
           this.o3 = o3;
           this.SOx = SOx;
           this.NOx = NOx;
           this.NO2 = NO2;
           this.NO = NO;
           this.CO = CO;
           this.CO2 = CO2;
           this.dust = dust;
           this.textInfo = textInfo;
           this.benzene = benzene;
           this.c_pm = c_pm;
           this.PM10 = PM10;
           this.PM25 = PM25;
           this.noise = noise;
    }


    /**
     * Gets the o3 value for this EnvironmentType.
     * 
     * @return o3   * Ozongehalt [ug/m3]
     */
    public java.lang.Double getO3() {
        return o3;
    }


    /**
     * Sets the o3 value for this EnvironmentType.
     * 
     * @param o3   * Ozongehalt [ug/m3]
     */
    public void setO3(java.lang.Double o3) {
        this.o3 = o3;
    }


    /**
     * Gets the SOx value for this EnvironmentType.
     * 
     * @return SOx   * Schwefeloxidegehalt [ug/m3]
     */
    public java.lang.Double getSOx() {
        return SOx;
    }


    /**
     * Sets the SOx value for this EnvironmentType.
     * 
     * @param SOx   * Schwefeloxidegehalt [ug/m3]
     */
    public void setSOx(java.lang.Double SOx) {
        this.SOx = SOx;
    }


    /**
     * Gets the NOx value for this EnvironmentType.
     * 
     * @return NOx   * Stickoxidegehalt [ug/m3]
     */
    public java.lang.Double getNOx() {
        return NOx;
    }


    /**
     * Sets the NOx value for this EnvironmentType.
     * 
     * @param NOx   * Stickoxidegehalt [ug/m3]
     */
    public void setNOx(java.lang.Double NOx) {
        this.NOx = NOx;
    }


    /**
     * Gets the NO2 value for this EnvironmentType.
     * 
     * @return NO2   * Stickstoffdioxidegehalt [ug/m3]
     */
    public java.lang.Double getNO2() {
        return NO2;
    }


    /**
     * Sets the NO2 value for this EnvironmentType.
     * 
     * @param NO2   * Stickstoffdioxidegehalt [ug/m3]
     */
    public void setNO2(java.lang.Double NO2) {
        this.NO2 = NO2;
    }


    /**
     * Gets the NO value for this EnvironmentType.
     * 
     * @return NO   * Nitrogen monoxide [μg/m³]
     */
    public java.lang.Double getNO() {
        return NO;
    }


    /**
     * Sets the NO value for this EnvironmentType.
     * 
     * @param NO   * Nitrogen monoxide [μg/m³]
     */
    public void setNO(java.lang.Double NO) {
        this.NO = NO;
    }


    /**
     * Gets the CO value for this EnvironmentType.
     * 
     * @return CO   * Kohlenmonoxidgehalt [ug/m3]
     */
    public java.lang.Double getCO() {
        return CO;
    }


    /**
     * Sets the CO value for this EnvironmentType.
     * 
     * @param CO   * Kohlenmonoxidgehalt [ug/m3]
     */
    public void setCO(java.lang.Double CO) {
        this.CO = CO;
    }


    /**
     * Gets the CO2 value for this EnvironmentType.
     * 
     * @return CO2   * Kohlendioxidgehalt [ug/m3]
     */
    public java.lang.Double getCO2() {
        return CO2;
    }


    /**
     * Sets the CO2 value for this EnvironmentType.
     * 
     * @param CO2   * Kohlendioxidgehalt [ug/m3]
     */
    public void setCO2(java.lang.Double CO2) {
        this.CO2 = CO2;
    }


    /**
     * Gets the dust value for this EnvironmentType.
     * 
     * @return dust   * Staubgehalt [ug/m3]
     */
    public java.lang.Double getDust() {
        return dust;
    }


    /**
     * Sets the dust value for this EnvironmentType.
     * 
     * @param dust   * Staubgehalt [ug/m3]
     */
    public void setDust(java.lang.Double dust) {
        this.dust = dust;
    }


    /**
     * Gets the textInfo value for this EnvironmentType.
     * 
     * @return textInfo   * Additional Information as text
     */
    public java.lang.String getTextInfo() {
        return textInfo;
    }


    /**
     * Sets the textInfo value for this EnvironmentType.
     * 
     * @param textInfo   * Additional Information as text
     */
    public void setTextInfo(java.lang.String textInfo) {
        this.textInfo = textInfo;
    }


    /**
     * Gets the benzene value for this EnvironmentType.
     * 
     * @return benzene   * Benzolgehalt [ug/m3]
     */
    public java.lang.Double getBenzene() {
        return benzene;
    }


    /**
     * Sets the benzene value for this EnvironmentType.
     * 
     * @param benzene   * Benzolgehalt [ug/m3]
     */
    public void setBenzene(java.lang.Double benzene) {
        this.benzene = benzene;
    }


    /**
     * Gets the c_pm value for this EnvironmentType.
     * 
     * @return c_pm   * Rußgehalt [ug/m3]
     */
    public java.lang.Double getC_pm() {
        return c_pm;
    }


    /**
     * Sets the c_pm value for this EnvironmentType.
     * 
     * @param c_pm   * Rußgehalt [ug/m3]
     */
    public void setC_pm(java.lang.Double c_pm) {
        this.c_pm = c_pm;
    }


    /**
     * Gets the PM10 value for this EnvironmentType.
     * 
     * @return PM10   * PM10
     */
    public java.lang.Double getPM10() {
        return PM10;
    }


    /**
     * Sets the PM10 value for this EnvironmentType.
     * 
     * @param PM10   * PM10
     */
    public void setPM10(java.lang.Double PM10) {
        this.PM10 = PM10;
    }


    /**
     * Gets the PM25 value for this EnvironmentType.
     * 
     * @return PM25   * PM2,5
     */
    public java.lang.Double getPM25() {
        return PM25;
    }


    /**
     * Sets the PM25 value for this EnvironmentType.
     * 
     * @param PM25   * PM2,5
     */
    public void setPM25(java.lang.Double PM25) {
        this.PM25 = PM25;
    }


    /**
     * Gets the noise value for this EnvironmentType.
     * 
     * @return noise   * noise [dB]
     */
    public java.lang.Double getNoise() {
        return noise;
    }


    /**
     * Sets the noise value for this EnvironmentType.
     * 
     * @param noise   * noise [dB]
     */
    public void setNoise(java.lang.Double noise) {
        this.noise = noise;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnvironmentType)) return false;
        EnvironmentType other = (EnvironmentType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.o3==null && other.getO3()==null) || 
             (this.o3!=null &&
              this.o3.equals(other.getO3()))) &&
            ((this.SOx==null && other.getSOx()==null) || 
             (this.SOx!=null &&
              this.SOx.equals(other.getSOx()))) &&
            ((this.NOx==null && other.getNOx()==null) || 
             (this.NOx!=null &&
              this.NOx.equals(other.getNOx()))) &&
            ((this.NO2==null && other.getNO2()==null) || 
             (this.NO2!=null &&
              this.NO2.equals(other.getNO2()))) &&
            ((this.NO==null && other.getNO()==null) || 
             (this.NO!=null &&
              this.NO.equals(other.getNO()))) &&
            ((this.CO==null && other.getCO()==null) || 
             (this.CO!=null &&
              this.CO.equals(other.getCO()))) &&
            ((this.CO2==null && other.getCO2()==null) || 
             (this.CO2!=null &&
              this.CO2.equals(other.getCO2()))) &&
            ((this.dust==null && other.getDust()==null) || 
             (this.dust!=null &&
              this.dust.equals(other.getDust()))) &&
            ((this.textInfo==null && other.getTextInfo()==null) || 
             (this.textInfo!=null &&
              this.textInfo.equals(other.getTextInfo()))) &&
            ((this.benzene==null && other.getBenzene()==null) || 
             (this.benzene!=null &&
              this.benzene.equals(other.getBenzene()))) &&
            ((this.c_pm==null && other.getC_pm()==null) || 
             (this.c_pm!=null &&
              this.c_pm.equals(other.getC_pm()))) &&
            ((this.PM10==null && other.getPM10()==null) || 
             (this.PM10!=null &&
              this.PM10.equals(other.getPM10()))) &&
            ((this.PM25==null && other.getPM25()==null) || 
             (this.PM25!=null &&
              this.PM25.equals(other.getPM25()))) &&
            ((this.noise==null && other.getNoise()==null) || 
             (this.noise!=null &&
              this.noise.equals(other.getNoise())));
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
        if (getO3() != null) {
            _hashCode += getO3().hashCode();
        }
        if (getSOx() != null) {
            _hashCode += getSOx().hashCode();
        }
        if (getNOx() != null) {
            _hashCode += getNOx().hashCode();
        }
        if (getNO2() != null) {
            _hashCode += getNO2().hashCode();
        }
        if (getNO() != null) {
            _hashCode += getNO().hashCode();
        }
        if (getCO() != null) {
            _hashCode += getCO().hashCode();
        }
        if (getCO2() != null) {
            _hashCode += getCO2().hashCode();
        }
        if (getDust() != null) {
            _hashCode += getDust().hashCode();
        }
        if (getTextInfo() != null) {
            _hashCode += getTextInfo().hashCode();
        }
        if (getBenzene() != null) {
            _hashCode += getBenzene().hashCode();
        }
        if (getC_pm() != null) {
            _hashCode += getC_pm().hashCode();
        }
        if (getPM10() != null) {
            _hashCode += getPM10().hashCode();
        }
        if (getPM25() != null) {
            _hashCode += getPM25().hashCode();
        }
        if (getNoise() != null) {
            _hashCode += getNoise().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
