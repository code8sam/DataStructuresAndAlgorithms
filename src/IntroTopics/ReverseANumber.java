package IntroTopics;

public class ReverseANumber {
    public static void main(String[]args){

        int numToReverse = 1234;
        int reversedNum=0;
        while(numToReverse>0){
            int rem = numToReverse%10;
            reversedNum = reversedNum*10+rem;
            numToReverse /= 10;
        }
        System.out.println(reversedNum);
    }
}
