package com.qa.main;

public class People {

	private String name;
	private int age;
	private String jobTitle;

	// empty constructor (default if no constructors)
	public People() {
		super();
	}

	// 'other' constructor
	public People(String name, int age, String jobTitle) {
		super();
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
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

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	@Override
	public String toString() {
		return "Name: " + name + "\tAge: " + age + "\nJob Title: " + jobTitle;
	}

}
