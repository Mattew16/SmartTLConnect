/**
 * HarStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.har;

public class HarStatus  implements java.io.Serializable {
    /* Shortname or ID of HAR device */
    private java.lang.String harId;

    /* Beacon flag */
    private boolean beacon;

    /* Active Playlist - depends on message order (First message from
     * the list is played first, etc.) */
    private com.siemens.sitraffic.external.har.HarStatusPlaylist playlist;

    /* 0 - o.k.
     * 1 - n.o.k.
     * 2 - p.o.k.
     * 3 - unknown */
    private java.lang.Integer state;

    public HarStatus() {
    }

    public HarStatus(
           java.lang.String harId,
           boolean beacon,
           com.siemens.sitraffic.external.har.HarStatusPlaylist playlist,
           java.lang.Integer state) {
           this.harId = harId;
           this.beacon = beacon;
           this.playlist = playlist;
           this.state = state;
    }


    /**
     * Gets the harId value for this HarStatus.
     * 
     * @return harId   * Shortname or ID of HAR device
     */
    public java.lang.String getHarId() {
        return harId;
    }


    /**
     * Sets the harId value for this HarStatus.
     * 
     * @param harId   * Shortname or ID of HAR device
     */
    public void setHarId(java.lang.String harId) {
        this.harId = harId;
    }


    /**
     * Gets the beacon value for this HarStatus.
     * 
     * @return beacon   * Beacon flag
     */
    public boolean isBeacon() {
        return beacon;
    }


    /**
     * Sets the beacon value for this HarStatus.
     * 
     * @param beacon   * Beacon flag
     */
    public void setBeacon(boolean beacon) {
        this.beacon = beacon;
    }


    /**
     * Gets the playlist value for this HarStatus.
     * 
     * @return playlist   * Active Playlist - depends on message order (First message from
     * the list is played first, etc.)
     */
    public com.siemens.sitraffic.external.har.HarStatusPlaylist getPlaylist() {
        return playlist;
    }


    /**
     * Sets the playlist value for this HarStatus.
     * 
     * @param playlist   * Active Playlist - depends on message order (First message from
     * the list is played first, etc.)
     */
    public void setPlaylist(com.siemens.sitraffic.external.har.HarStatusPlaylist playlist) {
        this.playlist = playlist;
    }


    /**
     * Gets the state value for this HarStatus.
     * 
     * @return state   * 0 - o.k.
     * 1 - n.o.k.
     * 2 - p.o.k.
     * 3 - unknown
     */
    public java.lang.Integer getState() {
        return state;
    }


    /**
     * Sets the state value for this HarStatus.
     * 
     * @param state   * 0 - o.k.
     * 1 - n.o.k.
     * 2 - p.o.k.
     * 3 - unknown
     */
    public void setState(java.lang.Integer state) {
        this.state = state;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HarStatus)) return false;
        HarStatus other = (HarStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.harId==null && other.getHarId()==null) || 
             (this.harId!=null &&
              this.harId.equals(other.getHarId()))) &&
            this.beacon == other.isBeacon() &&
            ((this.playlist==null && other.getPlaylist()==null) || 
             (this.playlist!=null &&
              this.playlist.equals(other.getPlaylist()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState())));
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
        if (getHarId() != null) {
            _hashCode += getHarId().hashCode();
        }
        _hashCode += (isBeacon() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPlaylist() != null) {
            _hashCode += getPlaylist().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
