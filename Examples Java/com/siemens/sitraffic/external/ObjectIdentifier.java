package com.siemens.sitraffic.external;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ObjectIdentifier
{
  private final String name;
  private final String source;
  private final Set<String> customerIdSet;
  
  public ObjectIdentifier(String name, Set<String> customerIdSet)
  {
    this(name, "", customerIdSet);
  }
  
  public ObjectIdentifier(String name, String source, Set<String> customerIdSet)
  {
    this.name = name;
    this.source = source == null ? "" : source;
    this.customerIdSet = customerIdSet;
  }
  
  public ObjectIdentifier(String name, String customerIds)
  {
    this(name, "", customerIds);
  }
  
  public ObjectIdentifier(String name, String source, String customerIds)
  {
    this.name = name;
    this.source = source == null ? "" : source;
    String[] customerId = customerIds != null && customerIds.length() > 0 ? customerIds.split("\\s*,\\s*") : new String[0];
    this.customerIdSet = new HashSet<String>();
    for (int i = 0; i < customerId.length; i ++)
    {
      customerIdSet.add(customerId[i]);
    }
  }

  public Set<String> getCustomerIdSet()
  {
    return new HashSet<String>(customerIdSet);
  }
  
  public String getCustomerIds()
  {
    StringBuilder customerIdString = new StringBuilder("");
    Iterator<String> customerIdIt = customerIdSet.iterator();
    while(customerIdIt.hasNext())
    {
      String customerId = customerIdIt.next();
      if (customerIdString.length() > 0)
      {
        customerIdString.append(",");
      }
      customerIdString.append(customerId);
    }
    
    return customerIdString.toString();
  }

  public String getName()
  {
    return name;
  }
  
  public String getSource()
  {
    return source;
  }
  
  @Override
  public int hashCode()
  {
    // only by names and source
    int hash = name.hashCode();
    hash ^= source.hashCode();
    return hash;
  }

  @Override
  public boolean equals(Object obj)
  {
    if (obj == this)
      return true;
    
    if (!(obj instanceof ObjectIdentifier))
      return false;
    
    // compare by names at first
    ObjectIdentifier other = (ObjectIdentifier)obj;
    if (!this.name.equals(other.name))
    {
      return false;
    }
    
    // secondly by source
    if (!source.equals(other.source))
    {
        return false;
    }
    
    // thirdly by customer identifiers
    if (this.customerIdSet.isEmpty() || other.customerIdSet.isEmpty())
    {
      return true;
    }
    else
    {
      // check if customer ids intersect
      Iterator<String> thisCustomerIdIt = this.customerIdSet.iterator();
      while(thisCustomerIdIt.hasNext())
      {
        String thisCustomerId = thisCustomerIdIt.next();
        if (other.customerIdSet.contains(thisCustomerId))
        {
          return true;
        }
      }
      
      return false;
    }
  }

  @Override
  public String toString()
  {
    String customerIdString = getCustomerIds();
    StringBuilder strBuilder = new StringBuilder(name);
    if (source != null && source.length() > 0)
      strBuilder.append(" (").append(source).append(")");
    if (customerIdString.length() > 0)
      strBuilder.append(" :").append(customerIdString);
    return strBuilder.toString();
  }
}
