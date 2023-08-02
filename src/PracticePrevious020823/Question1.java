package PracticePrevious020823;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        System.out.println("Enter the Number to check Leap Year: ");
        Scanner sc = new Scanner(System.in);
        int checkLeapYear = sc.nextInt();
        if((checkLeapYear%4==0 && checkLeapYear%100!=0)||(checkLeapYear%400==0)){
            System.out.println(checkLeapYear+" is a leap year.");
        }else {
            System.out.println(checkLeapYear+" is not a leap year.");
        }
        sc.close();
    }
}
