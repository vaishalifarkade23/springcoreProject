package com.autowire;



public class Student
{
	private int id;
	private String name;
	private Address address1;
	private Address address2;
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
	public Address getAddress1() {
		return address1;
	}
	public void setAddress1(Address address1) {
		this.address1 = address1;
	}
	public Address getAddress2() {
		return address2;
	}
	public void setAddress2(Address address2) {
		this.address2 = address2;
	}
	
	public void display()
	 {
	  System.out.println("id "+id);
	  System.out.println("Name "+name);
	  System.out.println("Address1 "+address1);
	  System.out.println("Address2"+address2);
	  
	  //System.out.println("id "+getId());
	  //System.out.println("Name "+getName());
	  //System.out.println("Address1 "+getAddress1());
	  //System.out.println("Address2"+getAddress2());
	  
	 }

}
