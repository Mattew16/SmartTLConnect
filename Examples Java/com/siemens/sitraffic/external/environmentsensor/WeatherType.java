/**
 * WeatherType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.environmentsensor;

public class WeatherType  implements java.io.Serializable {
    /* Niederschlag */
    private com.siemens.sitraffic.external.environmentsensor.WeatherTypePrecipitation precipitation;

    /* Temperatur */
    private com.siemens.sitraffic.external.environmentsensor.WeatherTypeTemperatur temperatur;

    /* Wind */
    private com.siemens.sitraffic.external.environmentsensor.WeatherTypeWind wind;

    /* relative Luftfeuchte TLS:RLF [%] */
    private java.lang.Integer humidity;

    /* Luftdruck TLS:LD [hPa] */
    private java.lang.Integer barometricPressure;

    /* Sonnenaufgang */
    private org.apache.axis.types.Time sunrise;

    /* Sonnenuntergang */
    private org.apache.axis.types.Time sunset;

    /* Sichtweite TLS:SW [m] */
    private java.lang.Integer visibility;

    /* Helligkeit TLS:HK [Lx] */
    private java.lang.Integer lightness;

    /* Zustand der Fahrbahnoberfläche TLS:FBZ */
    private com.siemens.sitraffic.external.environmentsensor.WeatherTypeStateOfLane stateOfLane;

    /* Wasserfilmdicke TLS:WFD [mm] */
    private java.lang.Double laneWetness;

    /* Schneehoehe TLS:SH [cm] */
    private java.lang.Integer snowHight;

    /* Restsalzgehalt TLS:RS [%] */
    private java.lang.Integer salt;

    /* Additional Information as text */
    private java.lang.String textInfo;

    /* Strahlungsbilanz */
    private java.lang.Short sunIntensity;

    /* Bewölkungsgrad */
    private java.lang.Short cloudDegree;

    public WeatherType() {
    }

    public WeatherType(
           com.siemens.sitraffic.external.environmentsensor.WeatherTypePrecipitation precipitation,
           com.siemens.sitraffic.external.environmentsensor.WeatherTypeTemperatur temperatur,
           com.siemens.sitraffic.external.environmentsensor.WeatherTypeWind wind,
           java.lang.Integer humidity,
           java.lang.Integer barometricPressure,
           org.apache.axis.types.Time sunrise,
           org.apache.axis.types.Time sunset,
           java.lang.Integer visibility,
           java.lang.Integer lightness,
           com.siemens.sitraffic.external.environmentsensor.WeatherTypeStateOfLane stateOfLane,
           java.lang.Double laneWetness,
           java.lang.Integer snowHight,
           java.lang.Integer salt,
           java.lang.String textInfo,
           java.lang.Short sunIntensity,
           java.lang.Short cloudDegree) {
           this.precipitation = precipitation;
           this.temperatur = temperatur;
           this.wind = wind;
           this.humidity = humidity;
           this.barometricPressure = barometricPressure;
           this.sunrise = sunrise;
           this.sunset = sunset;
           this.visibility = visibility;
           this.lightness = lightness;
           this.stateOfLane = stateOfLane;
           this.laneWetness = laneWetness;
           this.snowHight = snowHight;
           this.salt = salt;
           this.textInfo = textInfo;
           this.sunIntensity = sunIntensity;
           this.cloudDegree = cloudDegree;
    }


    /**
     * Gets the precipitation value for this WeatherType.
     * 
     * @return precipitation   * Niederschlag
     */
    public com.siemens.sitraffic.external.environmentsensor.WeatherTypePrecipitation getPrecipitation() {
        return precipitation;
    }


    /**
     * Sets the precipitation value for this WeatherType.
     * 
     * @param precipitation   * Niederschlag
     */
    public void setPrecipitation(com.siemens.sitraffic.external.environmentsensor.WeatherTypePrecipitation precipitation) {
        this.precipitation = precipitation;
    }


    /**
     * Gets the temperatur value for this WeatherType.
     * 
     * @return temperatur   * Temperatur
     */
    public com.siemens.sitraffic.external.environmentsensor.WeatherTypeTemperatur getTemperatur() {
        return temperatur;
    }


    /**
     * Sets the temperatur value for this WeatherType.
     * 
     * @param temperatur   * Temperatur
     */
    public void setTemperatur(com.siemens.sitraffic.external.environmentsensor.WeatherTypeTemperatur temperatur) {
        this.temperatur = temperatur;
    }


    /**
     * Gets the wind value for this WeatherType.
     * 
     * @return wind   * Wind
     */
    public com.siemens.sitraffic.external.environmentsensor.WeatherTypeWind getWind() {
        return wind;
    }


    /**
     * Sets the wind value for this WeatherType.
     * 
     * @param wind   * Wind
     */
    public void setWind(com.siemens.sitraffic.external.environmentsensor.WeatherTypeWind wind) {
        this.wind = wind;
    }


    /**
     * Gets the humidity value for this WeatherType.
     * 
     * @return humidity   * relative Luftfeuchte TLS:RLF [%]
     */
    public java.lang.Integer getHumidity() {
        return humidity;
    }


    /**
     * Sets the humidity value for this WeatherType.
     * 
     * @param humidity   * relative Luftfeuchte TLS:RLF [%]
     */
    public void setHumidity(java.lang.Integer humidity) {
        this.humidity = humidity;
    }


    /**
     * Gets the barometricPressure value for this WeatherType.
     * 
     * @return barometricPressure   * Luftdruck TLS:LD [hPa]
     */
    public java.lang.Integer getBarometricPressure() {
        return barometricPressure;
    }


    /**
     * Sets the barometricPressure value for this WeatherType.
     * 
     * @param barometricPressure   * Luftdruck TLS:LD [hPa]
     */
    public void setBarometricPressure(java.lang.Integer barometricPressure) {
        this.barometricPressure = barometricPressure;
    }


    /**
     * Gets the sunrise value for this WeatherType.
     * 
     * @return sunrise   * Sonnenaufgang
     */
    public org.apache.axis.types.Time getSunrise() {
        return sunrise;
    }


    /**
     * Sets the sunrise value for this WeatherType.
     * 
     * @param sunrise   * Sonnenaufgang
     */
    public void setSunrise(org.apache.axis.types.Time sunrise) {
        this.sunrise = sunrise;
    }


    /**
     * Gets the sunset value for this WeatherType.
     * 
     * @return sunset   * Sonnenuntergang
     */
    public org.apache.axis.types.Time getSunset() {
        return sunset;
    }


    /**
     * Sets the sunset value for this WeatherType.
     * 
     * @param sunset   * Sonnenuntergang
     */
    public void setSunset(org.apache.axis.types.Time sunset) {
        this.sunset = sunset;
    }


    /**
     * Gets the visibility value for this WeatherType.
     * 
     * @return visibility   * Sichtweite TLS:SW [m]
     */
    public java.lang.Integer getVisibility() {
        return visibility;
    }


    /**
     * Sets the visibility value for this WeatherType.
     * 
     * @param visibility   * Sichtweite TLS:SW [m]
     */
    public void setVisibility(java.lang.Integer visibility) {
        this.visibility = visibility;
    }


    /**
     * Gets the lightness value for this WeatherType.
     * 
     * @return lightness   * Helligkeit TLS:HK [Lx]
     */
    public java.lang.Integer getLightness() {
        return lightness;
    }


    /**
     * Sets the lightness value for this WeatherType.
     * 
     * @param lightness   * Helligkeit TLS:HK [Lx]
     */
    public void setLightness(java.lang.Integer lightness) {
        this.lightness = lightness;
    }


    /**
     * Gets the stateOfLane value for this WeatherType.
     * 
     * @return stateOfLane   * Zustand der Fahrbahnoberfläche TLS:FBZ
     */
    public com.siemens.sitraffic.external.environmentsensor.WeatherTypeStateOfLane getStateOfLane() {
        return stateOfLane;
    }


    /**
     * Sets the stateOfLane value for this WeatherType.
     * 
     * @param stateOfLane   * Zustand der Fahrbahnoberfläche TLS:FBZ
     */
    public void setStateOfLane(com.siemens.sitraffic.external.environmentsensor.WeatherTypeStateOfLane stateOfLane) {
        this.stateOfLane = stateOfLane;
    }


    /**
     * Gets the laneWetness value for this WeatherType.
     * 
     * @return laneWetness   * Wasserfilmdicke TLS:WFD [mm]
     */
    public java.lang.Double getLaneWetness() {
        return laneWetness;
    }


    /**
     * Sets the laneWetness value for this WeatherType.
     * 
     * @param laneWetness   * Wasserfilmdicke TLS:WFD [mm]
     */
    public void setLaneWetness(java.lang.Double laneWetness) {
        this.laneWetness = laneWetness;
    }


    /**
     * Gets the snowHight value for this WeatherType.
     * 
     * @return snowHight   * Schneehoehe TLS:SH [cm]
     */
    public java.lang.Integer getSnowHight() {
        return snowHight;
    }


    /**
     * Sets the snowHight value for this WeatherType.
     * 
     * @param snowHight   * Schneehoehe TLS:SH [cm]
     */
    public void setSnowHight(java.lang.Integer snowHight) {
        this.snowHight = snowHight;
    }


    /**
     * Gets the salt value for this WeatherType.
     * 
     * @return salt   * Restsalzgehalt TLS:RS [%]
     */
    public java.lang.Integer getSalt() {
        return salt;
    }


    /**
     * Sets the salt value for this WeatherType.
     * 
     * @param salt   * Restsalzgehalt TLS:RS [%]
     */
    public void setSalt(java.lang.Integer salt) {
        this.salt = salt;
    }


    /**
     * Gets the textInfo value for this WeatherType.
     * 
     * @return textInfo   * Additional Information as text
     */
    public java.lang.String getTextInfo() {
        return textInfo;
    }


    /**
     * Sets the textInfo value for this WeatherType.
     * 
     * @param textInfo   * Additional Information as text
     */
    public void setTextInfo(java.lang.String textInfo) {
        this.textInfo = textInfo;
    }


    /**
     * Gets the sunIntensity value for this WeatherType.
     * 
     * @return sunIntensity   * Strahlungsbilanz
     */
    public java.lang.Short getSunIntensity() {
        return sunIntensity;
    }


    /**
     * Sets the sunIntensity value for this WeatherType.
     * 
     * @param sunIntensity   * Strahlungsbilanz
     */
    public void setSunIntensity(java.lang.Short sunIntensity) {
        this.sunIntensity = sunIntensity;
    }


    /**
     * Gets the cloudDegree value for this WeatherType.
     * 
     * @return cloudDegree   * Bewölkungsgrad
     */
    public java.lang.Short getCloudDegree() {
        return cloudDegree;
    }


    /**
     * Sets the cloudDegree value for this WeatherType.
     * 
     * @param cloudDegree   * Bewölkungsgrad
     */
    public void setCloudDegree(java.lang.Short cloudDegree) {
        this.cloudDegree = cloudDegree;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WeatherType)) return false;
        WeatherType other = (WeatherType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.precipitation==null && other.getPrecipitation()==null) || 
             (this.precipitation!=null &&
              this.precipitation.equals(other.getPrecipitation()))) &&
            ((this.temperatur==null && other.getTemperatur()==null) || 
             (this.temperatur!=null &&
              this.temperatur.equals(other.getTemperatur()))) &&
            ((this.wind==null && other.getWind()==null) || 
             (this.wind!=null &&
              this.wind.equals(other.getWind()))) &&
            ((this.humidity==null && other.getHumidity()==null) || 
             (this.humidity!=null &&
              this.humidity.equals(other.getHumidity()))) &&
            ((this.barometricPressure==null && other.getBarometricPressure()==null) || 
             (this.barometricPressure!=null &&
              this.barometricPressure.equals(other.getBarometricPressure()))) &&
            ((this.sunrise==null && other.getSunrise()==null) || 
             (this.sunrise!=null &&
              this.sunrise.equals(other.getSunrise()))) &&
            ((this.sunset==null && other.getSunset()==null) || 
             (this.sunset!=null &&
              this.sunset.equals(other.getSunset()))) &&
            ((this.visibility==null && other.getVisibility()==null) || 
             (this.visibility!=null &&
              this.visibility.equals(other.getVisibility()))) &&
            ((this.lightness==null && other.getLightness()==null) || 
             (this.lightness!=null &&
              this.lightness.equals(other.getLightness()))) &&
            ((this.stateOfLane==null && other.getStateOfLane()==null) || 
             (this.stateOfLane!=null &&
              this.stateOfLane.equals(other.getStateOfLane()))) &&
            ((this.laneWetness==null && other.getLaneWetness()==null) || 
             (this.laneWetness!=null &&
              this.laneWetness.equals(other.getLaneWetness()))) &&
            ((this.snowHight==null && other.getSnowHight()==null) || 
             (this.snowHight!=null &&
              this.snowHight.equals(other.getSnowHight()))) &&
            ((this.salt==null && other.getSalt()==null) || 
             (this.salt!=null &&
              this.salt.equals(other.getSalt()))) &&
            ((this.textInfo==null && other.getTextInfo()==null) || 
             (this.textInfo!=null &&
              this.textInfo.equals(other.getTextInfo()))) &&
            ((this.sunIntensity==null && other.getSunIntensity()==null) || 
             (this.sunIntensity!=null &&
              this.sunIntensity.equals(other.getSunIntensity()))) &&
            ((this.cloudDegree==null && other.getCloudDegree()==null) || 
             (this.cloudDegree!=null &&
              this.cloudDegree.equals(other.getCloudDegree())));
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
        if (getPrecipitation() != null) {
            _hashCode += getPrecipitation().hashCode();
        }
        if (getTemperatur() != null) {
            _hashCode += getTemperatur().hashCode();
        }
        if (getWind() != null) {
            _hashCode += getWind().hashCode();
        }
        if (getHumidity() != null) {
            _hashCode += getHumidity().hashCode();
        }
        if (getBarometricPressure() != null) {
            _hashCode += getBarometricPressure().hashCode();
        }
        if (getSunrise() != null) {
            _hashCode += getSunrise().hashCode();
        }
        if (getSunset() != null) {
            _hashCode += getSunset().hashCode();
        }
        if (getVisibility() != null) {
            _hashCode += getVisibility().hashCode();
        }
        if (getLightness() != null) {
            _hashCode += getLightness().hashCode();
        }
        if (getStateOfLane() != null) {
            _hashCode += getStateOfLane().hashCode();
        }
        if (getLaneWetness() != null) {
            _hashCode += getLaneWetness().hashCode();
        }
        if (getSnowHight() != null) {
            _hashCode += getSnowHight().hashCode();
        }
        if (getSalt() != null) {
            _hashCode += getSalt().hashCode();
        }
        if (getTextInfo() != null) {
            _hashCode += getTextInfo().hashCode();
        }
        if (getSunIntensity() != null) {
            _hashCode += getSunIntensity().hashCode();
        }
        if (getCloudDegree() != null) {
            _hashCode += getCloudDegree().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
