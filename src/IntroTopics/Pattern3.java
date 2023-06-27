package IntroTopics;

public class Pattern3 {
    public static void main(String[] args) {

        int n =5;
        int rows = n;

        int stars = 1;

        for (int i=1; i<=rows; i++){

            for (int x=1; x<=stars; x++){
                System.out.print("*");
            }
            System.out.println();

            if(i>rows/2){
                stars--;
            }else {
                stars++;
            }
        }
    }
}
