package com.geekster.Employeeaddress.controller;

import com.geekster.Employeeaddress.model.Address;
import com.geekster.Employeeaddress.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    @GetMapping(value = "/getAllAddress")
    public List<Address> getAllAddress(){
        return addressService.getAll();
    }

    @GetMapping(value = "/getAddressById")
    public Address getAddressById(@PathVariable Long id){
        return addressService.getAddress(id);
    }

    @PostMapping(value = "/saveAddress")
    public void addAddress(@RequestBody Address address){
        addressService.saveAddress(address);
    }

    @PutMapping(value = "/updateAddress")
    public void updateAddress(@RequestBody Address newAddress,@PathVariable Long id){
        addressService.update(newAddress,id);
    }

    @DeleteMapping(value = "/deleteAddress")
    public void deleteAddress(@PathVariable Long id){
        addressService.deleteAddress(id);
    }
}
