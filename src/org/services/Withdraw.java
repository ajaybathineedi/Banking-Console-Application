package org.services;

import java.util.Scanner;

public class Withdraw 
{
	public static void getWithdraw()
	{
		Scanner sc=new Scanner(System.in);
		System.out.printf("To withdraw money do you have account in our bank%n1.yes%n2.No%n");
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
			System.out.printf("Enter the amount you want to withdraw:\t");
			int reqAmount=sc.nextInt();
			int orgAmount;
			CustomerService cs=new CustomerService();
			String orgAccountNumber=cs.getAccountNumber(aadhar);
			if(accountNumber.equals(orgAccountNumber)) {
				orgAmount=cs.getAmount(orgAccountNumber);
				if(reqAmount>orgAmount)
					System.out.println("your Account does not contain expected amount");
				else {
					
					orgAmount=orgAmount-reqAmount;
					int i=cs.updateAmount(orgAmount, orgAccountNumber);
					if(i==1)
						System.out.printf("Your money withdrawn sucessfully and the balance amount is %d",orgAmount);
				}	
			}
			Repetation.getRepetation();
		}
		}	
	}
}

