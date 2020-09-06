class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> result = new ArrayList<>();
        
        for(int i=0;i<numRows;i++) {
            List<Integer> curr = new ArrayList<>();
            
            for(int j=0;j<=i;j++) {
                if(i==0 || j == 0 || i == j) {
                    curr.add(1);
                } else {
                    curr.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
                }
            }
            result.add(curr);
        }
        
        return result;
        
    }
}