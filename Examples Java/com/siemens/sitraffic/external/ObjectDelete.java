package com.siemens.sitraffic.external;




/**
 * Object types implementing this interface allows deleting it's objets.
 * @param <T> - the type of data
 */
public interface ObjectDelete<T> extends ObjectAccess<T>
{
  void deleteObject(ObjectIdentifier identifier) throws Exception;
}
