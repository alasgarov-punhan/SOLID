package org.alasgarov.O;

import org.alasgarov.S.User;

import java.util.Random;

public class BadPractice {
    public static void main(String[] args) {
        NotificationServiceBad notificationService = new NotificationServiceBad();
        notificationService.sendOTP("email");
    }

}

class NotificationServiceBad{
    public void sendOTP(String to){
        if (to.equalsIgnoreCase("email")){
            
        } else if (to.equalsIgnoreCase("sms")) {
            
        }
    }
}


