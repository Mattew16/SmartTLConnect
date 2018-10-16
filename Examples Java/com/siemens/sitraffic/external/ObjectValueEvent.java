package com.siemens.sitraffic.external;



/**
 * An event that occurs if any new value is comming.
 * @param <T>
 */
public class ObjectValueEvent<T> extends ObjectEvent<T>
{
  private final T data;
  
  protected ObjectValueEvent(long timestamp, long position, T data)
  {
    super(timestamp, position);
    this.data = data;
  }

  public T getData()
  {
    return data;
  }
}
