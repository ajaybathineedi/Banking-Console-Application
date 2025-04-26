package org.customer;
import org.exception.PhoneNumberLenthMisMatchException;
import org.exception.AadharLengthException;
import org.exception.EmailFormatException;
public class Customer {
     private int customerId;
     private String customerName;
     private String phoneNumber;
     private String email;
     private String aadhar;
     private int amount;
     public Customer(String customerName,String phoneNumber,String email,String aadhar,int amount) throws PhoneNumberLenthMisMatchException,EmailFormatException,AadharLengthException {
    	 this.customerName=customerName;
    	 if(phoneNumber.length()==10)
    		 this.phoneNumber=phoneNumber;
    	 else
    		 throw new PhoneNumberLenthMisMatchException();
    	 String regx="^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    	 if(email.matches(regx))
    		 this.email=email;
    	 else
    		 throw new EmailFormatException();
    	 if(aadhar.length()==12)
    		 this.aadhar=aadhar;
    	 else
    		 throw new AadharLengthException();
    	 this.amount=amount;
     }
     public String getCustomerName() {
    	 return customerName;
     }
     public String getPhoneNumber() {
    	 return phoneNumber;
     }
     public String getEmail() {
    	 return email;
     }
     public String getAadhar() {
    	 return aadhar;
     }
     public int getAmount() {
    	 return amount;
     }
     @Override
     public String toString() {
    	 return String.format("Customer[%d,%s,%s,%s,%s",customerId,customerName,phoneNumber,email,aadhar);
     }
}
