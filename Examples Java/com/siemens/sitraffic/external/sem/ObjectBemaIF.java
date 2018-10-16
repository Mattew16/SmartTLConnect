//***************************************************************************** 
//
//  Projekt:      SITRAFFIC Concert 
//                Siemens AG, I MO TS
//
//  COPYRIGHT (C) SIEMENS AG 2000-2008 ALL RIGHTS RESERVED CONFIDENTIAL 
//
//***************************************************************************** 
//Weitergabe sowie Vervielfaeltigung dieser Daten, Verwertung und Mitteilung 
//ihres Inhalts nicht gestattet, soweit nicht ausdruecklich zugestanden. 
//Zuwiderhandlung verpflichtet zu Schadenersatz. Alle Rechte vorbehalten, ins- 
//besondere fuer den Fall der Patenterteilung oder GM-Eintragung der technischen 
//Inhaltsteile. 
//***************************************************************************** 
//
//  Modulname:    ObjectBemaIF.java
//  Verfasser:    Thomas Gerner
//***************************************************************************** 

package com.siemens.sitraffic.external.sem;

/**
 * <p>Title:       SITRAFFIC Concert - ObjectBemaIF.java</p>
 * <p>Description: </p>
 * 
 * <p>Copyright:   (c) 2013</p>
 * <p>Company:     Siemens AG</p>
 * 
 * @author        Thomas Gerner
 * @created       17.06.2013
 * @version       $Revision$ $Date$
 * @param <T>
 */
public interface ObjectBemaIF
{
  /**
   * Get the objectType used at BEMA messages, e.g. "UTC" or "Schilder"
   * @return
   */
  public String getBemaObjectType();
   
  /**
   * Get the object ID used at BEMA messages, e.g. GUID or UnitID
   * @return
   */
  public String getBemaObjectId();
  
  /**
   * getWSSSource as defined by WSObjectIF
   * @return
   */
  public String getWSSource();
  
  /**
   * isExternalVisible as defined by WSObjectIF
   * @return
   */
  public boolean isExternalVisible();
  
  /**
   * getExternalId as defined by WSObjectIF
   * @return
   */
  public String getExternalId();
}
