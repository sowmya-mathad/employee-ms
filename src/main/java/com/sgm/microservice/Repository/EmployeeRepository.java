package com.sgm.microservice.Repository;

import org.springframework.stereotype.Repository;

import com.sgm.microservice.dto.EmployeeDto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
 

@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeDto, Long>{

}
