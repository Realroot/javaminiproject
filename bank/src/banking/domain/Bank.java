package banking.domain;

import java.util.*;

public class Bank {
	
  private static List<Customer> customers;
  private static int numberOfCustomers;
  
   static {
	   customers = new ArrayList<>();
	   numberOfCustomers =0;
   }
   
   public static void addCustomer(String name,String ssn) {
	  customers.add(new Customer(name,ssn));
	  numberOfCustomers++;
   }
   
   public static int getNumberOfCustomers() {
	   return numberOfCustomers;
   }
   
   public static Customer getCustomer(int customerIndex) {
	   return customers.get(customerIndex);
   }
   
}
