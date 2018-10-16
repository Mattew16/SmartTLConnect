/**
 * EmGet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.intersectionStates_andCommands;

public class EmGet  implements java.io.Serializable {
    private com.siemens.sitraffic.external.intersectionStates_andCommands.EmGetRespond respond;

    /* echoed commandline, see EmPut */
    private com.siemens.sitraffic.external.intersectionStates_andCommands.EmGetEcho echo;

    public EmGet() {
    }

    public EmGet(
           com.siemens.sitraffic.external.intersectionStates_andCommands.EmGetRespond respond,
           com.siemens.sitraffic.external.intersectionStates_andCommands.EmGetEcho echo) {
           this.respond = respond;
           this.echo = echo;
    }


    /**
     * Gets the respond value for this EmGet.
     * 
     * @return respond
     */
    public com.siemens.sitraffic.external.intersectionStates_andCommands.EmGetRespond getRespond() {
        return respond;
    }


    /**
     * Sets the respond value for this EmGet.
     * 
     * @param respond
     */
    public void setRespond(com.siemens.sitraffic.external.intersectionStates_andCommands.EmGetRespond respond) {
        this.respond = respond;
    }


    /**
     * Gets the echo value for this EmGet.
     * 
     * @return echo   * echoed commandline, see EmPut
     */
    public com.siemens.sitraffic.external.intersectionStates_andCommands.EmGetEcho getEcho() {
        return echo;
    }


    /**
     * Sets the echo value for this EmGet.
     * 
     * @param echo   * echoed commandline, see EmPut
     */
    public void setEcho(com.siemens.sitraffic.external.intersectionStates_andCommands.EmGetEcho echo) {
        this.echo = echo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmGet)) return false;
        EmGet other = (EmGet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.respond==null && other.getRespond()==null) || 
             (this.respond!=null &&
              this.respond.equals(other.getRespond()))) &&
            ((this.echo==null && other.getEcho()==null) || 
             (this.echo!=null &&
              this.echo.equals(other.getEcho())));
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
        if (getRespond() != null) {
            _hashCode += getRespond().hashCode();
        }
        if (getEcho() != null) {
            _hashCode += getEcho().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
