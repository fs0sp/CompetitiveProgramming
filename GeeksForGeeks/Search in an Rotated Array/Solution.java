import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    public static int binarySearch(int[] arr, int low, int high, int target) {
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(target > arr[mid]){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
        
    }
     
	public static void main (String[] args)
	 {
	    Scanner scan = new Scanner(System.in);
	    
	    int t = scan.nextInt();
	    while(t-- > 0) {
	        int n = scan.nextInt();
	        int arr[] = new int[n];
	        for(int i=0;i<n;i++) {
	            arr[i] = scan.nextInt();
	        }
	        
	        int target = scan.nextInt();
	        
	        
	        int left = 0;
	        int right = n-1;
	        
	        if(arr.length == 0) {
	            System.out.println("-1");
	            break;
	        }
	        
	        while(left < right) {
	            int mid = left + (right-left)/2;
	            if(arr[mid] > arr[right]) {
	                left = mid + 1;
	            } else {
	                right = mid;
	            }
	        }
	        
	        int start = left;
	        left = 0;
	        right = n-1;
	        
	        if(target >= arr[start] && target <= arr[right]) {
	            left = start;
	        } else {
	            right = start;
	        }
	        
	        System.out.println(binarySearch(arr,left,right,target));
	        
	    }
	    
	 }
}