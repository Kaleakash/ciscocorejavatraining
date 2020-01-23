package main;
import bean.Employee;
import service.EmployeeService;
public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee(1,"Ravi",12000);
		Employee e2 = new Employee(2,"Ramesh",14000);
		Employee e3 = new Employee(3,"Rajesh",16000);
		
		EmployeeService es = new EmployeeService();
		es.addEmployee(e1);
		es.addEmployee(e2);
		es.addEmployee(e3);
		es.retriveEmployee();
			es.deleteEmployee(2);
		es.retriveEmployee();
			es.updateEmployee(1, 500);
		es.retriveEmployee();
		
	}

}
