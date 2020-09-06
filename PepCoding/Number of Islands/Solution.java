import java.io.*;
import java.util.*;

public class Main {
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int m = Integer.parseInt(br.readLine());
      int n = Integer.parseInt(br.readLine());
      int[][] arr = new int[m][n];

      for (int i = 0; i < arr.length; i++) {
         String parts = br.readLine();
         for (int j = 0; j < arr[0].length; j++) {
            arr[i][j] = Integer.parseInt(parts.split(" ")[j]);
         }
      }



      // write your code here
      
      int count = 0;
      boolean[][] visited = new boolean[arr.length][arr[0].length];
      
      for(int i=0;i<arr.length;i++) {
          for(int j=0;j<arr[i].length;j++) {
              if(arr[i][j] == 0 && visited[i][j] == false)  {
                  helperBFS(arr, i, j, visited);
                  count++;
              }
          }
      }
      
      System.out.println(count);
      
   }

    public static void helperBFS(int[][] grid, int i, int j, boolean[][] visited) {
        if( i < 0 || i >= grid.length || j<0 || j>= grid[i].length || grid[i][j] == 1 || visited[i][j] == true) {
            return;
        }
        
        // grid[i][j] = '0';
        visited[i][j] = true;
        
        helperBFS(grid, i-1, j, visited); // down 
        helperBFS(grid, i, j+1, visited);    // up
        helperBFS(grid, i, j-1, visited);     // left
        helperBFS(grid, i+1, j, visited);    // right
        
       
    }

}