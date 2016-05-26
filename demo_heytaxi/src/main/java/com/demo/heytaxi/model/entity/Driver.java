package com.demo.heytaxi.model.entity;

public class Driver {
	
	private String name;
	private Long id;
	private Integer age;
	private String type;
	
	public Driver(){
		
	}
	
	public Driver(String name){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
