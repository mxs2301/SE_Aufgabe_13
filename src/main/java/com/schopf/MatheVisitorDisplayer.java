package com.schopf;
public class MatheVisitorDisplayer implements MatheVisitor{
	public void visit(Rechner rechner){
		System.out.println("Wir sind beim Rechner angekommen");
	}

	public void visit(Umrechnung umrechnung){
		System.out.println("Wir sind bei der Umrechnung");
	}
}