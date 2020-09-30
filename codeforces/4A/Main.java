    import java.util.*;
     
    public class Main
    {
        public static String divide(int n) {
            if(n % 2 != 0 || n <= 2)  {
                return "NO";
            }
            
            return "YES";

        }
        
    	public static void main(String[] args) {
    		Scanner scan = new Scanner(System.in);
    		
            int n = scan.nextInt();
    	    
    	    System.out.println(divide(n));
    	}
    }