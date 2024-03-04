package com.my.ems.server_side.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.my.ems.server_side.Dao.EmployeeDao;
import com.my.ems.server_side.Entities.employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired  
    private EmployeeDao employeeDao;

    @Override
    public employee add(employee e){
           employee emp = employeeDao.save(e);
           return emp;
    }

}
