package com.ibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.DAO.EmployeeDao;
import com.ibm.controller.NoEmployeeFoundException;
import com.ibm.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	public Iterable<Employee> findAll(){
		return employeeDao.findAll();
	}
	
	public Employee save(Employee employee) {
		return employeeDao.save(employee);
	}
	
	public Employee fingById(Integer eno) {
		if (eno<10) {

			return employeeDao.findByEno(eno);
		} else {

			throw new NoEmployeeFoundException("no emp found");
		}
	}
}
