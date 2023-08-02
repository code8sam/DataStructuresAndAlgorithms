package PracticePrevious020823;

public class Question6 {
    public static void main(String[] args) {
        int n = 5;
        int stars = 1;
        int rows = n;
        for (int i=1; i<=rows; i++){
            for (int x=1; x<=stars; x++){
                System.out.print("* ");
            }
            System.out.println();

            if(i>rows/2){
                stars--;
            }else{
                stars++;
            }
        }
    }
}
