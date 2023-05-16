package com.geekster.DataBaseRelationship.dao;

import com.geekster.DataBaseRelationship.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepo extends JpaRepository<Laptop,Integer> {
}
