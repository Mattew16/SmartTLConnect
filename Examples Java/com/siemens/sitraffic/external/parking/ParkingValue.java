/**
 * ParkingValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.parking;

public class ParkingValue  implements java.io.Serializable {
    /* parking occupancy (related t the type) */
    private java.lang.Integer occupancy;

    /* 0 or null - currentValue, other - prediction interval (ms) */
    private java.lang.Integer predictionInterval;

    /* total capacity related to type */
    private com.siemens.sitraffic.external.parking.ParkingValueCapacity capacity;

    /* tendency of occupancy */
    private com.siemens.sitraffic.external.parking.ParkingValueTrend trend;

    /* entered vehicles within last interval  min */
    private com.siemens.sitraffic.external.parking.ParkingValueDriveIn driveIn;

    /* left vehicles within the last interval min */
    private com.siemens.sitraffic.external.parking.ParkingValueDriveOut driveOut;

    /* parking type */
    private com.siemens.sitraffic.external.parking.ParkingValueType type;

    private java.lang.Integer placesManaged;

    public ParkingValue() {
    }

    public ParkingValue(
           java.lang.Integer occupancy,
           java.lang.Integer predictionInterval,
           com.siemens.sitraffic.external.parking.ParkingValueCapacity capacity,
           com.siemens.sitraffic.external.parking.ParkingValueTrend trend,
           com.siemens.sitraffic.external.parking.ParkingValueDriveIn driveIn,
           com.siemens.sitraffic.external.parking.ParkingValueDriveOut driveOut,
           com.siemens.sitraffic.external.parking.ParkingValueType type,
           java.lang.Integer placesManaged) {
           this.occupancy = occupancy;
           this.predictionInterval = predictionInterval;
           this.capacity = capacity;
           this.trend = trend;
           this.driveIn = driveIn;
           this.driveOut = driveOut;
           this.type = type;
           this.placesManaged = placesManaged;
    }


    /**
     * Gets the occupancy value for this ParkingValue.
     * 
     * @return occupancy   * parking occupancy (related t the type)
     */
    public java.lang.Integer getOccupancy() {
        return occupancy;
    }


    /**
     * Sets the occupancy value for this ParkingValue.
     * 
     * @param occupancy   * parking occupancy (related t the type)
     */
    public void setOccupancy(java.lang.Integer occupancy) {
        this.occupancy = occupancy;
    }


    /**
     * Gets the predictionInterval value for this ParkingValue.
     * 
     * @return predictionInterval   * 0 or null - currentValue, other - prediction interval (ms)
     */
    public java.lang.Integer getPredictionInterval() {
        return predictionInterval;
    }


    /**
     * Sets the predictionInterval value for this ParkingValue.
     * 
     * @param predictionInterval   * 0 or null - currentValue, other - prediction interval (ms)
     */
    public void setPredictionInterval(java.lang.Integer predictionInterval) {
        this.predictionInterval = predictionInterval;
    }


    /**
     * Gets the capacity value for this ParkingValue.
     * 
     * @return capacity   * total capacity related to type
     */
    public com.siemens.sitraffic.external.parking.ParkingValueCapacity getCapacity() {
        return capacity;
    }


    /**
     * Sets the capacity value for this ParkingValue.
     * 
     * @param capacity   * total capacity related to type
     */
    public void setCapacity(com.siemens.sitraffic.external.parking.ParkingValueCapacity capacity) {
        this.capacity = capacity;
    }


    /**
     * Gets the trend value for this ParkingValue.
     * 
     * @return trend   * tendency of occupancy
     */
    public com.siemens.sitraffic.external.parking.ParkingValueTrend getTrend() {
        return trend;
    }


    /**
     * Sets the trend value for this ParkingValue.
     * 
     * @param trend   * tendency of occupancy
     */
    public void setTrend(com.siemens.sitraffic.external.parking.ParkingValueTrend trend) {
        this.trend = trend;
    }


    /**
     * Gets the driveIn value for this ParkingValue.
     * 
     * @return driveIn   * entered vehicles within last interval  min
     */
    public com.siemens.sitraffic.external.parking.ParkingValueDriveIn getDriveIn() {
        return driveIn;
    }


    /**
     * Sets the driveIn value for this ParkingValue.
     * 
     * @param driveIn   * entered vehicles within last interval  min
     */
    public void setDriveIn(com.siemens.sitraffic.external.parking.ParkingValueDriveIn driveIn) {
        this.driveIn = driveIn;
    }


    /**
     * Gets the driveOut value for this ParkingValue.
     * 
     * @return driveOut   * left vehicles within the last interval min
     */
    public com.siemens.sitraffic.external.parking.ParkingValueDriveOut getDriveOut() {
        return driveOut;
    }


    /**
     * Sets the driveOut value for this ParkingValue.
     * 
     * @param driveOut   * left vehicles within the last interval min
     */
    public void setDriveOut(com.siemens.sitraffic.external.parking.ParkingValueDriveOut driveOut) {
        this.driveOut = driveOut;
    }


    /**
     * Gets the type value for this ParkingValue.
     * 
     * @return type   * parking type
     */
    public com.siemens.sitraffic.external.parking.ParkingValueType getType() {
        return type;
    }


    /**
     * Sets the type value for this ParkingValue.
     * 
     * @param type   * parking type
     */
    public void setType(com.siemens.sitraffic.external.parking.ParkingValueType type) {
        this.type = type;
    }


    /**
     * Gets the placesManaged value for this ParkingValue.
     * 
     * @return placesManaged
     */
    public java.lang.Integer getPlacesManaged() {
        return placesManaged;
    }


    /**
     * Sets the placesManaged value for this ParkingValue.
     * 
     * @param placesManaged
     */
    public void setPlacesManaged(java.lang.Integer placesManaged) {
        this.placesManaged = placesManaged;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParkingValue)) return false;
        ParkingValue other = (ParkingValue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.occupancy==null && other.getOccupancy()==null) || 
             (this.occupancy!=null &&
              this.occupancy.equals(other.getOccupancy()))) &&
            ((this.predictionInterval==null && other.getPredictionInterval()==null) || 
             (this.predictionInterval!=null &&
              this.predictionInterval.equals(other.getPredictionInterval()))) &&
            ((this.capacity==null && other.getCapacity()==null) || 
             (this.capacity!=null &&
              this.capacity.equals(other.getCapacity()))) &&
            ((this.trend==null && other.getTrend()==null) || 
             (this.trend!=null &&
              this.trend.equals(other.getTrend()))) &&
            ((this.driveIn==null && other.getDriveIn()==null) || 
             (this.driveIn!=null &&
              this.driveIn.equals(other.getDriveIn()))) &&
            ((this.driveOut==null && other.getDriveOut()==null) || 
             (this.driveOut!=null &&
              this.driveOut.equals(other.getDriveOut()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.placesManaged==null && other.getPlacesManaged()==null) || 
             (this.placesManaged!=null &&
              this.placesManaged.equals(other.getPlacesManaged())));
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
        if (getOccupancy() != null) {
            _hashCode += getOccupancy().hashCode();
        }
        if (getPredictionInterval() != null) {
            _hashCode += getPredictionInterval().hashCode();
        }
        if (getCapacity() != null) {
            _hashCode += getCapacity().hashCode();
        }
        if (getTrend() != null) {
            _hashCode += getTrend().hashCode();
        }
        if (getDriveIn() != null) {
            _hashCode += getDriveIn().hashCode();
        }
        if (getDriveOut() != null) {
            _hashCode += getDriveOut().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getPlacesManaged() != null) {
            _hashCode += getPlacesManaged().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
