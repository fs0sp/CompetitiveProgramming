import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    public static int calcZeros(int n) {
        return n>=5 ? n/5 + calcZeros(n/5) : 0;
    }
     
	public static void main (String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
	    
	    int t = scan.nextInt();
	    
	    while( t-- > 0) {
	        int n = scan.nextInt();
	        
	        System.out.println(calcZeros(n));
	        
	    }
	    
	}
	 
}