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
		p.setName("Pai");
		p.setAge(50);
		p.setAddress("Glemsweg 8/4");
		p.setGender("M");
		
		Person p1 = new Person();
		p1.setId(20);
		p1.setName("Neel Pai");
		p1.setAge(15);
		p1.setAddress("Glemsweg 8/4");
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
