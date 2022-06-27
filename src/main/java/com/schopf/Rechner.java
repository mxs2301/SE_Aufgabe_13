package com.schopf;
import java.util.Scanner;
public class Rechner implements Mathe{
		Integer value;
		Double double_value;

	public void calculator(){
		System.out.println("1 für Integer Fakultät\n2 für Double Fakultät");
		Scanner scr = new Scanner(System.in);
		int val = scr.nextInt();

		switch(val){
		case 1:
			Scanner sc = new Scanner(System.in);
			Integer input = sc.nextInt();
			value = Fak(input);
			print(value);
			sc.close();
			break; 
		case 2:
			Scanner cs = new Scanner(System.in);
			Double input_double = cs.nextDouble();
			double_value = Fak(input_double);
			print(double_value);
			cs.close();
			break;
		}

		scr.close();

	}

	public Integer Fak(Integer input){
		if(input == 1)
			return input;
		else
			return input * Fak(input -1);
	}

	public Double Fak(Double input){
		double result = 1.0;
		for(double i = 0; i<input; i++){
			result = result * (input - i);
		}

		return result;
	}


	private void print(Integer input){
		System.out.println(input);
	}

	private void print(Double input){
		System.out.println(input);
	}
}