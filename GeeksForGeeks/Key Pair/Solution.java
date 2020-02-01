
/*

	Given an array A of N positive integers and another number X.
	Determine whether or not there exist two elements
	in A whose sum is exactly X.
	
	

*/


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     
    public static String twoSum(int arr[], int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<arr.length;i++) {
            int c = target - arr[i];
            if(map.containsKey(c)) {
                return "Yes";
            }
            map.put(arr[i],i);
        }
        return "No";
        
    }
     
	public static void main (String[] args)
	 {
	        Scanner scan = new Scanner(System.in);
	        int t;
	        t = scan.nextInt();
	        
	       for(int i=0;i<t;i++) {
	           
	           int n = scan.nextInt();
	           int x = scan.nextInt();
	           int arr[] = new int[n];
	           
	           for(int j=0;j<n;j++) {
	               arr[j] = scan.nextInt();
	           }
	           
	           System.out.println(twoSum(arr,x));
	       }
	        
	 }
}