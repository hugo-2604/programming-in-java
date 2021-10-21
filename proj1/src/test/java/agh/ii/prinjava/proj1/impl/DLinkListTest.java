package agh.ii.prinjava.proj1.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

class DLinkListTest {
    DLinkList<Integer> dLinkList = new DLinkList<>();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    /**
     * add_first_test is a test to check the correct operation of the method
     * addFirst. To do this, we add 2 nodes in first position. Then we check
     * that we have the second node added in first position with the peek
     * method.
     */
    @Test
    void add_first_test(){
        dLinkList.addFirst(10);
        dLinkList.addFirst(1);
        assertEquals(1,dLinkList.peek(0));
    }

    /**
     * add_last_test is a test to check the correct operation of the addLast
     * method. To do this, we add 2 nodes in the last position. Then we check
     * that we have the second node added in last position with the peek method
     */

    @Test
    void add_last_test(){
        dLinkList.addLast(3);
        dLinkList.addLast(5);
        assertEquals(5,dLinkList.peek(1));
    }

    /**
     * remove_first_test is a test to check the correct operation of the
     * removeFirst method. To do this, we add 2 nodes in the last position.
     * Then we check that the value of the node returned by the removeFirst
     * method corresponds to the value of the previous first node of the link
     * list
     */

    @Test
    void remove_first_test(){
        dLinkList.addLast(3);
        dLinkList.addLast(4);
        assertEquals(3,dLinkList.removeFirst());
    }

    /**
     *remove_last_test is a test to check the correct operation of the
     * removeLast method. To do this, we add 2 nodes in the last position.
     * Then we check that the value of the node returned by the removeLast
     * method corresponds to the value of the previous last node of the link
     * list
     */

    @Test
    void remove_last_test(){
        dLinkList.addLast(3);
        dLinkList.addLast(5);
        assertEquals(5,dLinkList.removeLast());
    }

    /**
     * to_string_test is a test to check the correct operation of the
     * toString method. To do this, we add 3 nodes in the last position.
     * Then we check that the string returned by the toString method matches
     * with what we have implemented
     */
    @Test
    void to_string_test(){
        dLinkList.addFirst(3);
        dLinkList.addFirst(2);
        dLinkList.addFirst(1);
        assertEquals("DLinkList{1,3,3}",dLinkList.toString());
    }

}