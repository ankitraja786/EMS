package ankitrajaEmsProject.com.Event.Management.System.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "Event")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String date; // Change the type if it's `LocalDate` or similar
    private String location;

    // No-argument constructor (required by JPA)
    public Event() {}

    // All-argument constructor
    public Event(Long id, String name, String date, String location) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.location = location;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
