package com;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;;

public class DemoTest {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded successfully...");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
			System.out.println("Connected successfully..");
			Statement stmt = con.createStatement();
			//Select Query 
			/*	ResultSet rs	= stmt.executeQuery("select * from employee");
				while(rs.next()) {
						int id = rs.getInt(1);
						String name= rs.getString(2);
						float salary = rs.getFloat(3);
						System.out.println(" Id is "+id +" Name is "+name+" Salary is "+salary);
						Employee emp= new Employee();
						emp.setId(id);
						emp.setName(name);
						emp.setSalary(salary);
				}
				rs.close();
				*/
				//Insert Query 
				/*int temp = stmt.executeUpdate("insert into employee values(3,'Ajay',16000)");
				if(temp>0) {
					System.out.println("Record inserted successfully....");
				}*/
				//Delete Query 
				/*int temp = stmt.executeUpdate("delete from employee where id =1");
				if(temp>0) {
					System.out.println("Record deteled successfully");
				}else {
					System.out.println("Record not present");
				}*/
				//Update Query 
			
			/*int temp = stmt.executeUpdate("update employee set salary = salary+200 where id=2");
			if(temp>0) {
				System.out.println("Record update successfully");
			}else {
				System.out.println("Record not present");
			}*/
				//Insert Record through PreparedStatment using Scanner 
			PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?)");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the id");
			int id = sc.nextInt();
			pstmt.setInt(1, id);
			System.out.println("Enter the name");
			String name = sc.next();
			pstmt.setString(2, name);
			System.out.println("Enter the salary");
			float salary = sc.nextFloat();
			pstmt.setFloat(3, salary);
			int temp = pstmt.executeUpdate();
			if(temp>0) {
				System.out.println("Record inserted successfully");
			}
				stmt.close();
				con.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
