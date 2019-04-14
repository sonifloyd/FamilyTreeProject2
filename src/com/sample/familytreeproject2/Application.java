package com.sample.familytreeproject2;

import java.util.Map;


import com.sample.familytreeproject2.bean.Person;
import java.util.Scanner;

public class Application {

	// take person name as input

	public static void main(String[] args) {
		///

		FamilyData familyData = new FamilyData();
		Map<String, Person> personMap = familyData.createFamilyData();
		// for each loop
		for(String key:personMap.keySet()) {
			System.out.println(key + personMap.get(key));
		}
			
		//System.out.println("list of Data " + personMap);
		System.out.println(" Enter name ");
		Scanner sc =new Scanner(System.in);

		String input =sc.next();

		//String name = "Rameshwar";// take from input
		//Person person = personMap.get(name);

		System.out.println(personMap.get(input));

	}
}
