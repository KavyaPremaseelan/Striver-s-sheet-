package ARRAY.EASY;

import java.util.Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int arr[] = {99 , 7 , 4 , 77 , 23 , 100 , 88};

        // # APPROACH 1:

        //to identify the largest element element of the array
        //sorting approach
        // Arrays.sort(arr);//inplace sorting -> modifies the original array;
        // System.out.println(Arrays.toString(arr));
        // System.out.println("The largest element of the array : " + arr[arr.length - 1]);
        //TC : O(nlogn)

        // # APPROACH 2:

        //traversing the entire array using maximum counter 
        int max = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("The largest element of the array : " + max);
    }
}