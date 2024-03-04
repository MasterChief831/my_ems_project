package com.my.ems.server_side.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.my.ems.server_side.Entities.employee;
@Repository
public interface EmployeeDao extends JpaRepository<employee, Integer> {

}

