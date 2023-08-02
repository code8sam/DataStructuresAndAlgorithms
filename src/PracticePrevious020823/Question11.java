package PracticePrevious020823;

public class Question11 {
    public static void main(String[] args) {
        int n =5;
        int rows = n;
        int stars = 2*rows-1;
        int spaces = 1;
        for (int i=1; i<=rows; i++){
            if(i==1){
                for (int x=1; x<=stars; x++){
                    System.out.print("*");
                }
                System.out.println();
                stars-=2;
                continue;
            }
            for (int y=1; y<=spaces; y++){
                System.out.print(" ");
            }
            for (int x=1; x<=stars; x++){
                System.out.print("*");
            }
            for (int y=1; y<=spaces; y++){
                System.out.print(" ");
            }
            System.out.println();
            spaces+=1;
            stars-=2;
        }
    }
}
