package com.schopf;

public class Main{
	public static void main(String[] args) {

		Mathe Neiße;
		Math_Generator generator = new Math_Generator();
		Neiße = generator.decide();
		Neiße.calculator();

		Neiße.accept(new MatheVisitorDisplayer());

	}
}