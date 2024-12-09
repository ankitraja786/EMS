package ankitrajaEmsProject.com.Event.Management.System.service;

import ankitrajaEmsProject.com.Event.Management.System.dto.NotificationDto;
import org.springframework.stereotype.Service;


public interface NotificationService {
    void sendNotification(NotificationDto notificationDto);
}
