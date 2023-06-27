package IntroTopics;

public class Pattern4 {
    public static void main(String[] args) {

        int n = 5;
        int rows = n;

        int stars = 1;
        int spaces = n/2;

        for (int i=1; i<=n; i++){

            for(int x=1; x<=spaces; x++){
                System.out.print(" ");
            }

            for (int y=1; y<=stars; y++){
                System.out.print("*");
            }

            System.out.println();

            if(i<((rows/2)+1)){
                spaces--;
                stars+=2;
            }else {
                spaces++;
                stars-=2;
            }
        }
    }
}
