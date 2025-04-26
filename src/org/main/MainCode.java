package org.main;
import java.util.Scanner;
import org.services.CheckBalance;
import org.services.Deposit;
import org.services.OpenAccount;
import org.services.Repetation;
import org.services.Withdraw;

public class MainCode {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.printf("Welcome to National Bank%n");
		System.out.printf("choose operations to perform%n1.open Account%n2.withdraw%n3.Deposit%n4.check Balance%n");
		int op=sc.nextInt();
		switch(op) {
		case 1->{OpenAccount.openAccount();}
		case 2->{Withdraw.getWithdraw();}
		case 3->{Deposit.getDeposit();}
		case 4->{CheckBalance.checkBalance();}
		default->{System.out.println("Invalid option");}
		}
		
	}
}
