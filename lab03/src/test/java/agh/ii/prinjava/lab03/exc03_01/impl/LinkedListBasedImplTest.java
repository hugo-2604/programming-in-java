package agh.ii.prinjava.lab03.exc03_01.impl;

import agh.ii.prinjava.lab03.exc03_01.QueueOfInts;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LinkedListBasedImplTest {

    // Create an empty queue
    private final QueueOfInts queueOfInts = QueueOfIntsFtry.create(QueueOfIntsFtry.Impln.L_LIST_B);

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void newQueueIsEmpty() {
        assertTrue(queueOfInts.isEmpty());
    }

    @Test
    void enqueue_test(){
        queueOfInts.enqueue(2);
        queueOfInts.enqueue(3);
        assertEquals(2,queueOfInts.peek());
    }

    @Test
    void dequeue_test(){
        queueOfInts.enqueue(3);
        assertEquals(3,queueOfInts.dequeue());
    }
}
