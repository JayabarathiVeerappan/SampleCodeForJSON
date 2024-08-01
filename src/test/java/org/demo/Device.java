package org.demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Device {

	public static void main(String[] args) throws IOException, ParseException {
		FileReader file = new FileReader("C:\\Users\\sindh\\eclipse-workspace\\Device\\src\\test\\resources\\DB.json");
		JSONParser jsonParser = new JSONParser();
		Object parse = jsonParser.parse(file);
		JSONObject jsonObject = (JSONObject)parse;
		System.out.println(jsonObject.get("name"));
		System.out.println(jsonObject.get("id"));
		System.out.println(jsonObject.get("qualification"));
		System.out.println(jsonObject.get("address"));
		System.out.println(jsonObject.get("email"));
		System.out.println(jsonObject.get("Mobile"));
		System.out.println(jsonObject.get("Dob"));
		System.out.println(jsonObject.get("isstudent"));
		
	}

}
