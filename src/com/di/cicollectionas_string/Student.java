package com.di.cicollectionas_string;

import java.util.Iterator;
import java.util.List;

public class Student
{
	 private int id;
	 private String name;
	 private List<String> address;
	 
	 public Student() {
		super();
	 }

	public Student(int id, String name, List<String> address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public  void display()
	{
		System.out.println("Student Id:"+id);
		System.out.println("Student Name:"+name);
		System.out.println("Student Address are:");
		Iterator itr = address.iterator();
		while(itr.hasNext())
		{
			System.out.println(" "+itr.next()+"\n");
		}
	}
     
}
