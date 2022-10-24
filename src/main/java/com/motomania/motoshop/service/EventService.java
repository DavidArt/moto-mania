package com.motomania.motoshop.service;

import com.motomania.motoshop.domain.EventEntity;
import com.motomania.motoshop.dto.Event;
import com.motomania.motoshop.repo.EventRepo;
import com.motomania.motoshop.util.MapperUtil;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class EventService {

    private final EventRepo eventRepo;

    private final MapperUtil mapperUtil;

    public EventService(EventRepo eventRepo, MapperUtil mapperUtil) {
        this.eventRepo = eventRepo;
        this.mapperUtil = mapperUtil;
    }

    public Event getEvent(Long id) {
        EventEntity eventEntity = eventRepo
                .findById(id)
                .orElseThrow(() -> new EntityNotFoundException("No event found with this id = " + id));

        return mapperUtil.map(eventEntity, Event.class);
    }

    public List<Event> getAllEvents() {
        List<EventEntity> eventEntityList = eventRepo.findAll();

        return mapperUtil.mapList(eventEntityList, Event.class);
    }

    public Event createEvent(Event event) {
        EventEntity savedEvent = eventRepo
                .save(mapperUtil.map(event, EventEntity.class));

        return mapperUtil.map(savedEvent, Event.class);
    }

    public Event updateEvent(Event event) {
        EventEntity updatedEvent = eventRepo
                .save(mapperUtil.map(event, EventEntity.class));

        return mapperUtil.map(updatedEvent, Event.class);
    }

    public void deleteEvent(Long id) {
        if (eventRepo.existsById(id)) {
            eventRepo.deleteById(id);
        }
    }
}
