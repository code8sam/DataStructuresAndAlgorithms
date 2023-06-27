package IntroTopics;

public class ConditionalsInJava {
    public static void main(String[] args) {

        // if statement

        boolean primeSub = false;
        if(primeSub==true){
            System.out.println("Welcome to prime");
        }

        // if-else statement

        boolean isLoggedOut = false;

        if(isLoggedOut==true){
            System.out.println("Please login first ...");
        } else {
            System.out.println("You now can enjoy new Prime videos");
        }

        // if-else if statement

        int paymentDone = 444;

        if(paymentDone==999){
            System.out.println("Enjoy entire month without disturbance AD FREE");
        } else if (paymentDone == 555){
            System.out.println("You will see ads a lot ...");
        } else {
            System.out.println("We are looking over the payment issue ...");
        }


    }
}
