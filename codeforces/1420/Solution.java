import java.util.*;

public class Solution {

    public static int getAnswer(int[] a, int n) {

        int pair_count = 0;

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if( i != j && i < j) {
                    int or = a[i] ^ a[j];
                    int andOp = a[i] & a[j];
                    // System.out.println("Checking : " + a[i] + " : " + a[j] + " /  ");
                    System.out.println("Values of or : "  + or + " val of andd : " + andOp);
                    if( andOp >= or) {
                        pair_count += 1;
                    }

                }
            }
        }
        return pair_count;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while(t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];

            for(int i=0;i<n;i++) {
                a[i] = scan.nextInt();
            }
 
            System.out.println(getAnswer(a,n));


        }
    }
}