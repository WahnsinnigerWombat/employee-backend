package com.helloSpring.firstSpringApp.dao;

import com.helloSpring.firstSpringApp.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDao extends CrudRepository<Employee,Integer> {
}
