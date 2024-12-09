package ankitrajaEmsProject.com.Event.Management.System.repository;

import ankitrajaEmsProject.com.Event.Management.System.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> findByLocation(String location);
    List<Event>findByDateBetween(String startDate, String endDate);

}
