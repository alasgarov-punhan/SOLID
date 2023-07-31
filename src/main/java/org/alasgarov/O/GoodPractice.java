package org.alasgarov.O;

public class GoodPractice {
    public static void main(String[] args) {

        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification(new EmailNotification());
        notificationService.sendNotification(new EmailNotification());
    }
}

class NotificationService {
    void sendNotification(INotificationService iNotificationService){
        iNotificationService.sendOTP("");
    }
}

interface INotificationService{
    void sendOTP(String to);
}

class EmailNotification implements INotificationService{

    @Override
    public void sendOTP(String to) {
        // business logic
        System.out.println("email notification sent");
    }
}

class SmsNotification implements INotificationService{

    @Override
    public void sendOTP(String to) {
        // business logic
        System.out.println("sms notification sent");
    }
}