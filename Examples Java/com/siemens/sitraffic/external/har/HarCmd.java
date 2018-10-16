/**
 * HarCmd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.har;

public class HarCmd  implements java.io.Serializable {
    /* Shortname or ID of HAR device */
    private java.lang.String harId;

    /* Beacon flag */
    private boolean beacon;

    /* Message Playlist - depends on message order (First message
     * from the list is played first, etc.) */
    private com.siemens.sitraffic.external.har.HarCmdPlaylist playlist;

    public HarCmd() {
    }

    public HarCmd(
           java.lang.String harId,
           boolean beacon,
           com.siemens.sitraffic.external.har.HarCmdPlaylist playlist) {
           this.harId = harId;
           this.beacon = beacon;
           this.playlist = playlist;
    }


    /**
     * Gets the harId value for this HarCmd.
     * 
     * @return harId   * Shortname or ID of HAR device
     */
    public java.lang.String getHarId() {
        return harId;
    }


    /**
     * Sets the harId value for this HarCmd.
     * 
     * @param harId   * Shortname or ID of HAR device
     */
    public void setHarId(java.lang.String harId) {
        this.harId = harId;
    }


    /**
     * Gets the beacon value for this HarCmd.
     * 
     * @return beacon   * Beacon flag
     */
    public boolean isBeacon() {
        return beacon;
    }


    /**
     * Sets the beacon value for this HarCmd.
     * 
     * @param beacon   * Beacon flag
     */
    public void setBeacon(boolean beacon) {
        this.beacon = beacon;
    }


    /**
     * Gets the playlist value for this HarCmd.
     * 
     * @return playlist   * Message Playlist - depends on message order (First message
     * from the list is played first, etc.)
     */
    public com.siemens.sitraffic.external.har.HarCmdPlaylist getPlaylist() {
        return playlist;
    }


    /**
     * Sets the playlist value for this HarCmd.
     * 
     * @param playlist   * Message Playlist - depends on message order (First message
     * from the list is played first, etc.)
     */
    public void setPlaylist(com.siemens.sitraffic.external.har.HarCmdPlaylist playlist) {
        this.playlist = playlist;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HarCmd)) return false;
        HarCmd other = (HarCmd) obj;
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
              this.playlist.equals(other.getPlaylist())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

}
