package com.codegnan.ControlStatements;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks");
		int marks = sc.nextInt();
		if(marks>=90) {
			System.out.println("Grade --> O");
		}else {
			if(marks>=80) {
				System.out.println("Garde --> S");
			}else {
				if(marks>=70) {
					System.out.println("Grade -- A");
				}else {
					if(marks>=60) {
						System.out.println("Grade -- B");
					}else {
						if(marks>=50) {
							System.out.println("Garde -- C");
						}else {
							if(marks>35) {
								System.out.println("Garde --> D");
							}else {
								System.out.println("Garde --> F");
							}
						}
					}
				}
			}
		}

	}

}
