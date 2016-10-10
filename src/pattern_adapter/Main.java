package pattern_adapter;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by a.kuspakov on 10.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> states = new ArrayList<String>();
        states.add("Германия");
        states.add("Франция");
        states.add("Италия");
        states.add("Испания");

        Iterator<String> iterator = states.iterator();
        IteratorEnumeration iteratorEnumeration = new IteratorEnumeration(iterator);
        System.out.println("Has Next element " + iteratorEnumeration.hasMoreElements());
        System.out.println("Next element " +iteratorEnumeration.nextElement());
        System.out.println("Remove current element " + iteratorEnumeration);
        iteratorEnumeration.remove();
        iteratorEnumeration.forEachRemaining();
    }
}
