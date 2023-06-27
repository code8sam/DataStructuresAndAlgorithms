package IntroTopics;

public class Pattern10 {
    public static void main(String[]args){

        int n=5;
        int rows = n;
        int stars=2*rows-1;
        int spaces = 1;

        for(int i=1; i<=rows; i++){

            if(i==1){
                for (int star=1; star<=stars; star++){
                    System.out.print("*");
                }
                System.out.println();
                stars-=2;
                continue;
            }
            for(int space=1; space<=spaces; space++){
                System.out.print(" ");
            }
            for(int star=1; star<=stars; star++){
                System.out.print("*");
            }
            for(int space=1; space<=spaces; space++){
                System.out.print(" ");
            }
            System.out.println();
            spaces+=1;
            stars-=2;
        }
    }
}
