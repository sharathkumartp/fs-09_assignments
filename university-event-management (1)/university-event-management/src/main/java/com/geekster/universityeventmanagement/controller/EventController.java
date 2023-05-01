package com.geekster.universityeventmanagement.controller;

import com.geekster.universityeventmanagement.model.Event;
import com.geekster.universityeventmanagement.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class EventController {

    @Autowired
    EventService eventService;

    @PostMapping(value = "/addEvent")
    public void addEvents(@RequestBody List<Event> eventList){
        eventService.addEvents(eventList);
    }

    @PutMapping(value = "/updateEvent/{}")
    public void updateEvent(@PathVariable Integer id,@RequestBody Event newEvent){
        eventService.updateEvent(id,newEvent);
    }

    @DeleteMapping(value = "/deleteEvent/{id}")
    public void deleteEvent(@PathVariable Integer id){
        eventService.deleteEvent(id);
    }

    @GetMapping(value = "/getAllEvents/{date}")
    public List<Event> getAllEvents(@PathVariable LocalDate date){
      return eventService.getAllEvents(date);
    }

}
