package IntroTopics;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[]args){
        System.out.println("Enter the nth value : ");
        Scanner sc = new Scanner(System.in);
        int firstNum = 0;
        int secondNum=1;
        int nth = sc.nextInt();
        int i = 2;
        int nthNum = 0;

        if(nth==1){
            nthNum=1;
        }

        while(i<=nth){
            nthNum = firstNum+secondNum;
            if(i==nth){
                break;
            }
            firstNum = secondNum;
            secondNum = nthNum;
            i++;
        }

        System.out.println(nthNum);
    }
}
