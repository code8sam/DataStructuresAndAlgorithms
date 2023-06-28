package IntroTopics;

public class Shadowing {

    // Global Scoped Variable, also called Class Variable
    static int x = 100;

    public static void main(String[]args){

        System.out.println(x); // output will be 100

        int x = 90; // the class variable above is shadowed due to this line

        System.out.println(x); // output here will be 90
    }
}
