package com.siemens.sitraffic.external;


import java.io.IOException;
import java.util.Map;
import java.util.SortedMap;

public interface ObjectEventRead<T> extends ObjectAccess<T>
{
  /**
   * Returns current values of all or of specified objects.
   * @param internalNameSet - internal name of objects which values should be returned, if empty - return all objects
   * @return - current values of the objects
   * @throws IOException
   */
  Map<ObjectIdentifier, ObjectValueEvent<T>> getLastObjectValueEvents() throws Exception;

  /**
   * Returns object deltas since the specified position.
   * @param internalNameSet - the names of the objects to be returned, empty means all.
   * @param position
   * @return - the list of object object deltas with thier position, wich can be used for the following queries
   */
  SortedMap<ObjectEvent<T>, ObjectIdentifier> getEventHistoryFrom(long fromPosition) throws Exception;

}
