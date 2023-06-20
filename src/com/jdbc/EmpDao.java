package com.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//import org.omg.CORBA.Context;
//import org.omg.CORBA.ContextList;
//import org.omg.CORBA.DomainManager;
//import org.omg.CORBA.ExceptionList;
//import org.omg.CORBA.NVList;
//import org.omg.CORBA.NamedValue;
//import org.omg.CORBA.Object;
//import org.omg.CORBA.Policy;
//import org.omg.CORBA.Request;
//import org.omg.CORBA.SetOverrideType;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;


public class EmpDao
{ 
	private JdbcTemplate jdbctemplet;


	public JdbcTemplate getJdbctemplet() {
		return jdbctemplet;
	}

	public void setJdbctemplet(JdbcTemplate jdbctemplet) {
		this.jdbctemplet = jdbctemplet;
	}
	
	/*public int save(EmployeeModel e)
	{
		String sql = "insert into emptable (empid,empname,empsalary) values ('"+e.getId()+"','"+e.getEmpname()+"','"+e.getEmpsalary()+"')";
		return jdbctemplet.update(sql);
	}*/
	
	/*public int updateobject(EmployeeModel e)
	{
		String sql = "update emptable set empname = '"+e.getEmpname()+"', empsalary='"+e.getEmpsalary()+"' where empid='"+e.getId()+"'";
		return jdbctemplet.update(sql);
	}*/
	
	/*public int deleteobject(int id)
	{
		String sql = "delete from emptable where empid='"+id+"'";
		return jdbctemplet.update(sql);
	}
	*/
	
	// Fetching Record using JdbcTemplate query() method ResultSetExtractor
	
	/*public List<EmployeeModel> getRecord()
	{
		String sql = "select  *  from emptable";
		return jdbctemplet.query(sql, new ResultSetExtractor<List<EmployeeModel>>() //here we create list
		{
			@Override
			public List<EmployeeModel> extractData(ResultSet rs) throws SQLException, DataAccessException
			{
				// TODO Auto-generated method stub
				List<EmployeeModel> list = new ArrayList<EmployeeModel>();
				while(rs.next())
				{
					EmployeeModel e = new EmployeeModel();
					e.setId(rs.getInt(1));
					e.setEmpname(rs.getString(2));
					e.setEmpsalary(rs.getFloat(3));
					list.add(e);
				}
				return list;
			}
			
		});
				
	}*/
	
	//Fetching Record using JdbcTemplate query() method using RowMapper
	
	public List<EmployeeModel> gerRcordUsingRowMapper()
	{
		String sql = "select * from emptable";
		return jdbctemplet.query(sql, new RowMapper<EmployeeModel>()  //here it take directctly from table we see it in int arg
		{
			@Override
			public EmployeeModel mapRow(ResultSet rs, int arg) throws SQLException {
				// TODO Auto-generated method stub
				EmployeeModel em = new EmployeeModel();
				em.setId(rs.getInt(1));
				em.setEmpname(rs.getString(2));
				em.setEmpsalary(rs.getFloat(3));
				return em;
			}
		});
	}
	// Retrieving Single Object using RowMapper interface
	
	/*public List<EmployeeModel>getSpecifiedEmployeeId(int id)
	{
		String sql = "select * from emptable where empid='"+id+"'";
		return jdbctemplet.query(sql, new RowMapper<EmployeeModel>() {
			@Override
			public EmployeeModel mapRow(ResultSet rs, int arg1) throws SQLException 
			{
				EmployeeModel em = new EmployeeModel();
				em.setId(rs.getInt(1));
				em.setEmpname(rs.getString(2));
				em.setEmpsalary(rs.getFloat(3));
				return em;
			}
		});
		
	}*/
	
	//Fetching Single Record using queryForObject() Method 
	
	/*public EmployeeModel getIdByqueryForObject(int id)
	{
		String sql = "Select * from emptable where empid='"+id+"'";
		return(EmployeeModel)jdbctemplet.queryForObject(sql, new Object[]{},new BeanPropertyRowMapper(EmployeeModel.class));
				
				}*/
	
	//Fetching single column Add method in StudentTest
	
	/*public String getEmpNameById(int id)
	{
		String sql = "select empname from emptable where empid='"+id+"'";
		return jdbctemplet.queryForObject(sql, new Object[]{},String.class);
	}*/
	
	//Count Number of entries in table using queryForObject
	
	/*public int getCount()
	{
		String sql = "select count(*) from emptable";
		return jdbctemplet.queryForObject(sql, Integer.class);//type of colomn is the type of .class eg Float.class
	}*/
	
	//queryforlist for fetching  all name in table 

	/*public List<String> getName()
	{
		String sql = "select empname from emptable";
		return jdbctemplet.queryForList(sql, String.class);
	}*/
	
	//list Of Object
	
	public List<EmployeeModel> getListOfObject(EmployeeModel e)
	{
		String sql = "select * from emptable";
		return jdbctemplet.queryForList(sql, EmployeeModel.class);
	}
}

