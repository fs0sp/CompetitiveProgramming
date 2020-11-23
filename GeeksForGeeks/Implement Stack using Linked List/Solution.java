// { Driver Code Starts
import java.util.*;

class StackNode {
    int data;
    StackNode next;
    StackNode(int a) {
        data = a;
        next = null;
    }
}

class GfG {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            MyStack obj = new MyStack();
            int Q = sc.nextInt();
            while (Q > 0) {
                int QueryType = 0;
                QueryType = sc.nextInt();
                if (QueryType == 1) {
                    int a = sc.nextInt();
                    obj.push(a);
                } else if (QueryType == 2) {
                    System.out.print(obj.pop() + " ");
                }
                Q--;
            }
            System.out.println("");
            t--;
        }
    }
}
// } Driver Code Ends


/*
The structure of the node of the stack is
class StackNode
{
    int data;
    StackNode next;
    StackNode(int a)
    {
       data = a;
       next = null;
    }
}
*/
class MyStack {

    // Note that top is by default null
    // in Java
    StackNode top;

    void push(int a) {
        // Add your code here
        // StackNode temp = top;
        StackNode newNode = new StackNode(a);
        newNode.next = top;
        top = newNode;
        
    }
    int pop() {
        // Add your code here
        
        if (top == null) { 
            // System.out.print("\nStack Underflow"); 
            return -1; 
        } 
        int val = top.data;
        top = top.next;
        return val;
        
    }
}
