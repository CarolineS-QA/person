package com.qa.main;

import java.util.ArrayList;
import java.util.List;

public class PeopleList {

	// can replace People with Object,
	private List<People> listOfPeople = new ArrayList<>();

	// solution (helped)
	public boolean addPerson(People p) {
		return this.listOfPeople.add(p);
	}

	public People findPerson(String name) {
		for (People p : listOfPeople) {
			if (p.getName().equals(name)) {
				return p;
			}
		}
		return null;
	}
//	public listOfPeople.add(p)
//	listOfPeople.add(personOne);
//	listOfPeople.add(personTwo);
//	listOfPeople.add(personThree);
}
