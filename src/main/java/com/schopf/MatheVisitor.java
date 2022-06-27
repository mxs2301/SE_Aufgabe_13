package com.schopf;
public interface MatheVisitor{
	public void visit(Umrechnung rechnung);
	public void visit(Rechner rechner);
}