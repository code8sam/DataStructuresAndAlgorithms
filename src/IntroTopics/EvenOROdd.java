package IntroTopics;
import java.util.*;

public class EvenOROdd {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check even or odd : ");
        int giveNum = sc.nextInt();
        if(giveNum%2==0){
            System.out.println(giveNum +" is Even");
        }else{
            System.out.println(giveNum +" is Odd");
        }
    }
}
