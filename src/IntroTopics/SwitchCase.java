package IntroTopics;

class SwitchCase {

    public static void main (String[] args) {

        // this is enhanced switch statement :::

        String username = "Satyam";
        switch (username) {
            case "Doe" -> System.out.println("Username is Doe");
            case "Sanket" -> System.out.println("Username is Sanket");
            case "Satyam" -> System.out.println("Username is Satyam");
            default -> System.out.println("Username not found");
        }
    }
}
