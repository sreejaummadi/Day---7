package com.codegnan.ControlStatements;

import java.util.Scanner;

public class AirLineTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Passenger Type");
		String Passenger_Type=sc.next();
		double BaseTicketPrice=5000.0;
		double final_amount=BaseTicketPrice;
		if(Passenger_Type.equalsIgnoreCase("Child")) {
			final_amount-=BaseTicketPrice*0.5;
		}else {
			if(Passenger_Type.equalsIgnoreCase("Senior")) {
				final_amount-=BaseTicketPrice*0.2;
			}else {
				if(Passenger_Type.equalsIgnoreCase("Adult")) {
					System.out.println("No discount for Adults");
				}else {
					System.out.println("Enter Correct Passenger Type");
					return;
				}
			}
		}
		System.out.println("Enter Booking time");
		String Booking_Time=sc.next();
		if(Booking_Time.equalsIgnoreCase("early")) {
			final_amount-=BaseTicketPrice*0.1;
		}else {
			if(Booking_Time.equalsIgnoreCase("normal")) {
				//System.out.println("No Change");
			}else {
				if(Booking_Time.equalsIgnoreCase("Lastmin")){
					final_amount+=BaseTicketPrice*0.2;	
			      }else {
			    	  System.out.println("Enter Correct Booking Time");
			    	  return;
			      }
			}
		}
		System.out.println("Is the Passenger has membership(Yes/no)");
		String membership=sc.next();
		if(membership.equalsIgnoreCase("Yes")) {
			final_amount-=final_amount*0.5;
		}else {
			System.out.println("Invalid Membership Input! Program terminated.");
            return;
		}
		System.out.printf("Final Ticket Price: ", final_amount);

        sc.close();	
	}
}
