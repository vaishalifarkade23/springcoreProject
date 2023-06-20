package com.cicollection_object;

import java.util.Iterator;
import java.util.List;

public class Student
{
	private int id;
	 private String name;
	 private List<Address> address;
	public Student() {
		super();
	}
	public Student(int id, String name, List<Address> address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	 
	public void display()
	 {
	  System.out.println("Id :"+id);
	  System.out.println("Name :"+name);
	  Iterator itr = address.iterator();
	  while(itr.hasNext())
	  {
	   System.out.println(" "+itr.next()+"\n");
	  }
	 }
}
