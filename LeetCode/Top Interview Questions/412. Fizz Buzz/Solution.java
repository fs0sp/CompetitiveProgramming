class Solution {
    public List<String> fizzBuzz(int n) {
        String f = "Fizz";
        String b = "Buzz";
        String fb = "FizzBuzz";
        
        List<String> list = new ArrayList<>();
        
        for(int i=1;i<=n;i++) {
            String temp = Integer.toString(i);
            if(i % 5 == 0 && i % 3 == 0) {
                list.add(fb);
            } else if(i % 5 == 0) {
                list.add(b);
            } else if(i % 3 == 0) {
                list.add(f);
            } else {
                list.add(temp);
            }
        }
        
        return list;
        
    }
}