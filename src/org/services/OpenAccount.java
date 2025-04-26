package org.services;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
import org.connection.GetConnection;
import org.connection.GetConnectionInterface;
import org.customer.Customer;
import org.exception.AadharLengthException;
import org.exception.EmailFormatException;
import org.exception.PhoneNumberLenthMisMatchException;

public class OpenAccount {
	public static void openAccount() {
		Scanner sc=new Scanner(System.in);
		System.out.printf("Enter the customer Name:\t");
    	String cName=sc.nextLine();
    	System.out.printf("Enter the customer phone Number:\t");
    	String phoneNumber=sc.next();
    	System.out.printf("Enter the customer mail id:\t");
    	String email=sc.next();
    	System.out.printf("Enter the customer aadhar Number:\t");
    	String aadhar=sc.next();
    	System.out.printf("Enter the initial amount in account:\t");
    	int amount=sc.nextInt();
    	GetConnectionInterface gci=new GetConnection();
    	Connection con=gci.getConnection();
    	String accountNumber=null;
    	try {
    		Customer c=new Customer(cName,phoneNumber,email,aadhar,amount);
        	CustomerService cs=new CustomerService(con, c);
        	cs.insertData();	
        	accountNumber=cs.getAccountNumber(aadhar);
    	}catch(PhoneNumberLenthMisMatchException e) {
    		System.out.println("error in phone number length");
    	}
    	catch(EmailFormatException e) {
    		System.out.println("error in email format");
    	}
    	catch(AadharLengthException e) {
    		System.out.println("error in aadhar length");
    	}
    	System.out.println("your account number is:"+accountNumber);
    	System.out.printf("customer name is:%s%n",cName);
    	System.out.printf("customer phone number is:%s%n",phoneNumber);
    	System.out.printf("customer mail id  is:%s%n",email);
    	System.out.printf("Initial amount is:%d",amount);
    	try {
    		if(con!=null) {
    			con.close();
    		}
    	}
    		catch(SQLException e) {
    			System.out.println("error while closing the openaccount connection");
    	}
    	Repetation.getRepetation();
	}
}
