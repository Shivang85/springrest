package com.springrest.springrest.services;
import java.util.List;
import com.springrest.springrest.entities.Employee;

public interface EmpService {
	public List<Employee> getEmps();
	public Employee getEmp(long empId);
	public Employee addEmp(Employee emp);
	public Employee updateEmp(Employee emp, int empId);
	public void deleteEmp(int empId);
	
}
