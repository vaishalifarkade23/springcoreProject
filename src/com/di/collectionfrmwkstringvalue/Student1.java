package com.di.collectionfrmwkstringvalue;
import java.util.Iterator;
import java.util.List;

	
public class Student1 {
	
	
		private int id;
		private String name;
		private List<String> address;
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
		public List<String> getAddress() {
			return address;
		}
		public void setAddress(List<String> address) {
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



