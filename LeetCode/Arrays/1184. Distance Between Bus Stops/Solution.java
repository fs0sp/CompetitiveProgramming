class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        
        int st = Math.min(start,destination);
        int lr = Math.max(start,destination);
        int total = 0;
        int d = 0;
        
        // total Distance 
        for(int i : distance) {
            total += i;
        }
        
        for(int i=st;i<lr;i++) {
            d += distance[i];
        }
        
        return Math.min(d, total - d);
               
    }
}