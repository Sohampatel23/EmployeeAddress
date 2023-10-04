package com.example.EmpAddress.service;

import com.example.EmpAddress.model.Address;
import com.example.EmpAddress.model.Emp;
import com.example.EmpAddress.repo.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdressService {

    @Autowired
    IAddressRepo iAddressRepo;

    public List<Address> findAll() {
        return (List<Address>) iAddressRepo.findAll();
    }

    public Address findById(Long id) {
        return iAddressRepo.findById(id).get();
    }

    public String addAddress(Address address) {
        iAddressRepo.save(address);
        return "Address added";
    }

    public String updateZip(Long id, String zip) {
       Address address =  iAddressRepo.findById(id).get();
       address.setZipcode(zip);
       iAddressRepo.save(address);
       return "address updated";
    }

    public String deleteAddress(Long id) {
        iAddressRepo.deleteById(id);
        return"Address Deleted";
    }
}
