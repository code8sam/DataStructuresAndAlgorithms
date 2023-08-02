package PracticePrevious020823;

public class Question5 {
    public static void main(String[] args) {
        int n = 4;
        int rows = n;
        int stars = 1;
        int spaces = n-1;
        for (int i=1; i<=rows; i++){
            for (int x=1; x<=spaces; x++){
                System.out.print("  ");
            }
            for (int y=1; y<=stars; y++){
                System.out.print("* ");
            }
            System.out.println();
            spaces--;
            stars+=2;
        }
    }
}
