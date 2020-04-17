import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    public static int romanToInteger(String s) {
        
        int output = 0;
        
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
                
        for(int i=0;i<s.length()-1;i++) {
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))) {
                output -= map.get(s.charAt(i)); 
                
            } else {
                output += map.get(s.charAt(i));
            }
        }
                                                          
        return output + map.get(s.charAt(s.length()-1));
        
    }
     
	public static void main (String[] args)
	 {
    	 Scanner scan = new Scanner(System.in);
    	 int t = scan.nextInt();
    	 
    	 while(t-- > 0) {
    	     String input = scan.next();
    	     System.out.println(romanToInteger(input));
    	     
    	     
    	 }
	 }
}