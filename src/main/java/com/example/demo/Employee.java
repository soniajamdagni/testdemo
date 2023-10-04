package com.example.demo;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Employee {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private int id;

  private String name;

  private int age;

  public Integer getId() {
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

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}


}