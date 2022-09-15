package com.cliente.mongo.entity;

import org.springframework.data.mongodb.core.mapping.Field;

// no va Document porque no es una collecion diferente
public class Deparment {
	
	@Field(name= "departmen_name")
	private String departmentName;
	
	/*
	 * no lleva anotacion cuando hace match con tu mongodb y el campo de la anotacion
	 */
	private String location;  
	//
	
	
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Deparment [departmentName=" + departmentName + ", location=" + location + "]";
	}
	
	
	

}
