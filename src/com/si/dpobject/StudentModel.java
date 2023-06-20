package com.si.dpobject;

public class StudentModel
{
	private int id;
	private String name;
	private String email;
	private Address address;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void display()
	{
		System.out.println("Student Id:"+getId());
		System.out.println("Student Name:"+getName());
		System.out.print("Student Email:"+getEmail());
		System.out.println("\nStudent Address:");
		System.out.println("Street:"+getAddress().getStreet());
		System.out.println("City:"+getAddress().getCity());
		System.out.println("State:"+getAddress().getState());
		System.out.println("Country:"+getAddress().getCountry());
		
		
	}
}
