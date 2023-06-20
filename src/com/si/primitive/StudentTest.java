package com.si.primitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ApplicationContext context=new ClassPathXmlApplicationContext("springtest.xml");
       Student obj=(Student)context.getBean("student");
       obj.getStudentDetails();
	}

}
