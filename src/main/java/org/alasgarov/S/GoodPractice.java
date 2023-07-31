package org.alasgarov.S;

import java.util.Random;

public class GoodPractice {
    public static void main(String[] args) {
        DatabaseConnection databaseConnection = new DatabaseConnection();
        databaseConnection.connectDatabase();

        UserService userService = new UserService();
        User user = userService.createUser("Punhan");
        userService.saveUserDatabase(user);

        NotificationService notificationService = new NotificationService();
        notificationService.sendUserInformationWithNotification(user);

        databaseConnection.disconnectDatabase();
    }
}

class DatabaseConnection{
    public void connectDatabase(){
        System.out.println("Database connection created");
    }

    public void disconnectDatabase(){
        System.out.println("Database disconnected");
    }
}

class NotificationService{
    public void sendUserInformationWithNotification(User user){
        System.out.println("Notificationn sent to " + user.getName());
    }
}

class UserService{

    public User createUser(String name){
        System.out.println("The user with the name " + name + " has been created");
        return new User(new Random().nextInt(1000000) + 1, name);
    }

    public void saveUserDatabase(User user){
        System.out.println("User saved db");
    }
}