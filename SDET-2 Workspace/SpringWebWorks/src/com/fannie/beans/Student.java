package com.fannie.beans;

public class Student {
	   private Integer age;
	   private String name;
	   private Integer id;
	   
	   public Student() {
		   this.age=33;
		   this.name="Harry";
	   }
	   
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	   
}
