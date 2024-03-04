package com.my.ems.server_side.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.my.ems.server_side.Entities.employee;
import com.my.ems.server_side.Services.EmployeeServiceImpl;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeServiceImpl employeeService;


    @PostMapping("/emp")
    public ResponseEntity<employee> post(@RequestBody employee e){
        employee emp= employeeService.add(e);
        System.out.println(emp);
        return ResponseEntity.ok(emp);
    }
    
}
