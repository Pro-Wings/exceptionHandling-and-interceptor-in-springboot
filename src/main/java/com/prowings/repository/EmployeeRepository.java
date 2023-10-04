package com.prowings.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prowings.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	public Employee findEmployeeById(int id);
	
	public List<Employee> findAll();

	public Employee findEmployeeByName(String employeeName);

}
