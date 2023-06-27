package IntroTopics;

public class Pattern8 {
    public static void main(String[]args){

        int n=5;
        int rows =n;

        for (int i=1; i<=rows; i++){

            for(int space=1; space<=rows-i; space++){
                System.out.print(" ");
            }
            for (int star=1; star<=i; star++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
