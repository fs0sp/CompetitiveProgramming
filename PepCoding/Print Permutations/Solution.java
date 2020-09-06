import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        String s = scan.nextLine();
        
        printPermutations(s, "");
        
    }

    public static void printPermutations(String input, String result) {
        
        if(input.length() == 0) {
            System.out.println(result);
        }
        
        for(int i=0;i<input.length();i++) {
            char ch = input.charAt(i);
            String leftPart = input.substring(0,i);
            String rightPart = input.substring(i+1);
            String str = leftPart + rightPart;
            
            printPermutations(str, result + ch);
        }
        
        
    }

}