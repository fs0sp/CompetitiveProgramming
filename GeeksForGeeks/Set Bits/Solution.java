import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    public static int count(int a) {
        int c = 0;
        
        while(a != 0) {
            if((a&1 ) == 1) {
                c += 1;
            }
            a = a >>> 1;
        }
        return c;
    }
     
	public static void main (String[] args)
	 {
	 Scanner scan = new Scanner(System.in);
	 int t = scan.nextInt();
	 while(t-->0) {
	     int n = scan.nextInt();
	     System.out.println(count(n));
	 }
	 }
}