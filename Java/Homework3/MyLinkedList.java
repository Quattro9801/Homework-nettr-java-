import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class MyLinkedList<E> implements IlinkedList<E>, Iterable<E> {
    private int size=0;
    private Node<E> begin;
    private Node<E> current;
    private Node<E> tail;
    private int modCount=0;



    @Override
    public void add(E element) {
        final Node<E> node = new Node<>(element);

        if (this.begin == null) {
            this.begin = node;
        } else {
            current = this.begin;
            while (current.nextNode != null) {
                current = current.nextNode;
            }
            current.nextNode = node;


        }
        this.size++;


    }

    public Node<E> getBegin() {
        return begin;
    }

    public Node<E> getCurrent() {
        return current;
    }

    @Override
    public void add(int index, E element) throws IllegalArgumentException {//++

      current = begin;
        if (index < 0 || index > this.size()) {
            throw new IllegalArgumentException("The index can't be greater or less than the length of the list");
        }
        int count = 0;
        Node node = new Node(element);
        if (index == 0) {
            node.nextNode = current;
            this.begin = node;
        }
        else {
            while (current != null && ++count != index)
                current = current.nextNode;
                node.nextNode = current.nextNode;
                current.nextNode = node;

            this.size++;
        }

    }

    @Override
    public void clear() {//++
        current = begin;
        for (Node<E> x = begin; x != null; ) {
           Node<E> next = x.nextNode;
            x.nextNode = null;
            x = next;
        }
        begin = current = null;
        size = 0;
        modCount++;


    }


    @Override
    public E get(int index) throws IllegalArgumentException {//++
        E element = null;
       current=this.begin;
        int count = 0;

        if(begin==null)
            throw new IndexOutOfBoundsException("List is empty");
        if (index < 0 || index > this.size())
            throw new IndexOutOfBoundsException("Index greater than list size");
        //If given index is of head node then return the data
        if(index==count)
            element = begin.getElement();
            //If given index is of tail node then return data
        else if(index==(size))
            element = tail.getElement();
        else {
            //Checking the given index with the node index
            while(current!=null) {
                if(count==index) {
                    element=current.getElement();
                    break;
                }
                current= current.nextNode;
                count++;
            }
        }
        return element;
    }



    @Override
    public int indexOf(E element) {//++
        current = this.begin;
        int index = 0;

        while (current != null && current.getElement() != null) {
            if (current.getElement().equals(element)) {
                return index;
            } else {
                current = current.nextNode;
                index++;
            }
        }
        return -1;


    }

    @Override
    public E remove(int index) throws IllegalArgumentException {

        if (index < 0 || index > this.size()) {
            throw new IllegalArgumentException("The index can't be greater or less than the length of the list");
        }

        else  {
         current = begin;
        Node <E> previous=current;
        int count = 0;
            if (index == 0) {
                this.begin = current.nextNode;
            } else {
                while (current != null && count++<index) {

                    previous = current;
                    current = current.nextNode;
                }
                previous.nextNode = current.nextNode;
            }
            this.size--;


            return current.getElement();
        }


    }

@Override
    public E set(int index, E element) throws IllegalArgumentException {//++

    if (index < 0 || index > this.size()) {
        throw new IllegalArgumentException("The index can't be greater or less than the length of the list");
    }
    else {
        current = begin;

        Node node = new Node(element);
        Node<E> previous = current;
        int count = 0;

        if (index == 0) {
                this.begin = node;
            node.nextNode = current.nextNode;

        } else {

            while (current != null && count++ < index) {

                previous = current;
                current = current.nextNode;
            }
            previous.nextNode = node;
            node.nextNode = current.nextNode;
        }
        return current.getElement();

    }
   // return null;


}

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (E item : this)
            s.append(item + " ");
        return s.toString();


    }

    public void print() {
        Node<E> current = this.begin;
        while (current != null) {
            System.out.println(current.getElement());
            current = current.nextNode;

        }
    }

@Override
    public <T> T[] toArray(T[] list) {//++
        if (list.length < size)
            list = (T[])java.lang.reflect.Array.newInstance(
                    list.getClass().getComponentType(), size);
        int i = 0;
        Object[] result = list;
        for (Node<E> x = begin; x != null; x = x.nextNode)
            result[i++] = x.getElement();

        if (list.length > size)
            list[size] = null;

        return list;
    }
    @Override
    public Iterator<E> iterator()
    {
        return (Iterator<E>) new MyIterator<E>(this);
    }


}

