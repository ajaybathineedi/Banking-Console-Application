package org.services;

import java.util.Scanner;

public class Repetation {
	public static void getRepetation() {
		Scanner sc=new Scanner(System.in);
		System.out.printf("%nDo you want to perform the operations again?%n1.yes%n2.No%n");
		int op=sc.nextInt();
		switch(op)
		{
		case 1->
		{
			System.out.printf("select the operations%n1.open Account%n2.withdraw%n3.deposit%n4.check Balance%n5.Exit%n");
			int op1=sc.nextInt();
			switch(op1)
			{
			case 1->{OpenAccount.openAccount();}
			case 2->{Withdraw.getWithdraw();}
			case 3->{Deposit.getDeposit();}
			case 4->{CheckBalance.checkBalance();}
			case 5->{System.out.println("Thanks for visiting our bank");break;}
			}
		}
		case 2->{System.out.println("Thanks for visiting our bank");}
		}
	}
}
