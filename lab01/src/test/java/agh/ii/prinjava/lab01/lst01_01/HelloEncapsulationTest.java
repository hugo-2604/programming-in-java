package agh.ii.prinjava.lab01.lst01_01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloEncapsulationTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void get_test() {
        HelloEncapsulation enDemo = new HelloEncapsulation(42);
        // int propVal = enDemo.propVal; // (!)
        // To read or to modify the value of "propVal", we cannot access it directly
        // because of the access modifier ("private"). Instead:
        int propVal = enDemo.getPropVal();
        //propVal++;

        assertEquals(42, propVal);
    }

}