package DesignPattern.Observer;

public class Main {
    public static void main(String[] args) {
        AmazonNotificationService amazonService = new AmazonNotificationService();
        User user1 = new User("User1");
        User user2 = new User("User2");

        amazonService.addObserver(user1);
        amazonService.addObserver(user2);
        amazonService.sendNotification("Your order has been shipped.");
        amazonService.removeObserver(user1);
        amazonService.sendNotification("New promotion: 20% off on electronics.");
    }
}