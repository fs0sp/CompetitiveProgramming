import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {  
    public static String helper(int[] a) {
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i : a) {
            sum += i;
            
            if(i == 0 || sum == 0 || set.contains(sum)) {
                return "Yes";
                
            }
            set.add(sum);
        }
        
        return "No";
    }
     
	public static void main (String[] args) {
	
	    Scanner scan = new Scanner(System.in);
	    int t = scan.nextInt();
	    while(t-- > 0) {
	    
	        int n = scan.nextInt();
	        int[] arr = new int[n];
	        for(int i=0;i<n;i++) {
	            arr[i] = scan.nextInt();
	        }
	        
	        System.out.println(helper(arr));
	    
	    }
	
	}
	 
}