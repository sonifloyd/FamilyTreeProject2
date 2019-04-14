package com.sample.familytreeproject2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sample.familytreeproject2.bean.Person;
import com.sample.familytreeproject2.bean.Relation;

public class FamilyData {
	public Map<String, Person> createFamilyData() {
		// person data for Papa
		Relation papaRelation = new Relation("Charami Mahto", "Father");
		Relation papatomummy = new Relation("sudama","wife");
		Relation papatoranjeet = new Relation(" Ranjeet","son");
		List<Relation> papaRelationList = new ArrayList<>();
		papaRelationList.add(papaRelation);
		papaRelationList.add(papatomummy);
		papaRelationList.add(papatoranjeet);
		
		Person papa = new Person("Rameshwar", 80, "VLW", "male", papaRelationList);
		//System.out.println(papa.toString());

		// mummy data for mummy
		Relation mummyRelation = new Relation("Rameshwar", "Husband");
		Relation mummytoranjeet = new Relation(" Ranjeet"," son");
		List<Relation> mummyRelationList = new ArrayList<>();
		mummyRelationList.add(mummyRelation);
		mummyRelationList.add(mummytoranjeet);
		Person mummy = new Person("sudama", 65, "housewife", "female", mummyRelationList);
		//System.out.println(mummy.toString());

		// Ranjeet data
		Relation papatoRelation = new Relation("Rameshwar"," Father");
		Relation mummytoRelation = new Relation(" sudama","Mummy");
		List<Relation> ranjeetRelationList = new ArrayList<>();
		ranjeetRelationList.add( papaRelation);
		ranjeetRelationList.add( mummyRelation);
		Person ranjeet = new Person("Ranjeet",28,"software enginner"," Male", ranjeetRelationList);

		//
		Map<String, Person> personMap = new HashMap<>();
		personMap.put(papa.getName(), papa);
		personMap.put(mummy.getName(),mummy);
		personMap.put(ranjeet.getName(), ranjeet);

		return personMap;
		
	}

}
