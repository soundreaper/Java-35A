import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Exercise10_2 {
    public static void main( String[] args ) {
        List<Integer> integerArrayList = new ArrayList<Integer>();
        List<Integer> integerLinkedList = new LinkedList<Integer>();

        for (int i = 10; i <= 50; i+=10) {
            integerArrayList.add(i);
            integerLinkedList.add(i);
        }

        Iterator<Integer> arrayListIterator = integerArrayList.iterator();
        Iterator<Integer> linkedListIterator = integerLinkedList.iterator();

        while (arrayListIterator.hasNext()) {
            Integer arrayListInt = arrayListIterator.next();
            System.out.println(arrayListInt);
        }

        System.out.println();

        while (linkedListIterator.hasNext()) {
            Integer linkedListInt = linkedListIterator.next();
            System.out.println(linkedListInt);
        }
    }
}

// Output:
/*
10
20
30
40
50

10
20
30
40
50
 */