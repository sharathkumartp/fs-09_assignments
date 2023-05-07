package com.geekster.Employeeaddress.repository;

import com.geekster.Employeeaddress.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Locale;

@Repository
public interface IAddressRepo extends JpaRepository<Address, Locale> {
   public List<Address> findAll();

   @Query(value = "select * from address where id= :id",nativeQuery = true)
  public Address getAddressById(Long id);

   @Query(value = "delete from address where id= :id",nativeQuery = true)
   public void deleteAddressById(Long id);
}
