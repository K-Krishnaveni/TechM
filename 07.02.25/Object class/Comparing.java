public class Comparing {
    public static void main(String[] args) {
        // Creating objects of User (with overridden methods)
        User user1 = new User("Alice", 25);
        User user2 = new User("Alice", 25);

        // Creating objects of SecondUser (without overridden methods)
       User2 secondUser1 = new User2("Bob", 30);
       User2 secondUser2 = new User2("Bob", 30);

        // Printing objects using toString()
        System.out.println("User1: " + user1);  // Calls overridden toString()
        System.out.println("User2: " + user2);
        System.out.println("SecondUser1: " + secondUser1);  // Uses default toString()
        System.out.println("SecondUser2: " + secondUser2);

        // Comparing objects using equals()
        System.out.println("\nComparing User objects:");
        System.out.println("user1.equals(user2): " + user1.equals(user2));  // True (because of overridden equals)

        System.out.println("\nComparing SecondUser objects:");
        System.out.println("secondUser1.equals(secondUser2): " + secondUser1.equals(secondUser2));  // False (default equals)
    }
}

