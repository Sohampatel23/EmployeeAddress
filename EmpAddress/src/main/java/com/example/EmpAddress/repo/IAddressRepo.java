package com.example.EmpAddress.repo;

import com.example.EmpAddress.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<Address,Long> {
}
