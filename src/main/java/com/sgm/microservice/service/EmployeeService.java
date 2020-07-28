package com.sgm.microservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgm.microservice.Repository.EmployeeRepository;
import com.sgm.microservice.dto.EmployeeDto;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	public List<EmployeeDto> getEmployees() {
		return (List<EmployeeDto>) employeeRepository.findAll();
	}
	public void addEmployee(EmployeeDto employeeDto)
	{
		employeeRepository.save(employeeDto);
	}
}
