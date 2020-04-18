package com.example.anurag.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.anurag.entity.Employee;
@Repository
public interface EmployeeDao extends JpaRepository<Employee,Integer>{



}
