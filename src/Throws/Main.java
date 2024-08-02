package Throws;

public class Main {
    public static void main(String[] args) {
        try {
            UserService userList = new UserService();
            userList.registerUser("Hello65");
            userList.registerUser("krishna-nayak");
            userList.registerUser("krishna-54321");
            userList.registerUser("krishna-nayak");
            userList.registerUser("krishna");

        } catch (Exception e) {
            System.out.println("Main Exception :\t" + e.getMessage());
        }
    }
}
