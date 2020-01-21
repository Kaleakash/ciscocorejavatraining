class Car {
	int wheel;
	String color;
	float price;
	void start() {
		int temp=0;
		System.out.println(wheel);
		System.out.println(color);
		System.out.println(temp);
	}
	void stop() {
		String msg="Abc";
		System.out.println(wheel);
		System.out.println(color);
		System.out.println(msg);
	}
	
}
class CarTest {
	public static void main(String args[]) {
	System.out.println("Main Method");
	Car santro =new Car();
	santro.start();
	santro.stop();
	}
}




