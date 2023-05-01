package com.geekster.universityeventmanagement.repository;

import com.geekster.universityeventmanagement.model.Event;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IEventDao extends CrudRepository<Event,Integer> {



   public void deleteById(Integer id);

   @Query(value = "select * from EVENT where DATE= :date",nativeQuery = true)
   public List<Event> findAllEvents(LocalDate date);


//   public void saveAll(List<Event> eventList);
}
