package com.schopf;

import java.util.Scanner;

public class Math_Generator {
	String decider;

	public Math_Generator() {
		System.out.println(
				"Geben Sie ein, welches Tool verwendet werden soll\nUmrechnungsspiel oder Fakultätsrechner");
		System.out.println("1 für Umrechnungsspiel und 2 für den Rechner");

	}

	public Mathe decide(){
		Scanner scan = new Scanner(System.in);
		decider = scan.nextLine();
		switch(decider){
		case "1":
			return new Umrechnung();
		case "2":
			return new Rechner();
		default:
			scan.close();
			return null;
		}
	}

}