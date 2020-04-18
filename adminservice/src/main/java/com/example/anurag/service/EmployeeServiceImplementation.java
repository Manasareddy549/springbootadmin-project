package com.example.anurag.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.anurag.dao.EmployeeDao;
import com.example.anurag.entity.Employee;

@Service
@Transactional
public class EmployeeServiceImplementation implements EmployeeService{
	@Autowired
	EmployeeDao  empDao;
	public String createEmployee(Employee emp)
	{
		
	empDao.save(emp);
	return "account created successfully";
		
	}
}
