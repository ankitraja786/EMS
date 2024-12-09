package ankitrajaEmsProject.com.Event.Management.System.controller;


import ankitrajaEmsProject.com.Event.Management.System.dto.EventDto;
import ankitrajaEmsProject.com.Event.Management.System.entity.Event;
import ankitrajaEmsProject.com.Event.Management.System.mapper.EventMapper;
import ankitrajaEmsProject.com.Event.Management.System.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping
    public ResponseEntity<EventDto> createEvent(@RequestBody EventDto eventDto){
        EventDto createdEvent = eventService.createEvent(eventDto);
        return new ResponseEntity<>(createdEvent, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public  ResponseEntity<EventDto>getEventById(@PathVariable Long id){
        EventDto event = eventService.getEventById(id);
        return event != null ? new ResponseEntity<>(event, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }

    @PutMapping("/{id}")
    public  ResponseEntity<EventDto> updateEvent(@PathVariable long id, @RequestBody EventDto eventDto){
        EventDto updatedEvent = eventService.updateEvent(id, eventDto);
        return updatedEvent != null ? new ResponseEntity<>(updatedEvent,HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEvent(@PathVariable long id){
        boolean isDelete = eventService.deleteEvent(id);
        return  isDelete  ? new ResponseEntity<>(HttpStatus.NO_CONTENT): new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


}
