package com.si.constructorinjection;

public class Student 
{
	private int id;
	private String name;
	private double salary;
	public Student() {
		super();
	}
	public Student(int id) {
		super();
		this.id = id;
	}
	public Student(String name) {
		super();
		this.name = name;
	}
	public Student(double salary) {
		super();
		this.salary = salary;
	}
	public Student(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	
	public void display()
	{
		System.out.println("Id:"+getId());
		System.out.println("Name:"+getName());
		System.out.println("Salary:"+getSalary());
	}

}
