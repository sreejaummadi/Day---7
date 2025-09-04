package com.codegnan.ControlStatements;

import java.util.Scanner;

public class IncomeTaxCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Salary");
		double salary = sc.nextDouble();
		double tax;
		double taxrate;
		if(salary<3000000) {
			taxrate=0.05;
		}else {
			if(salary>=3000000 && salary<=1000000) {
				taxrate=0.10;
			}else {
				taxrate=0.15;
			}
		}
		tax=salary*taxrate;
		if(salary>2000000) {
			tax+=tax*0.01;
		}
		System.out.println("The tax of"+salary+" is "+tax);
		sc.close();
	}

}
