package agh.ii.prinjava.lab03.exc03_01.impl;

import agh.ii.prinjava.lab03.exc03_01.QueueOfInts;

public class LinkedListBasedImpl implements QueueOfInts {


    @Override
    public void enqueue(int x) {
        //throw new IllegalStateException("To be implemented");
        if (isEmpty()){
            first = new Node(x,null, null);
            last = first;
            numOfElems++;
        }
        else{
            Node new_node = new Node(x,null, null);
            last.prev = new_node;
            new_node.next= last;
            last = new_node;
            numOfElems++;
        }
    }

    @Override
    public int dequeue() {
        if (isEmpty()){
            throw new IllegalStateException("We can't dequeue an empty queue");
        }
        else if(numOfElems == 1){
            int deleted_elem= first.elem;
            first = null;
            last = null;
            numOfElems--;
            return deleted_elem;
        }
        else{
            Node cmp = first.prev;
            first.prev = null;
            int deleted_elem= first.elem;
            cmp.next=null;
            first = cmp;
            numOfElems--;
            return deleted_elem;
        }

    }

    @Override
    public int numOfElems() {
        return numOfElems;
    }

    @Override
    public int peek() {
        return first.elem;
    }

    private static class Node {
        int elem;
        Node next;
        Node prev;

        public Node(int elem, Node next, Node prev) {
            this.elem = elem;
            this.next = next;
            this.prev = prev;
        }
    }

    private Node first = null;
    private Node last = null;

    private int numOfElems = 0;
}