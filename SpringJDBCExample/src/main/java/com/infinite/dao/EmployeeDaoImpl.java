package com.infinite.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;

import com.infinite.helper.EmployeeRowMapper;
import com.infinite.interfaces.IEmployeeDao;
import com.infinite.pojo.Employee;



/**
 * @author pradeepl This class is for DAO implementations
 *
 */
/**r
 * @author pradeepl
 *
 */
public class EmployeeDaoImpl implements IEmployeeDao {
	private DataSource dataSource = null;
	private JdbcTemplate jdbcTemplate = null;
	private PlatformTransactionManager transactionManager = null;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void setTransactionManager(PlatformTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}

	public void createTable() {
		// TODO Auto-generated method stub
		String sql = "create table employee (empid int primary key " + "auto_increment,firstname varchar(25),"
				+ "lastname varchar(25),salary numeric(8,2))";
		jdbcTemplate.execute(sql);
		System.out.println("table Created");

	}

	public void insertEmployee(Employee employee) {
		String sql="insert into employee(firstname,lastname,salary) "
				+ "values (?,?,?)";
		//var...args
		jdbcTemplate.update(sql, employee.getFirstname(), 
				employee.getLastname(), employee.getSalary());
		System.out.println("Record Inserted.");
		// TODO Auto-generated method stub
		System.out.println("Employee Record Inserted");
	}

	public void deleteEmployee(int employeeId) {
		// TODO Auto-generated method stub
		String sql="delete from employee where empid=?";
		int c=jdbcTemplate.update(sql,new Object[] {employeeId});
		if(c==0)
		{
			System.out.println("Employee Record is not Deleted");
		}
		else
		{
		System.out.println("Employee Record Deleted");
		}
	}

	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		String sql="select * from employee";
		List<Employee>employees=jdbcTemplate.query(sql,new EmployeeRowMapper(),new Object[]{});
		System.out.println("display all employee details");
		return employees;
	}
	public String findEmployeeName(int empId) {
		// TODO Auto-generated method stub
		String sql = "select firstname from employee where empid=?";
		String empName = jdbcTemplate.queryForObject(sql, String.class, empId);
		System.out.println("employee name Founded");
		return empName;
	}

	public Employee findEmployee(int empId) {
		// TODO Auto-generated method stub
		System.out.println("Found the Employee Id");
		return null;

	}

	public int countEmployees() {
		// TODO Auto-generated method stub
		String sql = "select count(*) from employee";
		int empName = jdbcTemplate.queryForObject(sql, Integer.class);
		System.out.println("employee count Founded");
		return empName;
	}
	public void addbonus(Employee employee, int experience) {
		// TODO Auto-generated method stub

	}
}