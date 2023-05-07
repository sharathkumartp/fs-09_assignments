package com.geekster.Employeeaddress.service;

import com.geekster.Employeeaddress.model.Address;
import com.geekster.Employeeaddress.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    IAddressRepo addressRepo;

    public List<Address> getAll() {
        return addressRepo.findAll();
    }

    public Address getAddress(Long id) {
        return addressRepo.getAddressById(id);
    }

    public void saveAddress(Address address) {
        addressRepo.save(address);
    }

    public void update(Address newAddress, Long id) {
        Address address=addressRepo.getAddressById(id);
        address.setCity(newAddress.getCity());
        address.setId(newAddress.getId());
        address.setState(newAddress.getState());
        address.setZipcode(newAddress.getZipcode());
        address.setStreet(newAddress.getStreet());

        addressRepo.save(address);
    }

    public void deleteAddress(Long id) {
        addressRepo.deleteAddressById(id);
    }
}
