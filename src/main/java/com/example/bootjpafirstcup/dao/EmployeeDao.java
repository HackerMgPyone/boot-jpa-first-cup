package com.example.bootjpafirstcup.dao;

import com.example.bootjpafirstcup.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employee,Integer> {
}
