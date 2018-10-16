package com.siemens.sitraffic.external;


import java.util.Date;



/**
 * Basic class for all events occured inside of the object type.
 * Every event is indexed by it's unique position and timestamp and is unique in the VM.
 * The class does not provide any information about the object the event occured by, 
 * so every method using this interface should provides also the object internal name.
 */
public class ObjectEvent<T> implements Comparable<ObjectEvent>
{ 
  private final long position;
  private final long timestamp;
  
  public ObjectEvent(long timestamp, long position)
  {
    this.timestamp = timestamp;
    this.position = position;
  }

  public long getPosition()
  {
    return position;
  }

  public long getTimestamp()
  {
    return timestamp;
  }

  @Override
  public boolean equals(Object obj)
  {
    if (obj == this)
      return true;
    
    if (!(obj instanceof ObjectEvent))
      return false;
    
    ObjectEvent other = (ObjectEvent)obj;
    return this.timestamp == other.timestamp && this.position == other.position;
  }

  @Override
  public int hashCode()
  {
    int hashCode = 17;
    hashCode = 37 * hashCode + (int)(timestamp ^ (timestamp >>>32));
    hashCode = 37 * hashCode + (int)(position ^ (position >>>32));
    return hashCode;
  }

  /**
   * @param other
   * @return
   */
  public int compareTo(ObjectEvent other)
  {
    if (this.timestamp > other.timestamp)
      return 1;
    
    if (this.timestamp < other.timestamp)
      return -1;
    
    if (this.position > other.position)
      return 1;
    
    if (this.position < other.position)
      return -1;
    
    return 0;
  }
  
  @Override
  public String toString()
  {
    return new Date(timestamp) + "[" + position + "]";
  }
}
