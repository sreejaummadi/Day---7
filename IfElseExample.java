package com.codegnan.ControlStatements;

import java.util.Scanner;

public class IfElseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double accountBalance = 50000.0;
		System.out.println("Enter withdraw amount");
		double withdrawamount=sc.nextDouble();
		if(withdrawamount<=accountBalance && withdrawamount%100==0) {
			accountBalance -= withdrawamount;
			System.out.println("Withdraw Amount : " +withdrawamount+ "Successfully..available balance"+accountBalance);
			
		}else {
			System.out.println("Insufficient Funds");
		}
		sc.close();

	}

}
