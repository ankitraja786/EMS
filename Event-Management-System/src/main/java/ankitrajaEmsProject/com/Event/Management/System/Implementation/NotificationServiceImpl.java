package ankitrajaEmsProject.com.Event.Management.System.Implementation;

import ankitrajaEmsProject.com.Event.Management.System.dto.NotificationDto;
import ankitrajaEmsProject.com.Event.Management.System.service.NotificationService;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceImpl implements NotificationService {

    @Override
    public void  sendNotification(NotificationDto notificationDto){

        System.out.println("Notification sent: " + notificationDto.getMessage());
    }

}
