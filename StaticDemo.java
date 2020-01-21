class Abc {
	int a;
	static int b;
	void dis1() {
		System.out.println("a "+a);
		System.out.println("b "+b);
	}
	static Abc obj; 	
	static void dis2() {
		obj = new Abc();
		System.out.println("static method "+obj.a);
	}
}
class StaticDemo {
	public static void main(String args[]) {
	Abc.dis2();
	/*Abc obj1 = new Abc();
	Abc obj2 = new Abc();
	obj1.a=10;
	obj1.b=20;
	Abc.b=30;
	obj2.a=40;
	obj2.b=50;
	Abc.b=60;
	obj1.dis1();		obj2.dis1();*/		
	}
}