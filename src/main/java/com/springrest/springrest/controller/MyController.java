package com.springrest.springrest.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Employee;
import com.springrest.springrest.services.EmpService;

@RestController
public class MyController {
	
	@Autowired
	private EmpService empService;
	
	@GetMapping("/home")
	public String home() {
		return "we are at my application";
	}
	
	@GetMapping("/emp")
	public List<Employee> getEmps(){
		return this.empService.getEmps();	
	}	
	
	@GetMapping("/emp/{empId}")
	public Employee getEmp(@PathVariable String empId){
		return this.empService.getEmp(Long.parseLong(empId));
	}
	
	@PostMapping("/emps")
	public Employee addEmp(@RequestBody Employee emp) {
		return this.empService.addEmp(emp);
	}
	
	@PutMapping("/emps/{empId}")
	public Employee updateEmp(@RequestBody Employee emp, @PathVariable("empId") int empId) {
		return this.empService.updateEmp(emp, empId);

	}
	@DeleteMapping("/emps/{empId}")
	public void deleteEmp(@PathVariable ("empId") int empId ) {
		this.empService.deleteEmp(empId);
	}
}
