package com.siemens.sitraffic.external;


public class ObjectInitValueEvent<T> extends ObjectValueEvent<T>
{
  public ObjectInitValueEvent(long timestamp, long position, T data)
  {
    super(timestamp, position, data);
  }
}
