import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    public static String isAnagram(String s0, String s1) {
        
        if(s0.length() != s1.length()) {
            return "NO";
        }
        
        char[] arr0 = s0.toCharArray();
        char[] arr1 = s1.toCharArray();
        
        Arrays.sort(arr0);
        Arrays.sort(arr1);
        
        for(int i=0;i<arr0.length;i++) {
            if(arr0[i] != arr1[i]) {
                return "NO";
            }
        }
        
        return "YES";
        
    }
     
	public static void main (String[] args)
	 {
	 //code
	 Scanner scan = new Scanner(System.in);
	 
	 int t  = scan.nextInt();
	 
	 for(int i=0;i<t;i++) {
	     String s0 = scan.next();
	     String s1 = scan.next();
	     
	     System.out.println(isAnagram(s0,s1));
	 }
	 
	 
	 }
}