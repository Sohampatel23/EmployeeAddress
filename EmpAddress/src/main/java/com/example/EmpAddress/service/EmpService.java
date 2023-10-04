package com.example.EmpAddress.service;

import com.example.EmpAddress.model.Emp;
import com.example.EmpAddress.repo.IEmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {

    @Autowired
    IEmpRepo iEmpRepo;

    public List<Emp> findAll() {
        return (List<Emp>) iEmpRepo.findAll();
    }

    public Emp findById(Long id) {
        return iEmpRepo.findById(id).get();
    }

    public String addEmployee(Emp employee) {
        iEmpRepo.save(employee);
        return "Employee added";
    }

    public String deleteById(Long id) {
        iEmpRepo.deleteById(id);
        return "Employee deleted";
    }
}
