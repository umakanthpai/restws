package com.ws.rest.first.rest;


import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class PersonClient {

	public static void main(String[] args) {
		Client personClient = Client.create();
		WebResource resource = personClient.resource("http://localhost:8080/first.rest/webresources").path("/person/firstperson");
		ClientResponse clientResponse = resource.accept(MediaType.APPLICATION_XML).get(ClientResponse.class);
		
		String entity = clientResponse.getEntity(String.class);
		System.out.println(entity);	}
}
