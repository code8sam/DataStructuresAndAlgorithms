package IntroTopics;

public class Pattern6 {
    public static void main(String[]args){

        int n = 7;

        int rows = n;
        int stars = 1;
        int spaces = n-2;

        for (int i=1; i<=n; i++){

            for (int x=1; x<=stars; x++){
                System.out.print("*");
            }

            for (int y=1; y<=spaces; y++){
                System.out.print(" ");
            }

            int starsAfterSpace = stars;
            if(i==((rows/2)+1)){
                starsAfterSpace = stars-1;

            }
            for (int x=1; x<=starsAfterSpace; x++){
                System.out.print("*");
            }

            System.out.println();

            if(i<=(rows/2)){
                stars++;
                spaces-=2;
            }else {
                stars--;
                spaces+=2;
            }

        }
    }
}
