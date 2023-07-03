package Arrays;

import java.util.ArrayList;

public class IntersectionOfArrays {
    /*

    ----------------------------BRUTE FORCE APPROACH----------------------------------------------
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
    */
    public static void main(String[] args) {

//        -----------------------------------OPTIMISED APPROACH------------------------------------------

        int [] arr1 = {10, 19, 20, 30, 40, 40, 40, 50};
        int [] arr2 = {15, 16, 17, 18, 20, 25, 30, 30, 40};

        System.out.println(intersection(arr1, arr2));

    }

    private static ArrayList<Integer> intersection(int[] arr1, int[] arr2) {
        ArrayList<Integer> ans = new ArrayList<>();

        int i=0;
        int j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                i++;
            }else if(arr1[i]>arr2[j]){
                j++;
            }else{
                ans.add(arr1[i]);
                i++;
                j++;
            }
        }
        return ans;
    }
}
