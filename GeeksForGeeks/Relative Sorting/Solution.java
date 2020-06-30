import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    public static void helper(int arr1[], int[] arr2) {
        
        HashMap<Integer, Integer> map= new HashMap<>();
        int index = 0;
        int high = arr1.length - 1;
        int arr[] = new int[arr1.length];
        
        for(int i : arr2) {
            map.put(i,0);
        }
        
        for(int i : arr1) {
            if(map.containsKey(i)) {
                map.put(i, map.get(i)+1);
            } else {
                arr[high--] = i;
            }
        }
        
        for(int i : arr2) {
            int val = map.get(i);
            for(int j=0;j<val;j++) {
                arr[index++] = i;
            }
        }
        
        Arrays.sort(arr, index, arr.length);
        
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
    }
     
	public static void main (String[] args) {
	
	    Scanner scan = new Scanner(System.in);
	    int t = scan.nextInt();
	    while(t-- > 0) {
	    
	        int n = scan.nextInt();
	        int m = scan.nextInt();
	        
	        int[] arr1 = new int[n];
	        int[] arr2 = new int[m];
	        
	        
	        for(int i=0;i<n;i++) {
	            arr1[i] = scan.nextInt();
	        }
	        
	        for(int i=0;i<m;i++) {
	            arr2[i] = scan.nextInt();
	        }
	        
	        helper(arr1, arr2);
	    
	    }
	
	}
	 
}