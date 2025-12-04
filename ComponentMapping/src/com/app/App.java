package com.app;


import com.dao.EmployeeDao;
import com.dao.EmployeeDaoFactory;
import com.entity.Address;
import com.entity.Employee;

public class App {
	public static void main(String[] args) {
		
		Address address=new Address();
		address.setLandMark("Baramti");
		address.setState("MH");
		address.setCity("Pune");
		address.setPincode(412304);
		
		
		Employee employee =new Employee();
		employee.setName("Atharv Jagdale");
		employee.setSalary(20000.0);
		
		employee.setAddress(address);
		
		EmployeeDao employeeDao=EmployeeDaoFactory.getEmployeeDao();
		
		employeeDao.saveEmployee(employee);
		
		System.out.print("-------");
		
		
	}

}
