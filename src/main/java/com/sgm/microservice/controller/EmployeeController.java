package com.sgm.microservice.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgm.microservice.EmployeeMsApiApplication;
import com.sgm.microservice.dto.EmployeeDto;
import com.sgm.microservice.service.EmployeeService;
import com.sgm.microservice.utils.Constants;

@RestController
public class EmployeeController {

    private static final Logger LOGGER=LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping(value = Constants.GET_ALL_EMPLOYEES)
	public List<EmployeeDto> getEmployees()
	{
		LOGGER.info("EmployeeAPI::findAllEmployees - Start of findAllEmployees ");
		return employeeService.getEmployees();
	}
	
	@PostMapping(value = Constants.ADD_EMPLOYEE)
	public void addEmployee(@RequestBody EmployeeDto employeeDto)
	{
		employeeService.addEmployee(employeeDto);
	}
}
