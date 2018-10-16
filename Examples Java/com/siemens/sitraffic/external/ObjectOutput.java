package com.siemens.sitraffic.external;




/**
 * Binds all interafaces representing any output actions.
 * @param <T> - type of data element
 */
public interface ObjectOutput<T> extends ObjectCreate<T>, ObjectWrite<T>, ObjectDelete<T>
{
  
}
