package com.Set;

public class Employee {
private int id;
private String name;
private float salary;
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public float getSalary() {
	return salary;
}

public void setId(int id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}
public void setSalary(float salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}


}
