package service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import bean.Employee;

public class EmployeeService {

		List<Employee> listOfRec = new ArrayList<Employee>();
		
		public void addEmployee(Employee emp) {
			listOfRec.add(emp);
			System.out.println("Record added successfully");
		}
		public void deleteEmployee(int id) {
			Iterator<Employee> li = listOfRec.iterator();
			while(li.hasNext()) {
				Employee e = li.next();
						if(e.getId()==id) {
							li.remove();
							System.out.println("Record deleted..");
						}
			}
		}
		public void updateEmployee(int id, float salary) {
			Iterator<Employee> li = listOfRec.iterator();
			while(li.hasNext()) {
				Employee e = li.next();
						if(e.getId()==id) {
							e.setSalary(e.getSalary()+salary);
							System.out.println("Record updated..");
						}
			}
		}
		public void retriveEmployee() {
			System.out.println("All Employee details are ");
			Iterator<Employee> li = listOfRec.iterator();
			while(li.hasNext()) {
				Employee e = li.next();
				System.out.println(e);
			}
		}
}
