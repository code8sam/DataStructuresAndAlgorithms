package PracticePrevious020823;

public class Question19 {
    public static void main(String[]args){
        int[][] given = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        for (int i=0; i<given[0].length; i++){
            if(i%2==0){
                for (int j=0; j<given.length; j++){
                    System.out.print(given[i][j]+" ");
                }
            }else{
                for (int j=given.length-1; j>=0; j--){
                    System.out.print(given[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
