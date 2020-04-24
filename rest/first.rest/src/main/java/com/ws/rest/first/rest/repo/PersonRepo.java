package com.ws.rest.first.rest.repo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.ws.rest.first.rest.Person;

public class PersonRepo {
	List<Person> persons;
	
	public PersonRepo() {
		persons = new ArrayList<Person>();
		
		Person p = new Person();
		p.setId(10);
		p.setName("Marc");
		p.setAge(44);
		p.setAddress("Street 1");
		p.setGender("M");
		
		Person p1 = new Person();
		p1.setId(20);
		p1.setName("Peter");
		p1.setAge(25);
		p1.setAddress("Street 2");
		p1.setGender("M");
		
		persons.add(p);
		persons.add(p1);
	}
	
	public List<Person> getPersons(){
		return persons;
	}
	
	public Optional<Person> getPerson(int id){
		return persons.stream().filter(p -> p.getId() == id).findFirst();
	}

	public void create(Person p) {
		persons.add(p);
	}
}
