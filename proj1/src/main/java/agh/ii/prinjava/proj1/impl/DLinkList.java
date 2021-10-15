package agh.ii.prinjava.proj1.impl;


public class DLinkList<E> {
    // ...
    private static class Node<T> {
        T elem;
        Node<T> next;
        Node<T> prev;

        public Node(T elem, Node<T> next, Node<T> prev) {
            this.elem = elem;
            this.next = next;
            this.prev = prev;
        }
    }

    private Node<E> first = null;
    private Node<E> last = null;
    private int numOfElems = 0;

    @Override
    public void addFirst(E e) {
        if (e == null){
            Node<E> new_node=new Node(e,null,null);
            first = new_node;
            last = new_node;
            numOfElems++;
        }
        else{
            Node<E> new_node=new Node(e,null,null);
            first.prev = new_node;
            new_node.next=first;
            first= new_node;
            numOfElems++;
        }


    }

    @Override
    public E peek(){
        return first.elem;
    }
    /*
    @Override
    public void addFLast(E e) {
        throw new IllegalStateException("To be implemented");
    }

    @Override
    //!!!doubt!!!
    public E removeFirst() {
        throw new IllegalStateException("To be implemented");
    }

    @Override
    public E removeLats() {
        throw new IllegalStateException("To be implemented");
    }

    @Override
    public void toString(){
        throw new IllegalStateException("To be implemented");
    }
    */

}
