class Emp implements Cloneable{
	private int id;
	private String name;
	private float salary;
	Emp(){}
	Emp(int id, String name, float salary){
		System.out.println("Object created...");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String toString() {
		return "id="+id+"name="+name+"salary="+salary;
	}

	public Emp getCloneInstance() throws Exception{
			Object obj = clone();
			Emp e= (Emp)obj;
			return e;
	}
}
class LangDemo {
	public static void main(String args[]) throws Exception{
	Emp e1 = new Emp(1,"Raj",12000);
	Emp e2 = new Emp(2,"Ravi",14000);
	Emp e3 = e1;
	System.out.println(e1);
	System.out.println(e2);
	System.out.println(e3);	
	Emp e4 = e3.getCloneInstance();
	System.out.println("After clone created....");
		System.out.println(e4);
	e3.setSalary(18000);
	System.out.println(e4);
		System.out.println(e3);
	System.out.println(e3.hashCode());
	System.out.println(e4.hashCode());
	
	}
}