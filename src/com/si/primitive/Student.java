package com.si.primitive;

public class Student
{
	private int id;
	private String name;
	private float salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
    public void getStudentDetails()
    {
    	System.out.println("Student Id:"+getId());
    	System.out.println("Student Name:"+getName());
    	System.out.println("Student Salary:"+getSalary());
    }
}
