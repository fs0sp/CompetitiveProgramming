public static int repeatingIndex(String s) {
        
        boolean[] visited = new boolean[256];
        int res = -1;
        for(int i=s.length()-1;i>=0;i--) {
            if(visited[s.charAt(i)] == false) {
                visited[s.charAt(i)] = true;
            } else {
                res = i;
            } 
        }
        
        return res;
        
    }