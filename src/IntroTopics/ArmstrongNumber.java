package IntroTopics;

public class ArmstrongNumber {

    public static void main(String[] args) {
        int input = 8208;
        if(input== makeArmstrong(input)){
            System.out.println(input+" is an armstrong number");
        }else {
            System.out.println(input+" is not an armstrong number");
        }
    }

    private static int makeArmstrong(int input){
        int countDigits = Integer.toString(input).length();
        int sum =0;
        int temp;
        while(input>0){
            temp = input%10;
            sum+= Math.pow(temp, countDigits);
            input = input / 10;
        }
        return sum;
    }
}
