import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     
    public static int find(int[] a, int n, int k) {
        int res = 0;
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        map.put(0,-1);
        
        for(int i=0;i<n;i++) {
            sum += a[i];
            
            if(map.containsKey(sum - k)) {
                res = Math.max(res,i - map.get(sum - k));
            }
            map.putIfAbsent(sum,i);
        }
        
        return res;
        
    }
     
	public static void main (String[] args) {
	
	    Scanner scan = new Scanner(System.in);
	    int t = scan.nextInt();
	    while(t-- > 0) {
	    
	        int n = scan.nextInt();
	        int k = scan.nextInt();
	        
	        int a[] = new int[n];
	        
	        for(int i=0;i<n;i++) {
	            a[i] = scan.nextInt();
	        }
	    
	        System.out.println(find(a,n,k));
	    
	    }
	
	}
	 
}