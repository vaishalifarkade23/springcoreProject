package com.si.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuetionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ApplicationContext context =new  ClassPathXmlApplicationContext("springtest.xml");
       Quetion q1 = (Quetion)context.getBean("que");
       q1.display();
	}

}
