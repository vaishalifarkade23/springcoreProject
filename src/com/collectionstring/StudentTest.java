package com.collectionstring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 ApplicationContext context = new ClassPathXmlApplicationContext("springtest.xml");
		  Student student = (Student) context.getBean("student1");
		  System.out.println("Student Information is ");
		  student.display();

	}

}
