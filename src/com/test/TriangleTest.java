package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;


public class TriangleTest
{
   public static void main(String[] args)
   {
		// TODO Auto-generated method stub
	   //Traingle t=new Traingle();
	   //t.getdraw();
	  
	   
	   //use for xml on project level means in jre library -springlib
	   //BeanFactory factory=new XmlBeanFactory(new FileSystemResource("springtest.xml"));
	   //Traingle tri=(Traingle)factory.getBean("triangle");
	   //tri.getdraw();
	   
	   //xml on src(source) level
	   ApplicationContext context=new ClassPathXmlApplicationContext("springtest.xml");
	   Traingle tri=(Traingle)context.getBean("triangle");
	    //System.out.println(""+tri);
	    tri.getdraw();
	}

}
