package com.codegnan.ControlStatements;

import java.util.Scanner;

public class MoblieRechargePlan {
	// talktime < 100 --> base plan tt>100 and <300 -->standard plan , tt>300 and < 500 --> premimum , tt>500-->unlimited
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter TalkTime");
		int talktime = sc.nextInt();
		if(talktime<100) {
			System.out.println("Base Plan");
		}else {
			if(talktime>100 && talktime<300) {
				System.out.println("Standard plan");
			}else {
				if(talktime>300 && talktime<500) {
					System.out.println("Preminum");
				}else {
					if(talktime>500) {
						System.out.println("Unlimited");
					}
				}
			}
		}
		sc.close();
		
	}

}
