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

    /**
     * peek is a method that displays the value of the first node
     * or the value of the last node. It depends of the value of
     * the paremeter bool. If it is equal to 0, the method will
     * return the value of the first node. And if is note the case,
     * it will return the value of the last node.
     * @param bool (type: int)
     * @return E
     */
    public E peek(int bool) {
        if (bool == 0) {
            return first.elem;
        } else {
            return last.elem;
        }
    }

    /**
     * addFirst is a method that allows to add a node to the first
     * place in a linklist
     * @param e (type: E)
     */
    public void addFirst(E e) {
        if (numOfElems == 0){
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

    /**
     * addLast is a method that allows to add a node to the last
     * place in a linklist
     * @param e (type : E)
     */
    public void addLast(E e) {
        if (numOfElems == 0){
            Node<E> new_node=new Node(e,null,null);
            first = new_node;
            last = new_node;
            numOfElems++;
        }
        else{
            Node<E> new_node=new Node(e,null,null);
            last.next = new_node;
            new_node.prev = last;
            last =new_node;
            numOfElems++;
        }
    }

    /**
     *removeFirst is a method that allows to remove a node to the first
     *place in a linklist
     * @return E
     */

    public E removeFirst() {
        if (numOfElems == 0) {
            throw new IllegalStateException("The linklist is empty, so we can't remove a node");
        }
        else if(numOfElems == 1){
            E deleted_e = first.elem;
            first = null;
            last = null;
            numOfElems--;
            return deleted_e;
        }
        else{
            E deleted_e = first.elem;
            Node<E> cmp = first.next;
            first.next =null;
            cmp.prev = null;
            first = cmp;
            numOfElems--;
            return deleted_e;

        }
    }

    /**
    *removeLast is a method that allows to remove a node to the last
     *place in a linklist
     * @return E
    */

    public E removeLast() {
        if (numOfElems == 0) {
            throw new IllegalStateException("The linklist is empty, so we can't remove a node");
        }
        else if(numOfElems == 1){
            E deleted_e = first.elem;
            first = null;
            last = null;
            numOfElems--;
            return deleted_e;
        }
        else{
            E deleted_e = last.elem;
            Node<E> cmp = last.prev;
            last.prev =null;
            cmp.next = null;
            last = cmp;
            numOfElems--;
            return deleted_e;
        }
    }

    /**
     * toString is a method that returns a string
     * composed by the value of the first node, the value
     * of the last node and the number of node in the linklist
     * @return String
     */

    @Override
    public String toString() {
        return "DLinkList{" + first.elem +","+ last.elem+","+numOfElems+"}";
    }

    /**
     * getNumOfElems is a method that returns the number of
     * node in the linklist
     * @return int
     */

    public int getNumOfElems(){
        return numOfElems;
    }
}
