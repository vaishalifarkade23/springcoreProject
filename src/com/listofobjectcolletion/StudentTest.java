package com.listofobjectcolletion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("springtest.xml");
		Student s1 = (Student)context.getBean("objcollection");
		s1.display();
	}

}
