package com.ibm.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ibm.model.Employee;
import com.ibm.repository.EmployeeRepository;

@Repository
public class EmployeeDao {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Iterable<Employee> findAll(){
		return employeeRepository.findAll();
	}
	
	public Employee save(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	
	public Employee findByEno(Integer eno) {
		return employeeRepository.findByEno(eno);
	}
}
