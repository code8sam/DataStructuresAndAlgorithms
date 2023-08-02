package PracticePrevious020823;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        System.out.println("Enter a number to reverse : ");
        Scanner sc = new Scanner(System.in);
        int numberToReverse = sc.nextInt();
        int reversedNum = 0;
        while(numberToReverse>0){
            int temp = numberToReverse%10;
            reversedNum = reversedNum*10 +temp;
            numberToReverse/=10;
        }
        System.out.println(reversedNum);
        sc.close();
    }
}
