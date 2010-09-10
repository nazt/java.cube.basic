package com.nazt;

public class Human {
	private String name;
	protected String surname;

	public Human(String name, String surname) {
		this.setName(name);
		this.surname = surname;
	}

	public void introduce() {
		String msg = String.format("Hello, My name is %s %s", getName(), surname);
		System.out.println(msg);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
