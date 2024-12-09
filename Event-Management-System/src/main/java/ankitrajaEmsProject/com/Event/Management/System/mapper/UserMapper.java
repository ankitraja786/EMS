package ankitrajaEmsProject.com.Event.Management.System.mapper;


import ankitrajaEmsProject.com.Event.Management.System.dto.UserDto;
import ankitrajaEmsProject.com.Event.Management.System.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    // Map User to UserDto
    UserDto toDto(User user);

    // Map UserDto to User
    User toEntity(UserDto userDto);
}
