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
//  Modulname:    BemaObjectAccessIF.java
//  Verfasser:    Thomas Gerner
//***************************************************************************** 

package com.siemens.sitraffic.external.sem;

/**
 * <p>Title:       SITRAFFIC Concert - BemaObjectAccessIF.java</p>
 * <p>Description: </p>
 * 
 * <p>Copyright:   (c) 2013</p>
 * <p>Company:     Siemens AG</p>
 * 
 * @author        Thomas Gerner
 * @created       17.06.2013
 * @version       $Revision$ $Date$
 */
public interface BemaObjectAccessIF
{
  /**
   * Initialize the implementation  to make sure objects can be read or written.
   */
  public void initializeBemaAccess();
  
  /**
   * Find all objects with the given external id and any wsSource 
   * @param externalID
   * @param wsSource
   * @return
   */
  public ObjectBemaIF[] findByExternalId(String externalID);
  
  /**
   * find all objects with the given BEMA ID and any BEMA object type
   * @param bemaObjectId
   * @param bemaObjectType
   * @return
   */
  public ObjectBemaIF[] findByBemaId(String bemaObjectId);
  
  /**
   * Test if the objects implement ObjectBemaIF
   * @return
   */
  public boolean implementsObjectBemaIF();
}
