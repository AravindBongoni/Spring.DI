package com.DI;

public class Employee {
private int id;
private String name;
private float salary;
private String designation;
public Employee(int id, String name, float salary, String designation) {
	
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.designation = designation;
}

public int getId() {
	return id;
}
public String getName() {
	return name;
}
public float getSalary() {
	return salary;
}
public String getDesignation() {
	return designation;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation + "]";
}
}
