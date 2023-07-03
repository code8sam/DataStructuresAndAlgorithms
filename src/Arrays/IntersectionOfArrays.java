package Arrays;

import java.util.ArrayList;

public class IntersectionOfArrays {
    public static void main(String[] args) {

        int [] arr1 = {1,2,2,1};
        int [] arr2 = {2,2};
//        int [] arr1 = {10, 19, 20, 30, 40, 40, 40, 50};
//        int [] arr2 = {15, 16, 17, 18, 20, 25, 30, 30, 40};
        
        ArrayList<Integer> intersec = new ArrayList<>();

        for(int i=0; i<arr1.length; i++){
            if(check(arr2, arr1[i]) && !(intersec.contains(arr1[i]))){
                intersec.add(arr1[i]);
            }
        }
        System.out.println(intersec);
    }

    private static boolean check (int [] arr, int checkNum){
        boolean present = false;
        for(int i=0; i<arr.length; i++){
            if(checkNum==arr[i]){
                present = true;
            }
        }
        return present;
    }
}
