/*

Good morning! Here's your coding interview problem for today.

This problem was asked by Uber.

Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
*/

import java.util.*;



public class Solution
 {
     
    public static void getArray(int arr[]) {
        int arrLen = arr.length;
        int ans[] = new int[arrLen];
        
        for(int i=0;i<arr.length;i++) {
			//int j=0;
			 int p=1;
			for( int j=0;j<arr.length;j++) {
		        
		      	ans[i] = p * arr[j];
				p = ans[i];
			}
			//j++;
			ans[i] = ans[i]/arr[i];
	
		} 

		for(int x=0;x<5;x++) {
			
			System.out.println(ans[x]);
		}
    } 
     
     
 	public static void main(String args[])
 	{ 
		
	//	int p = 1;
		int arr[] = {2, 4, 6, 8, 10};
		
		getArray(arr);
		
		
 	}
 }