/*

    Given a non-negative integer num, return the number of steps to reduce it to zero. 
    If the current number is even, you have to divide it by 2
    , otherwise, you have to subtract 1 from it.

*/


class Solution {
    
    public static int count(int n, int c) {
        if(n == 0) {
            return c;
        }
        
        if( n % 2 == 0 ) {
            n /= 2;
            c += 1;
        }
        
        else {
            n = n-1;
            c += 1;
        }
        
        int ans = count(n,c);
        
        return ans;
        
    }
    
    public int numberOfSteps (int num) {
        int c = 0;
        int ans = count(num,c);
        
        return ans;
    }
}