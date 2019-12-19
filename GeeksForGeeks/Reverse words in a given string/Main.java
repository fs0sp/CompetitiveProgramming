
/*

	Given a String of length S, reverse the whole string
	without reversing the individual words in it.
	Words are separated by dots.
	
	eg: i.love.you =>  you.love.i


*/


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     
    public static void revString(String word) {
        String temp = word;
        String arr[] = temp.split("\\.");
        int size = arr.length;
        
        for(int j=size-1;j>=0;j--) {
	        
	        if(j != 0) {
	            System.out.print(arr[j] + ".");
	        } else {
	            System.out.print(arr[j]);
	        }
	            
	    }
	    
        
    }
     
	public static void main (String[] args)
	 {
	 //code
	 
	 Scanner scan = new Scanner(System.in);
	 
	 int t = scan.nextInt();
	 
	 for(int i=0;i<t;i++) {
	     String input = scan.next();
	     GFG g = new GFG();
	    // System.out.println(g.revString(input));
	    g.revString(input);
	    System.out.println();
	 }
	 
	 }
}