package com.jdbcexicute;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

public class EmpDao
{
	private JdbcTemplate jdbctemplet;

	public JdbcTemplate getJdbctemplet() {
		return jdbctemplet;
	}

	public void setJdbctemplet(JdbcTemplate jdbctemplet) {
		this.jdbctemplet = jdbctemplet;
	}
	
	/*boolean save(EmpModel e)
	{
		String sql = "insert into emptable (empid,empname,empsalary) values (?,?,?)";
		return jdbctemplet.execute(sql,new PreparedStatementCallback<Boolean>()
		{
			@Override
			public Boolean doInPreparedStatement(PreparedStatement pst) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				pst.setInt(1, e.getId());
				pst.setString(2, e.getEmpname());
				pst.setFloat(3, e.getEmpsalary());
				return pst.execute();
			}
	  });*/
	
	/*boolean updateobject(EmpModel e)
	{
		String sql = "update emptable set empname=? ,empsalary=?  where empid=? ";
		return jdbctemplet.execute(sql,new PreparedStatementCallback<Boolean>()
		{
			@Override
			public Boolean doInPreparedStatement(PreparedStatement pst) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				pst.setString(1, e.getEmpname());
				pst.setFloat(2, e.getEmpsalary());
				pst.setInt(3, e.getId());
				return pst.execute();
			}
		});*/
	
	boolean deleteobject(int id)
	{
		String sql = "delete from emptable where empid= ? ";
		return jdbctemplet.execute(sql, new PreparedStatementCallback<Boolean>()
		{
			@Override
			public Boolean doInPreparedStatement(PreparedStatement pst) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				pst.setInt(1, id);
				return pst.execute();
			}
		});
		
		
		
	}
}
