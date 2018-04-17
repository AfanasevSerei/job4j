package ru.job4j.calculator.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * afanasev serei (qwerr75@mail.ru).
 * перевернуть массив.
 */
public class TurnTest {
    @Test
    public void mytest5() {
        Turn turn = new Turn();
        int[] myarray = new int[] {1, 2, 3, 4, 5};
        int[] result = turn.turn(myarray);
        int[] expect = new  int[] {5, 4, 3, 2, 1};
        assertThat(result, is(expect));

    }
    @Test
    public void mytest4() {
        Turn turn = new Turn();
        int[] myarray = new int[] {1, 2, 3, 4};
        int[] result = turn.turn(myarray);
        int[] expect = new  int[] {4, 3, 2, 1};
        assertThat(result, is(expect));

    }
}
