/**
 * EmPut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 May 18, 2010 (10:31:04 CEST) WSDL2Java emitter.
 */

package com.siemens.sitraffic.external.intersectionStates_andCommands;

public class EmPut  implements java.io.Serializable {
    private com.siemens.sitraffic.external.intersectionStates_andCommands.EmPutCmdLine cmdLine;

    /* used to signal End of session to the adapter. Anyway the adapter
     * has to clean up the session after a configured timeout. */
    private java.lang.Object sessionEnd;

    public EmPut() {
    }

    public EmPut(
           com.siemens.sitraffic.external.intersectionStates_andCommands.EmPutCmdLine cmdLine,
           java.lang.Object sessionEnd) {
           this.cmdLine = cmdLine;
           this.sessionEnd = sessionEnd;
    }


    /**
     * Gets the cmdLine value for this EmPut.
     * 
     * @return cmdLine
     */
    public com.siemens.sitraffic.external.intersectionStates_andCommands.EmPutCmdLine getCmdLine() {
        return cmdLine;
    }


    /**
     * Sets the cmdLine value for this EmPut.
     * 
     * @param cmdLine
     */
    public void setCmdLine(com.siemens.sitraffic.external.intersectionStates_andCommands.EmPutCmdLine cmdLine) {
        this.cmdLine = cmdLine;
    }


    /**
     * Gets the sessionEnd value for this EmPut.
     * 
     * @return sessionEnd   * used to signal End of session to the adapter. Anyway the adapter
     * has to clean up the session after a configured timeout.
     */
    public java.lang.Object getSessionEnd() {
        return sessionEnd;
    }


    /**
     * Sets the sessionEnd value for this EmPut.
     * 
     * @param sessionEnd   * used to signal End of session to the adapter. Anyway the adapter
     * has to clean up the session after a configured timeout.
     */
    public void setSessionEnd(java.lang.Object sessionEnd) {
        this.sessionEnd = sessionEnd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmPut)) return false;
        EmPut other = (EmPut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cmdLine==null && other.getCmdLine()==null) || 
             (this.cmdLine!=null &&
              this.cmdLine.equals(other.getCmdLine()))) &&
            ((this.sessionEnd==null && other.getSessionEnd()==null) || 
             (this.sessionEnd!=null &&
              this.sessionEnd.equals(other.getSessionEnd())));
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
        if (getCmdLine() != null) {
            _hashCode += getCmdLine().hashCode();
        }
        if (getSessionEnd() != null) {
            _hashCode += getSessionEnd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
