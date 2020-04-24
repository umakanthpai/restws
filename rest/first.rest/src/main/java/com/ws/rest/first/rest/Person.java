package com.ws.rest.first.rest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person {
	String name;
	String address;
	String gender;
	int age;
	int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", gender=" + gender + ", age=" + age + ", id=" + id
				+ "]";
	}

  
}
