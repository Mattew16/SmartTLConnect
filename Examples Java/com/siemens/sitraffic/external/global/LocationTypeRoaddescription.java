/**
 * LocationTypeRoaddescription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.global;

public class LocationTypeRoaddescription  implements java.io.Serializable {
    /* road */
    private java.lang.String road;

    /* first crossroad */
    private java.lang.String from;

    /* further spec. of start */
    private java.lang.String nr_from;

    /* distance from */
    private java.lang.Short dist_from;

    /* last crossroad */
    private java.lang.String to;

    /* further spec. of end */
    private java.lang.String nr_to;

    /* distance to */
    private java.lang.Short dist_to;

    /* flag to indicate use of road description */
    private boolean rooadinfo;

    /* direction */
    private com.siemens.sitraffic.external.global.LocationTypeRoaddescriptionDirection direction;

    public LocationTypeRoaddescription() {
    }

    public LocationTypeRoaddescription(
           java.lang.String road,
           java.lang.String from,
           java.lang.String nr_from,
           java.lang.Short dist_from,
           java.lang.String to,
           java.lang.String nr_to,
           java.lang.Short dist_to,
           boolean rooadinfo,
           com.siemens.sitraffic.external.global.LocationTypeRoaddescriptionDirection direction) {
           this.road = road;
           this.from = from;
           this.nr_from = nr_from;
           this.dist_from = dist_from;
           this.to = to;
           this.nr_to = nr_to;
           this.dist_to = dist_to;
           this.rooadinfo = rooadinfo;
           this.direction = direction;
    }


    /**
     * Gets the road value for this LocationTypeRoaddescription.
     * 
     * @return road   * road
     */
    public java.lang.String getRoad() {
        return road;
    }


    /**
     * Sets the road value for this LocationTypeRoaddescription.
     * 
     * @param road   * road
     */
    public void setRoad(java.lang.String road) {
        this.road = road;
    }


    /**
     * Gets the from value for this LocationTypeRoaddescription.
     * 
     * @return from   * first crossroad
     */
    public java.lang.String getFrom() {
        return from;
    }


    /**
     * Sets the from value for this LocationTypeRoaddescription.
     * 
     * @param from   * first crossroad
     */
    public void setFrom(java.lang.String from) {
        this.from = from;
    }


    /**
     * Gets the nr_from value for this LocationTypeRoaddescription.
     * 
     * @return nr_from   * further spec. of start
     */
    public java.lang.String getNr_from() {
        return nr_from;
    }


    /**
     * Sets the nr_from value for this LocationTypeRoaddescription.
     * 
     * @param nr_from   * further spec. of start
     */
    public void setNr_from(java.lang.String nr_from) {
        this.nr_from = nr_from;
    }


    /**
     * Gets the dist_from value for this LocationTypeRoaddescription.
     * 
     * @return dist_from   * distance from
     */
    public java.lang.Short getDist_from() {
        return dist_from;
    }


    /**
     * Sets the dist_from value for this LocationTypeRoaddescription.
     * 
     * @param dist_from   * distance from
     */
    public void setDist_from(java.lang.Short dist_from) {
        this.dist_from = dist_from;
    }


    /**
     * Gets the to value for this LocationTypeRoaddescription.
     * 
     * @return to   * last crossroad
     */
    public java.lang.String getTo() {
        return to;
    }


    /**
     * Sets the to value for this LocationTypeRoaddescription.
     * 
     * @param to   * last crossroad
     */
    public void setTo(java.lang.String to) {
        this.to = to;
    }


    /**
     * Gets the nr_to value for this LocationTypeRoaddescription.
     * 
     * @return nr_to   * further spec. of end
     */
    public java.lang.String getNr_to() {
        return nr_to;
    }


    /**
     * Sets the nr_to value for this LocationTypeRoaddescription.
     * 
     * @param nr_to   * further spec. of end
     */
    public void setNr_to(java.lang.String nr_to) {
        this.nr_to = nr_to;
    }


    /**
     * Gets the dist_to value for this LocationTypeRoaddescription.
     * 
     * @return dist_to   * distance to
     */
    public java.lang.Short getDist_to() {
        return dist_to;
    }


    /**
     * Sets the dist_to value for this LocationTypeRoaddescription.
     * 
     * @param dist_to   * distance to
     */
    public void setDist_to(java.lang.Short dist_to) {
        this.dist_to = dist_to;
    }


    /**
     * Gets the rooadinfo value for this LocationTypeRoaddescription.
     * 
     * @return rooadinfo   * flag to indicate use of road description
     */
    public boolean isRooadinfo() {
        return rooadinfo;
    }


    /**
     * Sets the rooadinfo value for this LocationTypeRoaddescription.
     * 
     * @param rooadinfo   * flag to indicate use of road description
     */
    public void setRooadinfo(boolean rooadinfo) {
        this.rooadinfo = rooadinfo;
    }


    /**
     * Gets the direction value for this LocationTypeRoaddescription.
     * 
     * @return direction   * direction
     */
    public com.siemens.sitraffic.external.global.LocationTypeRoaddescriptionDirection getDirection() {
        return direction;
    }


    /**
     * Sets the direction value for this LocationTypeRoaddescription.
     * 
     * @param direction   * direction
     */
    public void setDirection(com.siemens.sitraffic.external.global.LocationTypeRoaddescriptionDirection direction) {
        this.direction = direction;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocationTypeRoaddescription)) return false;
        LocationTypeRoaddescription other = (LocationTypeRoaddescription) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.road==null && other.getRoad()==null) || 
             (this.road!=null &&
              this.road.equals(other.getRoad()))) &&
            ((this.from==null && other.getFrom()==null) || 
             (this.from!=null &&
              this.from.equals(other.getFrom()))) &&
            ((this.nr_from==null && other.getNr_from()==null) || 
             (this.nr_from!=null &&
              this.nr_from.equals(other.getNr_from()))) &&
            ((this.dist_from==null && other.getDist_from()==null) || 
             (this.dist_from!=null &&
              this.dist_from.equals(other.getDist_from()))) &&
            ((this.to==null && other.getTo()==null) || 
             (this.to!=null &&
              this.to.equals(other.getTo()))) &&
            ((this.nr_to==null && other.getNr_to()==null) || 
             (this.nr_to!=null &&
              this.nr_to.equals(other.getNr_to()))) &&
            ((this.dist_to==null && other.getDist_to()==null) || 
             (this.dist_to!=null &&
              this.dist_to.equals(other.getDist_to()))) &&
            this.rooadinfo == other.isRooadinfo() &&
            ((this.direction==null && other.getDirection()==null) || 
             (this.direction!=null &&
              this.direction.equals(other.getDirection())));
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
        if (getRoad() != null) {
            _hashCode += getRoad().hashCode();
        }
        if (getFrom() != null) {
            _hashCode += getFrom().hashCode();
        }
        if (getNr_from() != null) {
            _hashCode += getNr_from().hashCode();
        }
        if (getDist_from() != null) {
            _hashCode += getDist_from().hashCode();
        }
        if (getTo() != null) {
            _hashCode += getTo().hashCode();
        }
        if (getNr_to() != null) {
            _hashCode += getNr_to().hashCode();
        }
        if (getDist_to() != null) {
            _hashCode += getDist_to().hashCode();
        }
        _hashCode += (isRooadinfo() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDirection() != null) {
            _hashCode += getDirection().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
