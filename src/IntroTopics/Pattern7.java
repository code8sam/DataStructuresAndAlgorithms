package IntroTopics;

public class Pattern7 {
    public static void main(String[]args){

        int n =5;
        int rows = n;

        for(int i=1; i<=rows; i++){
            for(int j=1; j<=rows-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
