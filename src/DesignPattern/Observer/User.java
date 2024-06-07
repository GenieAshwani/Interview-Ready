package DesignPattern.Observer;

class User implements UserObserver {
    private String username;
    public User(String username) {
        this.username = username;
    }
    @Override
    public void update(String message) {
        System.out.println("Notification for " + username + ": " + message);
    }
}
