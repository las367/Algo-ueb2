package HO2;

public class Stack<T> implements Stackable<T> {

    private Node head;
    private int counter;

    private class Node {
        T data;
        Node next;
    }

    @Override
    public void push (T data) {

        Node memorized = head;

        head = new Node();
        head.data = data;
        head.next = memorized;
        counter++;
    }

    @Override
    public T pop () {

        if ( head == null ) return null;

        T retObj = head.data;
        head = head.next;
        counter--;
        return retObj;
    }

    @Override
    public T peek () {
        if ( head == null ) return null;

        return head.data;
    }

    @Override
    public boolean isEmpty () {
        return head == null;
    }

    @Override
    public int size () {
        
        return counter;
    }

    @Override
    public void printAll () {
        
        Node current = head;
        
        while ( current != null ) {
            System.out.println(current.data);
            current = current.next;
        }
    }
    
    @Override
    public void clear () {

        head = null;
        counter = 0;
    }

}