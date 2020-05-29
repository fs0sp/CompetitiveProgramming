class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int sub = 0;
        int count = 0;
        int n = startTime.length;
        
        for(int i=0;i<n;i++) {
            sub = endTime[i] - startTime[i];
            
            if(startTime[i] <= queryTime && endTime[i] >= queryTime) {
                count += 1;
            }
                        
            else if((startTime[i] == endTime[i] ) && (startTime[i] == queryTime)) {
                count += 1;
            } 
            
        }
        
        return count;
        
    }
}