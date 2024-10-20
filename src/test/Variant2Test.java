package test;
import main.Variant2;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class Variant2Test {
    Variant2 variant2 = new Variant2();
    @Test
    void arrayTask() {
        double[] expected = {0.0,2.0,4.0,8.0,16.0,32.0};
        double[] actual = variant2.arrayTask(6);
        assertArrayEquals("The reversed array is incorrect.",expected,actual,0.001);
    }

    @Test
    void booleanTask() {
        //не парні
        assertEquals(true, variant2.booleanTask(11));
        //парні
        assertEquals(false, variant2.booleanTask(12));
    }

    @Test
    void switchTask() {
        assertEquals("Погано",variant2.switchTask(1));
        assertEquals("Незадовільно",variant2.switchTask(2));
        assertEquals("Задовільно",variant2.switchTask(3));
        assertEquals("Добре",variant2.switchTask(4));
        assertEquals("Помилка",variant2.switchTask(5));
    }

    @Test
    void forTask() {
        assertEquals(5,variant2.forTask(1,5));
    }

    @Test
    void ifTask() {
        assertEquals(3,variant2.ifTask(2));
        assertEquals(-3,variant2.ifTask(-1));
    }

    @Test
    void integerNumbersTask() {
        assertEquals(10,variant2.integerNumbersTask(10000));
    }

    @Test
    void twoDimensionArrayTask() {
        int[][] expected ={
                {0,0,0},
                {5,5,5},
                {2,2,2}
        };
        int[][] actual = variant2.twoDimensionArrayTask(3, 3, 1);
        assertArrayEquals(expected,actual);
        expected = new int[][]{
                {0, 0, 0},
                {1, 1, 1},
                {5, 5 ,5}
        };
        actual = variant2.twoDimensionArrayTask(3, 3, 2);
    }
 @Test
    void whileTask() {
        assertEquals(4,variant2.whileTask(8,2));
 }


}
