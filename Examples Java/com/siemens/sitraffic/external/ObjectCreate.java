package com.siemens.sitraffic.external;


/**
 * Interface allows writing or creating of object of the speicifed type.
 * The interface does not provides any special method for creating,
 * it actualy only indicate that the implementing support the create operation.
 * For calling creating the same method should be used as for writing,
 * only the implementing can decide if the object will be created or just rewritetten.
 * @param <T> - the type of data
 */
public interface ObjectCreate<T> extends ObjectWrite<T>
{
  
}
