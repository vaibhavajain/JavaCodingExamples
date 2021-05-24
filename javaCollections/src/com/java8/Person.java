package com.java8;

public class Person {
	private String name;
	private int age;
	private char gender;
	private Boolean isAlive;

	
	public Person(String name, int age, char gender, Boolean isAlive) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.isAlive = isAlive;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public Boolean getIsAlive() {
		return isAlive;
	}

	public void setIsAlive(Boolean isAlive) {
		this.isAlive = isAlive;
	}

}
