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
//  Modulname:    ReferencedIdentifierIF.java
//  Verfasser:    Thomas Gerner
//***************************************************************************** 

package com.siemens.sitraffic.external;

import java.util.Map;

/**
 * <p>Title:       SITRAFFIC Concert - ReferencedIdentifierIF.java</p>
 * <p>Description: Exchange object identifier within the object by the identifier in the idMap. An 
 * instance of this class is used in case an identifier mapping is defined on the external interface
 * and the object references other objects. The method updateIdentifier must not change the object,
 * instead it should return a modified copy if a modification is performed.</p>
 * 
 * <p>Copyright:   (c) 2014</p>
 * <p>Company:     Siemens AG</p>
 * 
 * @author        Thomas Gerner
 * @created       06.10.2014
 * @version       $Revision$ $Date$
 */
public interface ReferencedIdentifierIF<T>
{
  /**
   * If identifier referenced by this object are modified return a copy of
   * the object. Otherwise return the unchanged object.
   * @param data The data to be checked for identifier to exchange
   * @param objectIdentifier own current object identifier
   * @param idMap Mapping of the identifier. The key contains the current name in the object, the value the new name.
   * @return New object if modified or original object id unmodified.
   */
  public T updateIdentifier(T data, ObjectIdentifier objectIdentifier, Map<ObjectIdentifier, String> idMap);
}
