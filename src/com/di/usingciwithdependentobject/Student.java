package com.di.usingciwithdependentobject;

public class Student 
{
	private int id;
    private String name;
	private Address address;
	public Student() {
		super();
	}
	public Student(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public void display()
	{
		System.out.println("Student id:"+id);
		System.out.println("Student name:"+name);
		System.out.println("Student address:"+address);
	}
}
