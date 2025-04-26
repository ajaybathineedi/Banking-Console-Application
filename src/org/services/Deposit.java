package org.services;

import java.util.Scanner;

public class Deposit {
     public static void getDeposit()
     {
    	Scanner sc=new Scanner(System.in);
 		System.out.printf("To deposit money do you have account in our bank%n1.yes%n2.No%n");
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
 			System.out.printf("Enter the amount you want to deposit:\t");
 			int depositAmount=sc.nextInt();
 			int orgAmount;
 			CustomerService cs=new CustomerService();
 			String orgAccountNumber=cs.getAccountNumber(aadhar);
 			if(accountNumber.equals(orgAccountNumber)) {
 				orgAmount=cs.getAmount(orgAccountNumber);
 				orgAmount=orgAmount+depositAmount;
 				int i=cs.updateAmount(orgAmount, orgAccountNumber);
 				if(i==1)
 					System.out.printf("Your money deposit sucessfully and the balance amount is %d",orgAmount);	
 			}	
 			Repetation.getRepetation();
 		}
 		}	
     }
}
