package com.ws.rest.first.rest;

import java.util.List;
import java.util.Optional;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ws.rest.first.rest.repo.PersonRepo;



@Path("/person")
public class PersonResource {
	
	static PersonRepo repo;
	static {
		repo = new PersonRepo();
	}

	
	@GET
	@Path("allpersons")
	@Produces(MediaType.APPLICATION_XML)
	public List<Person> getPersons() {
		
		System.out.println("called getPersons...");
		
		return repo.getPersons();
	}
	
	@GET
	@Path("firstperson")
	@Produces(MediaType.APPLICATION_XML)
	public Person getFirstPerson() {
		
		System.out.println("called getFirstPerson...");
		
		return repo.getPersons().get(0);
	}
	
	@GET
	@Path("getperson/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Person getPerson(@PathParam("id") int id) {
		
		System.out.println("called getFirstPerson...");
		 Optional<Person> opt = repo.getPerson(id); 
		 if(opt.isPresent()) {
			 return opt.get();
		 }
		return null;
	}	
	
	@POST
	@Path("createperson")
	public Person CreatePerson(Person p) {
		System.out.println(p);
		repo.create(p);
		return p;
	}

}
