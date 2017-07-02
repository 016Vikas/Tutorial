package com.java.corejava.map;

import java.util.HashMap;
import java.util.Map;

class Customer1 {
    private int customerID;
    private String firstName;
    private String lastName;

    public Customer1(int customerID, String firstName, String lastName) {
      super();
      this.customerID = customerID;
      this.firstName = firstName;
      this.lastName = lastName;
    }
    
    @Override
      public int hashCode() {
          final int prime = 31;
          int result = 1;
          result = prime * result + customerID;
          result = prime * result
                  + ((firstName == null) ? 0 :   firstName.hashCode());
          result = prime * result
                  + ((lastName == null) ? 0 : lastName.hashCode());
          return result;
      }

      @Override
      public boolean equals(Object obj) {
          if (this == obj)
              return true;
          if (obj == null)
              return false;
          if (getClass() != obj.getClass())
              return false;
          Customer1 other = (Customer1) obj;
          if (customerID != other.customerID)
              return false;
          if (firstName == null) {
              if (other.firstName != null)
                  return false;
          } else if (!firstName.equals(other.firstName))
              return false;
          if (lastName == null) {
              if (other.lastName != null)
                  return false;
          } else if (!lastName.equals(other.lastName))
              return false;
          return true;
      }

  
}
public class HashCodeDemo {

  public static void main(String[] args) {
      Map<Customer1, String> m = new HashMap<Customer1, String>();
      Customer1 cust = new Customer1(1, "Roger", "Cox");
      m.put(cust,"Roger Cox");
      // retrieving using another instance
      System.out.println(m.get(new Customer1(1, "Roger", "Cox")));
      // retrieving using same instance
      System.out.println(m.get(cust));               
  }
}

/*Output

Roger Cox
Roger Cox
*/