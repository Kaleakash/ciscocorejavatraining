package com;

import java.io.FileOutputStream;
import java.io.PrintWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonWriteOperation {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		JSONObject obj = new JSONObject();
		obj.put("id", 100);
		obj.put("name","Ravi");
		obj.put("salary",12000);
		System.out.println(obj);
		
		JSONObject add = new JSONObject();
		add.put("city", "Bangalore");
		add.put("state","Kar");
		
		obj.put("add",add);
		System.out.println(obj);
		
		JSONArray skillInfo = new JSONArray();
		skillInfo.add("C");
		skillInfo.add("C++");
		skillInfo.add("Java");
		skillInfo.add("Oracle");
		
		obj.put("skillSet",skillInfo);
		System.out.println(obj);
		
		PrintWriter pw = new PrintWriter(new FileOutputStream("emp.json"));
		pw.write(obj.toJSONString());   //converting to string 
		pw.flush();
		

	}

}
