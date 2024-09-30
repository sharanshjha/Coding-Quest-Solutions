//{ Driver Code Starts
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
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine(); // Flush the newline character left by nextInt
        while (T-- > 0) {
            MyStack sq = new MyStack();
            String line = scanner.nextLine();
            Scanner ss = new Scanner(line);
            List<Integer> nums = new ArrayList<>();
            while (ss.hasNextInt()) {
                int num = ss.nextInt();
                nums.add(num);
            }
            int n = nums.size();
            int i = 0;
            while (i < n) {
                int QueryType = nums.get(i++);
                if (QueryType == 1) {
                    int a = nums.get(i++);
                    sq.push(a);
                } else if (QueryType == 2) {
                    System.out.print(sq.pop() + " ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}

// } Driver Code Ends
class MyStack {
    private Queue<Integer> queue;

    MyStack() {
        queue = new LinkedList<>();
    }

    // Function to push an integer into the stack.
    void push(int a) {
        queue.add(a);
        int size = queue.size();
        while (size > 1) {
            queue.add(queue.remove());
            size--;
        }
    }

    // Function to remove an item from top of the stack.
    int pop() {
        if (queue.isEmpty()) {
            return -1; // Stack is empty
        }
        return queue.remove();
    }

    // Additional helper method to check if the stack is empty
    boolean isEmpty() {
        return queue.isEmpty();
    }

    // Additional helper method to get the top element without removing it
    int peek() {
        if (queue.isEmpty()) {
            return -1; // Stack is empty
        }
        return queue.peek();
    }
}