import java.util.Scanner;
class Test {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the id");
			int id = obj.nextInt();
		obj.nextLine();		//hold the enter key
		System.out.println("Enter the name");
			String name = obj.nextLine();
		System.out.println("Enter the salary");
		float salary = obj.nextFloat();
		System.out.println("Id is "+id);
		System.out.println("Name is "+name);
		System.out.println("Salary is "+salary);

		
	}
}