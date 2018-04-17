package ru.job4j.calculator.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * afanasev serei (qwerr75@mail.ru).
 * сортировка массив.
 */
public class BubbleSortTest {
    @Test
    public  void  testsort() {
        BubbleSort bs = new BubbleSort();
        int[] testarr = new int[] {3, 5, 1, 4, 2};
        int[] resarr = bs.Sort(testarr);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(resarr, is(expect));
    }
}
