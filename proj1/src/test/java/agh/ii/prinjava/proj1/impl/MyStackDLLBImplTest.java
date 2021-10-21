package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackDLLBImplTest {
    MyStack<Integer> stackOfInts = MyStack.create();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    /**
     * in order to test the push method, we will add two nodes
     * in the beginning of the link list, then we will check which
     * is the first node with the peek method
     */

    @Test
    void push_test(){
        stackOfInts.push(10);
        stackOfInts.push(1);
        assertEquals(1,stackOfInts.peek());
    }

    /**
     * in order to test the pop method, we will add two nodes
     * in the beginning of the link list, then we will check that
     * the value returned by the pop method corresponds to that of
     * the previous first node of the link list
     */

    @Test
    void pop_test(){
        stackOfInts.push(10);
        stackOfInts.push(1);
        assertEquals(1,stackOfInts.pop());
    }

    /**
     * In order to test the numOfElems method, we add 2 nodes in a link
     * list and we check that the returned value corresponds to the number
     * of nodes in the list
     */

    @Test
    void numOfElems_test(){
        stackOfInts.push(10);
        stackOfInts.push(1);
        assertEquals(2,stackOfInts.numOfElems());
    }
}