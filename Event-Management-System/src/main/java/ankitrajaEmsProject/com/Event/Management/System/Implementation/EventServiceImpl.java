package ankitrajaEmsProject.com.Event.Management.System.Implementation;

import ankitrajaEmsProject.com.Event.Management.System.dto.EventDto;
import ankitrajaEmsProject.com.Event.Management.System.entity.Event;
import ankitrajaEmsProject.com.Event.Management.System.mapper.EventMapper;
import ankitrajaEmsProject.com.Event.Management.System.repository.EventRepository;
import ankitrajaEmsProject.com.Event.Management.System.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventRepository eventRepository;
    private  EventMapper eventMapper;

    @Override
    public EventDto createEvent(EventDto eventDto) {
        // Convert DTO to Entity using mapper
        Event event = EventMapper.INSTANCE.toEntity(eventDto);

        Event savedEvent = eventRepository.save(event);

        // Convert saved Entity back to DTO using mapper
        return EventMapper.INSTANCE.toDto(savedEvent);
    }
    @Override
    public EventDto getEventById(Long id){
        return eventRepository.findById(id)
                .map(event-> new EventDto(event.getId(),event.getName(), event.getDate(), event.getLocation()))
                .orElse(null);
    }

      @Override
    public List<EventDto> getAllEvents() {
          return eventRepository.findAll()
                  .stream()
                  .map(event -> new EventDto(event.getId(), event.getName(), event.getDate(), event.getLocation()))
                  .collect(Collectors.toList());
      }
      @Override
    public EventDto updateEvent(Long id, EventDto eventDto){
        return eventRepository.findById(id).map(event -> {
            event.setName(eventDto.getName());
            event.setDate(eventDto.getDate());
            event.setLocation(eventDto.getLocation());
            Event updatedEvent = eventRepository.save(event);
            return new EventDto(updatedEvent.getId(), updatedEvent.getName(), updatedEvent.getDate(), updatedEvent.getLocation());
        }).orElse(null);
      }

      @Override
    public  boolean deleteEvent(Long id){
        if(eventRepository.existsById(id)){
            eventRepository.deleteById(id);
            return true;
        }
            return  false;
      }



}
