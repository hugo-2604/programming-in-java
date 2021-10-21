package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueDLLBImplTest {
    MyQueue<Integer> queueOfInts = MyQueue.create();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    /**
     * In order to test the enqueue method, we add 2 nodes in a link list
     * and we see, thanks to the peek method, that it is the value of the
     * first node
     */
    @Test
    void enqueue(){
        queueOfInts.enqueue(2);
        queueOfInts.enqueue(4);
        assertEquals(2,queueOfInts.peek());
    }

    /**
     * In order to test the dequeue method, we add 2 nodes in a link
     * list and we check that the value of the returned node corresponds
     * to the value of the first node of the link list
     */
    @Test
    void dequeue(){
        queueOfInts.enqueue(2);
        queueOfInts.enqueue(4);
        assertEquals(2,queueOfInts.dequeue());
    }

    /**
     *In order to test the numOfElems method, we add 3 nodes in a link
     * list and we check that the returned value corresponds to the number
     * of nodes in the list
     */

    @Test
    void numOfElems_test(){
        queueOfInts.enqueue(2);
        queueOfInts.enqueue(4);
        queueOfInts.enqueue(3);
        assertEquals(3,queueOfInts.numOfElems());
    }
}