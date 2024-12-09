package ankitrajaEmsProject.com.Event.Management.System.service;

import ankitrajaEmsProject.com.Event.Management.System.dto.EventDto;

import java.util.List;

public interface EventService {

    EventDto createEvent(EventDto eventDto);
    EventDto getEventById(Long id);
    List<EventDto> getAllEvents();
    EventDto updateEvent(Long id, EventDto eventDto);
    boolean deleteEvent(Long id);

}
