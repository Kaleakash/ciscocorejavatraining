package com;
import java.util.ArrayList;
import java.util.List;
public class EmployeeService {
	public float getUpdatedSalary(Employee emp) {
					//coding 
			return emp.getSalary()+2000;
		}
		public Employee getEmpInfo() {
			//get emp info from DB using JDBC
			Employee emp = new Employee(1,"Ravi",14000);
			return emp;
		}
		public List<Employee> getEmployeesInfo() {
			List<Employee> listOfRec = new ArrayList<Employee>();
			listOfRec.add(new Employee(1,"Ramesh",16000));
			listOfRec.add(new Employee(2,"Rajesh",18000));
			listOfRec.add(new Employee(3,"Ram",20000));
			return listOfRec;
		}
}
