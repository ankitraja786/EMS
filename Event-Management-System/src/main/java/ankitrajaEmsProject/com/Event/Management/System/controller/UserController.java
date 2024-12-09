package ankitrajaEmsProject.com.Event.Management.System.controller;

import ankitrajaEmsProject.com.Event.Management.System.dto.UserDto;
import ankitrajaEmsProject.com.Event.Management.System.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    public UserService userService;

    @PostMapping("/register")
    public ResponseEntity<UserDto>registerUser(@RequestBody UserDto userDto){
        UserDto createdUser = userService.registerUser(userDto);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }
     @GetMapping("/{id}")
    public  ResponseEntity<UserDto> getUserById(@PathVariable Long id){
        UserDto user = userService.getUserById(id);
        return user != null ? new ResponseEntity<>(user, HttpStatus.OK):new ResponseEntity<>(HttpStatus.NOT_FOUND);
     }

     @PutMapping("/{id}")
    public  ResponseEntity<UserDto>updateUser(@PathVariable long id, @RequestBody UserDto userDto){
         UserDto  updateUser = userService.updateUser(id, userDto);
         return  updateUser != null ? new ResponseEntity<>(updateUser, HttpStatus.OK): new ResponseEntity<>(HttpStatus.NOT_FOUND);
     }
     @DeleteMapping

    public  ResponseEntity<Void>deleteUser(@PathVariable Long id){
        boolean isDelete = userService.deleteUser(id);
         return  isDelete ?  new ResponseEntity<>(HttpStatus.NO_CONTENT):new ResponseEntity<>(HttpStatus.NOT_FOUND);
     }

}
