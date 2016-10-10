package pattern_adapter;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * Created by a.kuspakov on 10.10.2016.
 */
public class IteratorEnumeration implements Enumeration {
    public Iterator iterator;

    public IteratorEnumeration(Iterator iterator){
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }

    public void remove(){
        iterator.remove();
    }

    public void forEachRemaining(){
        Consumer<String> c = (x) -> System.out.println(x.toLowerCase());
        c.accept("Into method forEachRemaining in class - " + iterator.getClass().getName());
        iterator.forEachRemaining(c);
    }
}
