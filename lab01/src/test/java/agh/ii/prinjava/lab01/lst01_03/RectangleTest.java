package agh.ii.prinjava.lab01.lst01_03;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void test_perimetre(){
        //Rectangle
        Rectangle rectangle_test = new Rectangle(2,4,false);
        assertEquals(12,rectangle_test.perimeter());

        //Circle
        Circle circle_test = new Circle(4,false);
        assertEquals(2*Math.PI*4,circle_test.perimeter());
    }

}