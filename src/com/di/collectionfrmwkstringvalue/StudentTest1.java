package com.di.collectionfrmwkstringvalue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.si.dpobject.StudentModel;

public class StudentTest1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("springtest.xml");
		Student1 obj1=(Student1)context.getBean("cstudent");
		obj1.display();

	}

}
