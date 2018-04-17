package ru.job4j.calculator.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {
    @Test
    public void whenArrayHasLengh5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArray() {
        FindLoop find =new FindLoop();
        int[] myarr = new int[] {5, 10, 3};
        int value = 7;
        int result = find.indexOf(myarr, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
}
