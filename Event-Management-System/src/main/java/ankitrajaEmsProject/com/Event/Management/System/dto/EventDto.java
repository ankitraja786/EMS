package ankitrajaEmsProject.com.Event.Management.System.dto;

public class EventDto {

    private Long id;
    private String name;
    private String date; // Same type as in `Event`
    private String location;

    // Constructors
    public EventDto() {}

    public EventDto(Long id, String name, String date, String location) {
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
