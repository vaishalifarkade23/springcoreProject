package com.listofobjectcolletion;

import java.util.Iterator;
import java.util.List;

public class Student 
{
	private int id;
	private String name;
	private List<Address> address;
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
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
     
	public void display()
	{
		System.out.println("Student id:"+getId());
		System.out.println("Student Name:"+getName());
		System.out.println("Student Address:");
		Iterator itr=address.iterator();
		while(itr.hasNext())
		{
			System.out.println(" "+itr.next()+"\n");
		}
		
		
	}
}
