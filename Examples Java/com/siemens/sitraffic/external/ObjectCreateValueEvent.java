package com.siemens.sitraffic.external;


public class ObjectCreateValueEvent<T> extends ObjectValueEvent<T>
{
  public ObjectCreateValueEvent(long timestamp, long position, T data)
  {
    super(timestamp, position, data);
  }
}
