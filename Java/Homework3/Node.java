public class Node<E>{

    private E element;
    public Node <E> nextNode;
    public Node <E> prevNode;


    @Override
    public String toString() {
        return "Node{" +
                "element=" + element +
                ", nextNode=" + nextNode +
                '}';
    }



    public Node(E element) {
        this.element = element;
        this.nextNode = null;
    }

    public E getElement() {
        return element;
    }

    public Node<E> getNextNode() {
        return nextNode;
    }
}
