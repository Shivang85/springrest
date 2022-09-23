package com.springrest.springrest.services;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import com.springrest.springrest.entities.Employee;


@Service
public class EmpServiceImpl implements EmpService {
	List<Employee> list;
	public EmpServiceImpl() {
		list =new ArrayList<>();
		list.add(new Employee(11, "Support", "Mansingh", 38837 , "Mechanical"));
		list.add(new Employee(12, "Developer", "Kapil", 33332, "Civil"));
	}
	@Override
	public List<Employee> getEmps() {
		
		return list;
	}
	
	@Override
	public Employee getEmp(long empId) {
		
		Employee c = null;
		for (Employee course:list) {
			if(course.getId()==empId) {
				c =course;
				break;
			}
		}
			
		return c;
	}
	@Override
	public Employee addEmp(Employee emp) {
		list.add(emp);
		return emp;
	}
	
	public Employee updateEmp(Employee emp, int empId) {
		list.stream().map(b->{
			if (b.getId()==empId){
				b.setRole(emp.getRole());
				b.setManager(emp.getManager());
				b.setDept(emp.getDept());
				b.setSalary(emp.getSalary());
				
			}
			return b;
		}).collect(Collectors.toList());
		return emp;
	
	}
	
	public void deleteEmp(int empId) {
		list = list.stream().filter(emp ->emp.getId()!=empId).collect(Collectors.toList());
	
	}
}
