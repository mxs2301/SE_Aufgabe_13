package com.schopf;

import java.util.Scanner;

public class Umrechnung implements Mathe {
	private Integer camel_weight = 80000;
	private Integer weight = 2;

	public void calculator() {
		System.out.println("Geben Sie ein wieviel 1-Euromünzen, sie glauben ist ein Kamel schwer");
		Scanner scr = new Scanner(System.in);
		weight = scr.nextInt();
		while (weight != camel_weight) {
			if (weight < camel_weight) {
				System.out.println("Das Kamel wiegt mehr");
			} else if(weight > camel_weight) {
				System.out.println("Das Kamel wiegt weniger, Sie sind unhöflich!");
				System.out.println("Das Kamel ist so schwer wie " + camel_weight+" Münzen");
				break;
			} 
			weight = scr.nextInt();

		}

		
		scr.close();
	}

}