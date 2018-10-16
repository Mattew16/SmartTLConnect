package com.siemens.sitraffic.external;



/**
 * A delelte event.
 */
public class ObjectDeleteEvent<T> extends ObjectEvent<T>
{
  public ObjectDeleteEvent(long timestamp, long position)
  {
    super(timestamp, position);
  }
}
