import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    public static void reverse(int[] arr, int start, int last) {
        
        while( start < last ) {
            int temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;
            start += 1;
            last -= 1;
        }
        
    }
     
	public static void main (String[] args)
	 {
	 Scanner scan = new Scanner(System.in);
	 int t = scan.nextInt();
	 while(t-- > 0 ) {
	     int n = scan.nextInt();
	     int arr[] = new int[n];
	     for(int i=0;i<n;i++) {
	         arr[i] = scan.nextInt();
	     }
	     
	     int k = 1;
	     
	     reverse(arr,0,n-1);
	     reverse(arr,0,k-1);
	     reverse(arr,k,n-1);
	     
	     for(int i=0;i<n;i++) {
	         System.out.print(arr[i] + " ");
	     }
	     System.out.println();
	 }
	 }
}