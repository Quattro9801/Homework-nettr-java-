import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MyIterator<E> implements  Iterator<E> {
    Node<E> current;

    public MyIterator(MyLinkedList<E> list)
    {
        current = list.getBegin();
    }

    // returns false if next element does not exist

    public boolean hasNext()
    {
        return current != null;
    }

    // return current data and update pointer
    public E next()
    {
        E data = current.getElement();
        current = current.getNextNode();
        return data;
    }






}

