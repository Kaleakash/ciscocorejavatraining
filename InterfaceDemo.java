class Employee {
	int id;
	String name;
	float salary;
	Employee() {
		this.id = 123;
		this.name="Unknown";
		this.salary = 5000;
	}
	Employee(int id) {
		this();
		this.id = id;
	}
	Employee(int id, String name) {
		this(id);
		this.name = name;
	}
	Employee(int id, String name, float salary) {
		this(id,name);
		this.salary = salary;
	}
	void dis() {
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
	}
}
class InterfaceDemo {
	public static void main(String args[]) {
	Employee emp1 = new Employee();	emp1.dis();
	Employee emp2 = new Employee(100);	emp2.dis();
	Employee emp3 = new Employee(101,"Ravi");	emp3.dis();
	Employee emp4 = new Employee(102,"Ramesh",14000);emp4.dis();
	}
}