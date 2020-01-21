import java.util.Scanner;
class Employee {
	int id;
	String name;
	float salary;
	Scanner obj = new Scanner(System.in);
	Address add = new Address();
	void read() {
		System.out.println("Enter the id");
		id = obj.nextInt();
		System.out.println("Enter the name");
		name = obj.next();
		System.out.println("Enter the salary");
		salary = obj.nextFloat();
	}
	
	void calSalary() {
		float hra, da,pf;
		hra = salary*0.10f;
		da = salary*0.05f;
		pf = 0.07f*salary;
		salary = salary+hra+da-pf;
	}
	
	void display(){
		System.out.println("Id is "+id);
		System.out.println("Name is "+name);
		System.out.println("Salary is "+salary);
	}
}
class Manager extends Employee {
	int numberOfEmp;
	void readMgr() {
		read();
		System.out.println("Enter the number of Emp");
		numberOfEmp = obj.nextInt();
		add.readAdd();
	}
	void disMgr() {
		display();
		System.out.println("Number of emp "+numberOfEmp);
		add.disAdd();
	}
}
class Programmer extends Employee {
	String projectName;
	void readPgr() {
		read();
		System.out.println("Enter the projectName");
		projectName = obj.next();
		add.readAdd();
	}
	void disPgr() {
		display();
		System.out.println("Project Name is "+projectName);
		add.disAdd();		
	}
}
class Address {
	String city;
	String state;
	Scanner obj = new Scanner(System.in);
	void readAdd() {
		System.out.println("Enter the city");
		city = obj.next();	
		System.out.println("Enter the state");
		state = obj.next();
	}
	void disAdd() {
		System.out.println("City is "+city);
		System.out.println("State is "+state);
	}
}

class EmployeeTest {
	
	public static void main(String args[]){
	/*Employee emp1 = new Employee();
	emp1.read();
	emp1.calSalary();
	emp1.display();
	Employee emp2 = new Employee();
	emp2.read();
	emp2.display();*/
	System.out.println("Enter the manager details");
	Manager mgr = new Manager();
	mgr.readMgr();
	mgr.disMgr();
	System.out.println("Enter the developer details");
	Programmer prg = new Programmer();
	prg.readPgr();
	prg.disPgr();
	}
}
