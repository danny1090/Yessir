package com.class34;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PersonTest {

	public static void main(String[] args) {
		
		Map<Integer, Person> personMap=new HashMap<>();
		personMap.put(1, new Person("Bob", "Howard", 42, 85000));
		personMap.put(2, new Person("James", "Smith", 25, 87000));
		personMap.put(3, new Person("Danny", "Cabrera", 20, 95000));
		personMap.put(4, new Person("John", "Jones", 30, 100000));
		
		Collection<Person> personVal=personMap.values();
		for(Person person: personVal) {
			person.printUserDetails();
			
			
		}	
	}
}
