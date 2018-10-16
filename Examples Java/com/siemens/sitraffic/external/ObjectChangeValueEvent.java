package com.siemens.sitraffic.external;


public class ObjectChangeValueEvent<T> extends ObjectValueEvent<T>
{
  public ObjectChangeValueEvent(long timestamp, long position, T data)
  {
    super(timestamp, position, data);
  }
}
