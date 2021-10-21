package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;

public class MyQueueDLLBImpl<E> implements MyQueue<E> {
    private DLinkList<E> elems = new DLinkList<>();

    /**
     * enqueue is a method to add a node at the end of the
     * link list through the addLast method
     * @param x (type E)
     */
    @Override
    public void enqueue(E x) {
        elems.addLast(x);
    }

    /**
     * dequeue is a method to remove a node at the beginning
     * of the link list through the removeFirst method
     * @return E
     */

    @Override
    public E dequeue() {
        return elems.removeFirst();
    }

    /**
     * numOfElems is a method to return the number of nodes in the link list
     * through the method getNumOfElems
     * @return int
     */

    @Override
    public int numOfElems() {
        return elems.getNumOfElems();
    }

    /**
     * peek is a method allowing to return the value of the first node of the
     * link list by means of the other method peek (in which we put the
     * value 0 in parameter in order to receive the value of the first node)
     * @return E
     */
    @Override
    public E peek() {
        return elems.peek(0);
    }

}
