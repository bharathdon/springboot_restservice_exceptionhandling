package com.ibm.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.model.Employee;
import com.ibm.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping(path = "/findAll")
	public Iterable<Employee> findAll() {

		return employeeService.findAll();
	}

	@PostMapping(path = "/insert")
	public ResponseEntity<String> save(@Valid @RequestBody Employee employee) {
		employeeService.save(employee);
		return ResponseEntity.ok("inserted");
	}

//	@GetMapping(path = "/getEmp")
//	public Employee findByEno(@RequestParam("eno") Integer eno) {
//		return employeeService.fingById(eno).orElseThrow(()-> new NoEmployeeFoundException("no emp found"));
//	}
	
	@GetMapping(path = "/getEmp")
	public Employee fingByEno(@RequestParam("eno") Integer eno){
		return employeeService.fingById(eno);
	}

}
