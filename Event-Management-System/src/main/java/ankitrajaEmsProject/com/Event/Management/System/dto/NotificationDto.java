package ankitrajaEmsProject.com.Event.Management.System.dto;

import java.time.LocalDateTime;

public class NotificationDto {

    private Long id;
    private String message;
    private Long userId;
    private LocalDateTime timestamp;

    public NotificationDto(Long id, String message, Long userId, LocalDateTime timestamp) {
        this.id = id;
        this.message = message;
        this.userId = userId;
        this.timestamp = timestamp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}