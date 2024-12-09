package ankitrajaEmsProject.com.Event.Management.System.Implementation;

import ankitrajaEmsProject.com.Event.Management.System.dto.UserDto;
import ankitrajaEmsProject.com.Event.Management.System.entity.User;
import ankitrajaEmsProject.com.Event.Management.System.repository.UserRepository;
import ankitrajaEmsProject.com.Event.Management.System.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDto registerUser(UserDto userDto) {
        User user = new User();
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());

        User savedUser = userRepository.save(user);
        return new UserDto(savedUser.getId(), savedUser.getName(), savedUser.getEmail(), savedUser.getPassword());
    }

    @Override
    public UserDto getUserById(Long id) {
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            //return new UserDto(user.getId(), user.getName(), user.getEmail());
            return new UserDto(user.getId(), user.getName(), user.getEmail(), user.getPassword());
        }
        return null;
    }

    @Override
    public UserDto updateUser(Long id, UserDto userDto) {
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            user.setName(userDto.getName()); // Corrected: Using `user` instance
            user.setEmail(userDto.getEmail()); // Corrected: Using `user` instance
            User updatedUser = userRepository.save(user);
           // return new UserDto(updatedUser.getId(), updatedUser.getName(), updatedUser.getEmail());
            return new UserDto(updatedUser.getId(), updatedUser.getName(), updatedUser.getEmail(), updatedUser.getPassword());
        }
        return null;
    }

    @Override
    public boolean deleteUser(Long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
