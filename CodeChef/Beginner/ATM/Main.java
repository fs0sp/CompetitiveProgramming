import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    
    public static void main(String args[])  throws Exception {
        int wid;
        float bal;
        double availBal = 0.0;
        
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		
		String var[] = scan.readLine().split(" ");
        
        wid = Integer.parseInt(var[0]);
        bal = Float.parseFloat(var[1]);
        
        if((wid % 5 == 0) && (bal > (wid+0.5))) {
            availBal = bal - (wid+0.5);
            System.out.println(availBal);
        } else {
            System.out.println(bal);
        }
        
        
        
    }
    
}