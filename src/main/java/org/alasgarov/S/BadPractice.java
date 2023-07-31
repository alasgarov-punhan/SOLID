package org.alasgarov.S;

import java.util.Random;

public class BadPractice {

    public void connectDatabase(){
        System.out.println("Database connection created");
    }

    public void disconnectDatabase(){
        System.out.println("Database disconnected");
    }

    public User createUser(String name){
        System.out.println("The user with the name " + name + " has been created");
        return new User(new Random().nextInt(1000000) + 1, name);
    }

    public void sendUserInformationWithNotification(User user){
        System.out.println("Notificationn sent to " + user.getName());
    }

    public void saveUserDatabase(User user){
        System.out.println("User saved db");
    }

}


