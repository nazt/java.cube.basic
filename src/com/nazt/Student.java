package com.nazt;

public class Student extends Human {
	private String sid = null;

	public Student(String name, String surname, String sid) {
		super(name, surname);
		this.setSid(sid);
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSid() {
		return sid;
	}

	//Override introduce()
	//	public void introduce() {
	//		String msg = String.format("Hello, My name is %s %s and ID = %s", this.getName(), this.surname, this.sid);
	//		System.out.println(msg);
	//	}	

}
