package com.di.usingciwithdependentobject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
			ApplicationContext context = new ClassPathXmlApplicationContext("springconstructor.xml");
			Student student = (Student)context.getBean("objstudent");
			student.display();
	}

}
