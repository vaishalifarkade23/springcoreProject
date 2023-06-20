package com.cicollection_object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("springconstructor.xml");
		Student obj =  (Student)context.getBean("colobjstudent");
		obj.display();

	}

}
