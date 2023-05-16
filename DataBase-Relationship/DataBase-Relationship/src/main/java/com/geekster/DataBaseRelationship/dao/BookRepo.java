package com.geekster.DataBaseRelationship.dao;

import com.geekster.DataBaseRelationship.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book,Integer> {
}
