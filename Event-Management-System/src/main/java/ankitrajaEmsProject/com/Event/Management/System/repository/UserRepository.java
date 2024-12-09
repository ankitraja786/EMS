package ankitrajaEmsProject.com.Event.Management.System.repository;

import ankitrajaEmsProject.com.Event.Management.System.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
    User existsByEmail(String email);
}
