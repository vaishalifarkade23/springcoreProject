package com.non_stringobject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("map2.xml");
		Question q = (Question) context.getBean("q");
		q.displayInfo();

	}

}
