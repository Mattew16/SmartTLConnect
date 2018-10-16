package com.siemens.sitraffic.external;








/**
 * The set of objects that can be represened on the external interface as one object type and could be
 * accessed by the specifed type of data
 * @param <T> - the type of data
 */
public interface ObjectAccess<T>
{  
   void close();
}
