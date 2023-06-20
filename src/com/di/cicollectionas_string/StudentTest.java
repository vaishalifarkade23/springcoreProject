package com.di.cicollectionas_string;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

	public static void main(String[] args)
	
	{
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("springconstructor.xml");
		Student s1 = (Student) context.getBean("colstudent");
		s1.display();
				
	
	}

}
