package ankitrajaEmsProject.com.Event.Management.System.mapper;

import ankitrajaEmsProject.com.Event.Management.System.dto.EventDto;
import ankitrajaEmsProject.com.Event.Management.System.entity.Event;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EventMapper {
    EventMapper INSTANCE = Mappers.getMapper(EventMapper.class);

    EventDto toDto(Event event);

    Event toEntity(EventDto eventDto);
}
