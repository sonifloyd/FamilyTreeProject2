package com.sample.familytreeproject2.bean;

import java.util.List;
public class Person {
	private String name;
	private int age;
	private String job;
	private String gender;
	private List<Relation> relationList;

	public Person(String name, int age, String job, String gender, List<Relation> relationList) {
		this.name = name;
		this.age = age;
		this.job = job;
		this.gender = gender;
		this.relationList = relationList;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<Relation> getRelationList() {
		return relationList;
	}

	public void setRelationList(List<Relation> relationList) {
		this.relationList = relationList;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", job=" + job + ", gender=" + gender + ",\n relationList="
				+ relationList + "]";
	}

	

}

