class Employee {
	final int id;
	final String name;
	Employee() {
		id =100;
		name="Ravi";
	}
	void setInfo(final int abc) {
		System.out.println(abc);
		//abc=100;
		System.out.println(abc);
	}
	void dis() {
		System.out.println("Id is "+id);
		System.out.println("Name is "+name);
	}
}

class PolyDemo {
	public static void  main(String args[]){
	Employee emp1 = new Employee();
	emp1.dis();	
	emp1.setInfo(123);
	}
}