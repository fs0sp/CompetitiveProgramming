/*

Good morning! Here's your coding interview problem for today.

This problem was asked by Stripe.

Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.

For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.

You can modify the input array in-place.

*/

public class Solution {

    public static int getMax(int input[]) {
        int max = input[0];

        for(int i=1;i<input.length;i++) {
            if(input[i] > max ) {
                max = input[i];
            }
        }
        return max;
    }

    public static boolean checkInArray(int input[],int key) {
        boolean ans = true;
        for(int i=0;i<input.length;i++) {
            
            if(input[i] == key) {
                ans = true;
                break;
            } 
            ans = false;
        }
        return ans;
       
    }

    public static int getMissingValue(int input[]) {
        int max = getMax(input);
        int value=max+1;
        for(int i=1;i<max;i++) {
            boolean isThere = checkInArray(input, i);
            while(!isThere) {
                value = i;
                break;
            }
        }
        return value;
    }


    public static void main(String[] args) {
        int arr[] = {-1,-2,-3, 2, 3};

        int test = getMissingValue(arr);
        System.out.println(test);
        

        

    }

}