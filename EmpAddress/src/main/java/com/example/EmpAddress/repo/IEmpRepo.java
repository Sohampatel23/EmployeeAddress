package com.example.EmpAddress.repo;

import com.example.EmpAddress.model.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmpRepo extends JpaRepository<Emp,Long> {
}
