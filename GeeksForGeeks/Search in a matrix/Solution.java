import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    public static int isPresent(int[][] a, int row, int col, int x) {
        int i = 0;
        int j = col-1;
        
        while( i < row && j >= 0) {
            if(a[i][j] == x) {
                return 1;
            } if(a[i][j] > x) {
                j--;
            } else {
                i++;
            }
        }
        return 0;
    }
     
	public static void main (String[] args) {
	
	    Scanner scan = new Scanner(System.in);
	    int t = scan.nextInt();
	    while(t-- > 0) {
	    
	        int n = scan.nextInt();
	        int m = scan.nextInt();
	        int[][] a = new int[n][m];
	        
	        for(int i=0;i<n;i++) {
	            for(int j= 0;j<m;j++) {
	                a[i][j] = scan.nextInt();
	            }
	        }
	        
	        int x = scan.nextInt();
	        
	        System.out.println(isPresent(a,n,m,x));
	    
	    }
	
	}
	 
}