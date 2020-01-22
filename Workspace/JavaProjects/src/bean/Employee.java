package bean;

public class Employee {
private int id;
private String name;
private float salary;

	@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}

	public void empInfo() {
		System.out.println("Employee details");
	}
}
