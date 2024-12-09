package ankitrajaEmsProject.com.Event.Management.System.service;

import ankitrajaEmsProject.com.Event.Management.System.entity.User;
import ankitrajaEmsProject.com.Event.Management.System.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Retrieve the user by email (username)
        User user = userRepository.findByEmail(username);
                //.orElseThrow(() -> new UsernameNotFoundException("User not found with email: " + username));

        // Return a UserDetails object containing user info
        return org.springframework.security.core.userdetails.User.builder()
                .username(user.getEmail())
                .password(user.getPassword())
                .roles("USER") // Customize roles as needed
                .build();
    }
}
