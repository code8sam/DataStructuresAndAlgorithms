package IntroTopics;

public class Pattern9 {
    public static void main(String[]args){

        int n = 5;

        for(int i=1; i<=n; i++){
            System.out.print("*");
        }
        System.out.println();

        int rows =n-1;
        int spaces=1;
        int stars = rows;

        for(int i=1; i<=rows; i++){

            for(int x=1; x<=spaces; x++){
                System.out.print(" ");
            }
            for (int y=1; y<=stars; y++){
                System.out.print("*");
            }
            System.out.println();
            stars--;
            spaces++;
        }
    }
}
