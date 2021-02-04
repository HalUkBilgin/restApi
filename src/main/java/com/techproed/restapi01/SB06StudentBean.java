package com.techproed.restapi01;

public class SB06StudentBean {
	
	private String name;
	private int id;
	private String gender;
	
	public SB06StudentBean() {
	}
	public SB06StudentBean(String name, int id, String gender) {
		this.name = name;
		this.id = id;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "SB06StudentBean [name=" + name + ", id=" + id + ", gender=" + gender + "]";
	}

}
