package pattern_adapter;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * Created by a.kuspakov on 10.10.2016.
 */
public class EnumerationIterator implements Iterator {
    Enumeration enumeration;

    public  EnumerationIterator(Enumeration enumeration){
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void forEachRemaining(Consumer action) {
        Consumer<String> c = (x) -> System.out.println(x.toLowerCase());
        c.accept("Into method forEachRemaining in class - " + enumeration.getClass().getName());
    }
}
