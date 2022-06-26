package com.schopf;

import java.util.ArrayList;

public abstract class Component {
	private ArrayList<Component> data;
	private String name;

	public void add(Component e) {
		data.add(e);
	}

	public void remove(Component e) {
		data.remove(e);
	}

	public void getChild() {
		// TODO - implement Component.getChild
		throw new UnsupportedOperationException();
	}
	
	public void accept(Visit visit) {
		// TODO - implement Component.accept
		throw new UnsupportedOperationException();
	}

}