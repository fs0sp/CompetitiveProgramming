public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int counter = 0;
        
        /*
        
        We have to take care of 2 problems here for negative as well as positive 
        
        For positive we can use : >> operator is a signed right shift operator
        Since we also have negative input we will use >>> operator, it is an unsigned right shift operator.
        
        */
        
        while(n != 0) {
            if((n & 1) == 1) {
                counter += 1;
            }
            n = n >>> 1;
        }
        
        return counter;
    }
}



