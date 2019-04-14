package com.sample.familytreeproject2.bean;

public class Relation {
	private String name;
	private String relation;

	public Relation(String name, String relation) {
		this.name = name;
		this.relation = relation;

	}


@Override
	public String toString() {
		return "Relation [name=" + name + ", relation=" + relation + "]";
	}


	//get method
	public String getName() {
		return name;
	}

// set method
	public void setName(String name) {
		this.name = name;
	}

//get method
	public String getRelation() {
		return relation;
	}

//set method
	public void setRelation(String relation) {
		this.relation = relation;
	}

}

