package PracticePrevious020823;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nth position : ");
        int num1 = 0;
        int num2 = 1;
        int nth = sc.nextInt();
        int i=2;
        int nthNum=0;
        if(nth==1){
            nthNum=1;
        }
        while(i<=nth){
            nthNum=num1+num2;
            if(i==nth){
                break;
            }
            num1=num2;
            num2=nthNum;
            i++;
        }
        System.out.println(nthNum);
    }

}
