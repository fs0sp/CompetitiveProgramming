import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    
    public static void main(String args[])  throws Exception {
        
		
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(scan.readLine());
        
        for(int i=0;i<n;i++) {
			String var[] = scan.readLine().split(" ");
			
			
        
			int first = Integer.parseInt(var[0]);
			int second = Integer.parseInt(var[1]);
			
			System.out.println(first+second);
			
		}
		       
        
    }
    
}