package com.siemens.sitraffic.external;



/**
 * Object types implementing this interfaces allowes writting it's objets.
 * @param <T> - the type of data
 */
public interface ObjectWrite<T> extends ObjectAccess<T>
{
  void writeObject(ObjectIdentifier identifier, T data, boolean creatingAllowed) throws Exception;
}
