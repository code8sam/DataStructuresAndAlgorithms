package IntroTopics;

public class Pattern5 {
    public static void main(String[] args) {

        int n = 5;

        for (int i=1; i<=(2*n-1); i++) {
            System.out.print("*");
        }
        System.out.println();

        int rows = n-1;
        int stars = n-1;
        int spaces = 1;

        for (int i=1; i<=rows; i++){

            for(int x=1; x<=stars; x++){
                System.out.print("*");
            }

            for(int y=1; y<=spaces; y++){
                System.out.print(" ");
            }

            for(int x=1; x<=stars; x++){
                System.out.print("*");
            }

            System.out.println();
            stars--;
            spaces+=2;

        }

    }
}
