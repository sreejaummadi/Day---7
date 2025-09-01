package com.codegnan.ControlStatements;

import java.util.Scanner;

public class ATMExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double balance=50000;
		int pin=1234;
		int enteredpin;
		System.out.println("Enter Your Pin");
		enteredpin=sc.nextInt();
		if(enteredpin!=pin) {
			System.out.println("Incorrect pin Existing");
			return;
		}
		int choice;
		System.out.println("==============");
		System.out.println("======ATM MENU========");
		System.out.println("||======1.Check Balance========||");
		System.out.println("||======2.Deposit========||");
		System.out.println("||======3.Withdraw========||");
		System.out.println("||======4.Exit========||");
		System.out.println("Enter your Choice");
		choice=sc.nextInt();
		switch(choice){
		case 1 :
			System.out.println("Your Balance is " +balance);
			break;
		case 2:
			System.out.println("Enter Deposit Amount : ");
			double depositAmount=sc.nextDouble();
			if(depositAmount%100!=0) {
				System.out.println("Please Deposit Multiples of 100");
			}else {
				if(depositAmount<500) {
					System.out.println("please deposit more than 500 rupees");
				}else {
					balance +=depositAmount;
					System.out.println("Deposited : "+depositAmount+ "successfully..updated balance is :"+balance);
				}
			}
			break;
		case 3:
			System.out.println("Enter Withdraw Amount");
			double withdrawamount=sc.nextDouble();
			if(withdrawamount%100!=0) {
				System.out.println("Please withdraw only multiples of 100");
			}else {
				if(withdrawamount<500) {
					System.out.println("Please withdraw more than 500 rupees");
				}else {
					if(withdrawamount>balance) {
						System.out.println("Insufficient Balance");
					}else {
						balance-=withdrawamount;
						System.out.println("Withdraw : "+withdrawamount+ "successfully.. updated balance is "+balance);
					}
				}
			}
			break;
		case 4:
			System.out.println("Exit ThankYou for Using ATM");
			break;
		default:
			System.out.println("Invalid Choice Please choose a valid option from 1 to 4");
			break;
		}
		sc.close();
	}
}