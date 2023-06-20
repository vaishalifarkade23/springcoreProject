package com.jdbc;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpTest {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("jdbc.xml");
		EmpDao dao1 = (EmpDao)context.getBean("dao");
		
		//insert
		
		/*EmployeeModel e1 = new EmployeeModel();
		e1.setId(5);
		e1.setEmpname("vaibhav");
		e1.setEmpsalary(90000.0f);
		int status = dao1.save(e1);
		if(status>0)
			System.out.println("Record is save");*/

		//update
		
		/*EmployeeModel e = new EmployeeModel();
		e.setId(2);
		e.setEmpname("shree");
		e.setEmpsalary(70000.0f);
		int status = dao1.updateobject(e);
		if(status>0)
			System.out.println("Record is update");*/
		
		//delete
		
		/*int status = dao1.deleteobject(2);
		if(status>0)
			System.out.println("Record is delete");*/
		
		// Fetching Record using JdbcTemplate query() method ResultSetExtractor
		
		/*List<EmployeeModel> list = dao1.getRecord();
		System.out.println("List of object available in list using  ResultSetExtractor");
		for(EmployeeModel e:list)
		{
			System.out.println("Employee Id:"+e.getId());
			System.out.println("Employee Name:"+e.getEmpname());
			System.out.println("Employee Salary:"+e.getEmpsalary());
		}*/
		
		//Fetching Record using JdbcTemplate query() method using RowMapper
		
		/*List<EmployeeModel> list = dao1.gerRcordUsingRowMapper();
		System.out.println("List of object available in list using RowMapper");
		for(EmployeeModel e:list)
		{
			System.out.println("Employee Id:"+e.getId());
			System.out.println("Employee Name:"+e.getEmpname());
			System.out.println("Employee Salary:"+e.getEmpsalary());
		}*/
		
		// Retrieving Single Object using RowMapper interface
		
		/*System.out.println("List of object available in list using RowMapper with specified id");
		List<EmployeeModel> list = dao1.getSpecifiedEmployeeId(1);
		for( EmployeeModel e : list)
		{
			System.out.println("Employee Id:"+e.getId());
			System.out.println("Employee Name:"+e.getEmpname());
			System.out.println("Employee Salary:"+e.getEmpsalary());
		}*/
		
		//Fetching Single Record using queryForObject() Method 
		
		/* System.out.println("Fetching Single record");
		 EmployeeModel e = (EmployeeModel)dao1.getIdByqueryForObject(1);
		    System.out.println("Employee Id:"+e.getId());
			System.out.println("Employee Name:"+e.getEmpname());
			System.out.println("Employee Salary:"+e.getEmpsalary());*/
		
		//Fetching single column Add method in StudentTest
		/*System.out.println("Fetching Single column name by id");
		String name = dao1.getEmpNameById(1);
		System.out.println("Employee Name:"+name);*/
		
		//Count Number of entries in table using queryForObject
		
		/*System.out.println("Count the Number of entries in table");
		int count = dao1.getCount();
		System.out.println("Count="+count);*/
		
		//querforObject for fetching  all name in table 
		/*System.out.println("Name in table is:");
		List<String> list = dao1.getName();
		System.out.println("Name:"+list);*/
		
		//List of object
//		List<EmployeeModel> list = dao1.getListOfObject();
//		Iterator itr = list.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println("List is:"+itr.next());
//		}
}

}
