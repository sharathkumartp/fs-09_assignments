package com.geekster.universityeventmanagement.service;

import com.geekster.universityeventmanagement.model.Event;
import com.geekster.universityeventmanagement.repository.IEventDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EventService {
    @Autowired
    IEventDao eventDao;


    public void addEvents(List<Event> eventList) {
        eventDao.saveAll(eventList);
    }

    public void updateEvent(Integer id, Event newEvent) {
        Event event1=eventDao.findById(id).get();
        event1.setEventName(newEvent.getEventName());
        event1.setLocationOfEvent(newEvent.getLocationOfEvent());
        event1.setDate(newEvent.getDate());
        event1.setStartTime(newEvent.getStartTime());
        event1.setEventId(newEvent.getEventId());
        eventDao.save(event1);
    }

    public void deleteEvent(Integer id) {
        eventDao.deleteById(id);
    }

    public List<Event> getAllEvents(LocalDate date) {
        return eventDao.findAllEvents(date);
    }
}
