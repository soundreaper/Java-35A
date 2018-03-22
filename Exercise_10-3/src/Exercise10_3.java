import java.util.PriorityQueue;
import java.util.Stack;

public class Exercise10_3 {
    public static void main( String[] args ) {
        Stack<Integer> integerStack = new Stack<>();
        PriorityQueue<Integer> integerPriorityQueue = new PriorityQueue<>();

        for (int i = 10; i <= 50; i+=10) {
            integerStack.add(i);
            integerPriorityQueue.add(i);
        }

        while (!(integerStack.empty())) {
            System.out.println(integerStack.pop());
        }

        System.out.println();

        while (!(integerPriorityQueue.peek() == null)) {
            System.out.println(integerPriorityQueue.poll());
        }
    }
}

// Output:
/*
50
40
30
20
10

10
20
30
40
50
 */
