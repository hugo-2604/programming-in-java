package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;

public class MyStackDLLBImpl<E> implements MyStack<E> {
    private DLinkList<E> elems = new DLinkList<>();

    /**
     * pop is a method to remove the first node from a link
     * list using the removeFirst method
     * @return E
     */
    @Override
    public E pop() {
        return elems.removeFirst();
    }

    /**
     *push is a method to add the first node of a link list
     * through the addFirst method
     * @param x (Type E)
     */

    @Override
    public void push(E x) {
        elems.addFirst(x);
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


