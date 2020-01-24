package com;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class EmployeeServiceTest {

	@Test
	public void testGetUpdatedSalary() {
		//fail("Not yet implemented");
		EmployeeService es = new EmployeeService();
		Employee emp = new Employee(1,"Ravi",14000);
		float updatedSalary = es.getUpdatedSalary(emp);
		assertEquals(emp.getSalary()+2000, updatedSalary,0.0);
	}

	@Test
	public void testGetEmpInfo() {
		//fail("Not yet implemented");
		EmployeeService es = new EmployeeService();
					Employee emp =	 es.getEmpInfo();
					assertNotNull(emp);
					assertEquals(1, emp.getId());
					assertEquals("Ravi",emp.getName());
					assertEquals(14000, emp.getSalary(),0.0);
	}

	@Test
	public void testGetEmployeesInfo() {
		//fail("Not yet implemented");
		EmployeeService es = new EmployeeService();
		List<Employee>  listOfRec = es.getEmployeesInfo();
		
		assertEquals(3, listOfRec.size());
		Employee emp =listOfRec.get(0);
		assertEquals(1, emp.getId());
		assertEquals("Ram", emp.getName());
		assertEquals(16000, emp.getSalary(),0.0);
		
	}

}
