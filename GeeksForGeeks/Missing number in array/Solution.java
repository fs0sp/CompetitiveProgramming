import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	 
	 Scanner scan = new Scanner(System.in);
	 int t = scan.nextInt();
	 
	 for(int i=0;i<t;i++) {
	     int n = scan.nextInt();
	     
	     int arr[] = new int[n-1];
	     for(int j=0;j<n-1;j++) {
	         arr[j] = scan.nextInt();
	     }
	     
	     int totalSum  = (n*(n+1))/2;
	     int sum = 0;
	     for(int j=0;j<n-1;j++) {
	         sum += arr[j];
	     }
	     
	     System.out.println(totalSum-sum);
	     
	 }
	 
	 
	 }
}