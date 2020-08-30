package com.ibm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	public Employee findByEno(Integer eno);
}
