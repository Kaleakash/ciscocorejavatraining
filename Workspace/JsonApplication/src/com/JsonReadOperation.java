package com;

import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonReadOperation { 

	public static void main(String[] args) throws Exception{
		
		JSONParser obj = new JSONParser();
		
		JSONObject emp = (JSONObject)obj.parse(new FileReader("emp.json"));
		System.out.println("Name is "+emp.get("name"));
		Map add = (Map)emp.get("add"); 
		System.out.println("city is "+add.get("city"));
		
		Map empInfo =(Map)emp;			//type casting for map 
		Set ss = empInfo.entrySet();			//converting map to set 
		Iterator li = ss.iterator();
		while(li.hasNext()) {
			Map.Entry mm = (Map.Entry)li.next();		// converting set to map 
			System.out.println("Key "+mm.getKey());
		}
	}

}
