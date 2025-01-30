package com;

public class Student {
	 int id;
	 String name;
	 double mark;
	public Student(int id, String name, double mark) {
	
		this.id = id;
		this.name = name;
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mark=" + mark + "]";
	}
	 

}
