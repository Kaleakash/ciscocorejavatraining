import java.io.*;
class Employee implements Serializable{
	private int id;
	private String name;
	private float salary;
	Employee() {}
	Employee(int id, String name, float salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public String toString() {
		return "id is = "+id+" name is "+name+" salary is "+salary;
	}
}
class IODemo {
	public static void  main(String args[]) throws Exception{
	/*Employee emp1 = new Employee(1,"Ravi",12000);
	System.out.println(emp1);	
	FileOutputStream fos = new FileOutputStream("emp.txt");
	ObjectOutputStream bos = new ObjectOutputStream(fos);
	bos.writeObject(emp1);
	System.out.println("Object Serialization done successfully");*/

	FileInputStream fis = new FileInputStream("emp.txt");
	ObjectInputStream ois = new ObjectInputStream(fis);
	Employee emp2= (Employee)ois.readObject();
	System.out.println(emp2);	
	}
}


