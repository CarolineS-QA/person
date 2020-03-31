package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		// uses the empty constructor (the default if there are no constructors)
		People people = new People();
		people.setName("Example Bob");
		people.setAge(29);
		people.setJobTitle("Builder Boi");
		// uses the other constructor
		People personOne = new People("Mary Margret", 38, "School Teacher");
		People personTwo = new People("David Nolan", 40, "Policeman");
		People personThree = new People("Henry Mills", 22, "Student");

		// uses the empty constructor
		System.out.println(people.toString());

		// uses the other constructor
		System.out.println(personOne.toString());

		// peoplelist
		PeopleList plist = new PeopleList();
		plist.addPerson(new People("Alex After", 16, "Contract Killer"));
		System.out.println(plist);
//		peopl.toString();
//		personTwo.toString()
//		public static String findPeople() {
//			
//		}

	}

}
