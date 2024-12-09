package ankitrajaEmsProject.com.Event.Management.System.service;

import ankitrajaEmsProject.com.Event.Management.System.dto.UserDto;

public interface UserService {
    UserDto registerUser (UserDto userDto);
    UserDto getUserById (Long id);
    UserDto updateUser(Long id,UserDto userDto);

    boolean deleteUser(Long id);
}
