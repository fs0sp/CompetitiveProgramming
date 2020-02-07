/*

	Input: n = 2
Output: [1,1]
Explanation: A = 1, B = 1. A + B = n and both A and B don't contain any 0 in their decimal representation.

*/

class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int i=1;i<n;i++) {
            if(noZero(i) && noZero(n-i)) {
                return new int[]{i, n-i};
            }
        }
        return new int[]{-1, -1};
    }
    
    public boolean noZero(int n) {
        while(n>0) {
            if(n%10 == 0) {
                return false;
            }
            n /= 10;
        }
        return true;
    }
}