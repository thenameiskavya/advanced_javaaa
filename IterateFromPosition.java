package lab1;
import java.util.*;
public class IterateFromPosition {





    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");

        // Start from 2nd element (index 1)
        Iterator<String> iteratorObj = list.listIterator(1);

        System.out.println("Elements from 2nd position:");

        while (iteratorObj.hasNext()) {
            System.out.println(iteratorObj.next());
        }
    }
}