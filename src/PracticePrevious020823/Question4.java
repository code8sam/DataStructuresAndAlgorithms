package PracticePrevious020823;

public class Question4 {
    public static void main(String[] args) {
        int n = 4;
        int row = n;
        for (int i=1; i<=row; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
