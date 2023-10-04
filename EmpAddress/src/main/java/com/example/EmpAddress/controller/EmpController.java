package com.example.EmpAddress.controller;

import com.example.EmpAddress.model.Emp;
import com.example.EmpAddress.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {

    @Autowired
    EmpService empService;

    @GetMapping
    public List<Emp> getAllEmployees() {
        return empService.findAll();
    }

    @GetMapping("/{id}")
    public Emp getEmployeeById(@PathVariable Long id) {
        return empService.findById(id);
    }

    @PostMapping("Employee")
    public String createEmployee(@RequestBody Emp employee) {

        return empService.addEmployee(employee);
    }

    @DeleteMapping("/deleteEmp")
    public String deleteEmployee(@PathVariable Long id) {

        return empService.deleteById(id);
    }
}
