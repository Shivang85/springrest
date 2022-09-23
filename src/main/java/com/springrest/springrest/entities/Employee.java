package com.springrest.springrest.entities;
public class Employee {
	 private long id;
	 private String role;
	 private String manager;
	 private int salary;
	 private String dept;
	 
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Employee(long id, String role, String manager, int salary, String dept) {
		super();
		this.id = id;
		this.role = role;
		this.manager = manager;
		this.salary = salary;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", role=" + role + ", manager=" + manager + ", salary=" + salary + ", dept="
				+ dept + "]";
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	 
}
