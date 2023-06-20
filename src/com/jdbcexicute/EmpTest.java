package com.jdbcexicute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpTest {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("jdbcexicute.xml");
		EmpDao dao = (EmpDao)context.getBean("dao");
		EmpModel e1 = new EmpModel();
		
		//insert
		
		/*e1.setId(4);
		e1.setEmpname("mayurShree");
		e1.setEmpsalary(80000f);
		boolean bool =dao.save(e1);
		if(!bool)
		{
			System.out.println("Record saved");
		}*/
		
		//update
		
		/*e1.setId(1);
		e1.setEmpname("vaishali");
		e1.setEmpsalary(50000f);
		boolean bool =dao.updateobject(e1);
		if(!bool)
		{
			System.out.println("Record update");
		}*/
		
		Boolean bool = dao.deleteobject(4);
		if(!bool)
		{
			System.out.println("Record deleted");
		}
		

	}

}
