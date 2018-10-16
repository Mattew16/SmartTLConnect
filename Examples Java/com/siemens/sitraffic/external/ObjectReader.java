package com.siemens.sitraffic.external;


public interface ObjectReader<T> extends ObjectAccess<T>
{
  void startObjectReading(ObjectOutput<? super T> outputIf);
  void interruptObjectReading(ObjectOutput<? super T> outputIf);
}
