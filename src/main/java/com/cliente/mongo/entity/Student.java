package com.cliente.mongo.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collection="student")
public class Student {
	@Id
	private String id;
	@Field(name="name")
	private String name;
	@Field(name="mail")
	private String email;
	
	
	private Deparment department;
	private List<Subject> subjects;
	
	/*
	 * Es necesario los constructores para mondodb pero la anotacion de PersistenceConstructor
	 * solo es necesario cuando tienes varios constructores , si no no es necesario
	 *  en las demas clases no es necesario poner el constructor ya que la unica collection
	 *  esta mapeada en esta clase  que es la que hace la persistencia 
	 */
	//@PersistenceConstructor
//	public Student(String id, String name, String email, Deparment department, List<Subject> subjects) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.email = email;
//		this.department = department;
//		this.subjects = subjects;
//	}
	
	
	
//	public Student(String id, Deparment department) {
//		super();
//		this.id = id;
//		this.department = department;
//	}



	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Deparment getDepartment() {
		return department;
	}
	public void setDepartment(Deparment department) {
		this.department = department;
	}
	public List<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", department=" + department
				+ ", subjects=" + subjects + "]";
	}
	
	

}
