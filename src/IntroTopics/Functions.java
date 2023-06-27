package IntroTopics;

public class Functions {
    public static void main(String[] args) {

        sayHello();
        System.out.println("Let us start : ");
        for (int i =1; i<=4; i++){
            int checkSquare = getSquare(i);
            System.out.println(checkSquare);
        }
    }

    // Function having no arguments
    private static void sayHello(){
        System.out.println("Hello All, let's learn about functions : ");
    }

    // Function having arguments
    private static int getSquare(int i) {
        return i*i;
    }
}
