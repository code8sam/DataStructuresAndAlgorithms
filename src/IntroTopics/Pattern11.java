package IntroTopics;

public class Pattern11 {
    public static void main(String[]args){

        int n=5;
        int rows=n;
        int stars=1;
        int spaces=n-1;

        for(int i=1; i<=rows; i++){
            for(int x=1; x<=spaces; x++){
                System.out.print(" ");
            }
            for (int starsSpace=1; starsSpace<=stars; starsSpace++){
                if(i%2!=0){
                    if(starsSpace%2!=0){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }else {
                    if(starsSpace%2!=0){
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }
            }
            for(int x=1; x<=spaces; x++){
                System.out.print(" ");
            }
            System.out.println();
            spaces--;
            stars+=2;

        }
    }
}
