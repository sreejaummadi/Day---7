package com.codegnan.ControlStatements;

import java.util.Scanner;

public class Greetings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter city name");
		String city = sc.next();
		if(city.equalsIgnoreCase("Hyderabad")) {
			System.out.println("Hello Hyderabadi...Adaab");
		}else {
			if(city.equalsIgnoreCase("banglore")) {
				System.out.println("Hello Kannadiga... Namaskara");
			}else {
				if(city.equalsIgnoreCase("Chennai")){
					System.out.println("Hello Madrasi...Vanakkam..");
				}else {
					System.out.println("Please enter valid city name");
				}
			}
		}

	}

}
//assessment questions
// talktime < 100 --> base plan tt>100 and <300 -->standard plan , tt>300 and < 500 --> premimum , tt>500-->unlimited
//
