package com.mrprk.crud;

public class StudentData {

	private int id;
	private String name;
	private String location;
	private String dapertment;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDapertment() {
		return dapertment;
	}
	public void setDapertment(String dapertment) {
		this.dapertment = dapertment;
	}
	public StudentData(int id, String name, String location, String dapertment) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.dapertment = dapertment;
	}
	@Override
	public String toString() {
		return "StudentData [id=" + id + ", name=" + name + ", location=" + location + ", dapertment=" + dapertment
				+ "]";
	}
	public StudentData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
