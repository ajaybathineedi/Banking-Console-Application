package org.services;

import java.util.Scanner;

public class CheckBalance {
	public static void checkBalance()
    {
   	Scanner sc=new Scanner(System.in);
		System.out.printf("To check balance do you have account in our bank%n1.yes%n2.No%n");
		int op=sc.nextInt();
		switch(op)
		{
		case 2->
		{
			System.out.printf("Are you intrested to create account%n1.yes%n2.No%n");
			int op1=sc.nextInt();
			switch(op1)
			{
			case 1->{OpenAccount.openAccount();}
			case 2->{System.out.println("Thanks for Visiting our Bank");}
		    }
		}
		case 1->
		{
			System.out.printf("Enter your account Number:\t");
			String accountNumber=sc.next();
			System.out.print("Enter your aadhar number:\t");
			String aadhar=sc.next();
			CustomerService cs=new CustomerService();
			String orgAccountNumber=cs.getAccountNumber(aadhar);
			if(accountNumber.equals(orgAccountNumber)) {
				int amount=cs.getAmount(orgAccountNumber);
				System.out.printf("Your balance amount in account:%s is %d",orgAccountNumber,amount);
			}
			Repetation.getRepetation();
		}
		}	
    }

}
