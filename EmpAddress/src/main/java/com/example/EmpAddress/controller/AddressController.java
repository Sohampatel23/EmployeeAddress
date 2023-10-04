package com.example.EmpAddress.controller;

import com.example.EmpAddress.model.Address;
import com.example.EmpAddress.service.AdressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    AdressService adressService;

    @GetMapping
    public List<Address> getAllAddresses() {
        return adressService.findAll();
    }

    @GetMapping("address/{Addressid}")
    public Address getAddressById(@PathVariable Long id) {

        return adressService.findById(id);
    }

    @PostMapping("address")
    public String createAddress(@RequestBody Address address) {

        return adressService.addAddress(address);
    }

    @PutMapping("update/{id}/{zip}")
    public String updateAddress(@PathVariable Long id, @PathVariable String zip) {

        return adressService.updateZip(id,zip);
    }

    // DELETE /addresses/{id} - delete an address by id
    @DeleteMapping("delete/{addressid}")
    public String deleteAddress(@PathVariable Long id) {

        return adressService.deleteAddress(id);
    }
}
