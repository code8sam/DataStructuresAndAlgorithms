package IntroTopics;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[]args){
        System.out.println("Enter a number to check whether its prime : ");
        Scanner sc = new Scanner(System.in);
        int numToCheck = sc.nextInt();
        if(numToCheck==1){
            System.out.println(numToCheck+" is a prime");
            return;
        }
        boolean flag = false;
        for(int i=2; i*i<=numToCheck; i++){
            if(numToCheck%i==0){
                flag =true;
                break;
            }
        }

        if(flag){
            System.out.println(numToCheck+" is not a prime");
        }else {
            System.out.println(numToCheck+" is prime");
        }
        sc.close();
    }
}
