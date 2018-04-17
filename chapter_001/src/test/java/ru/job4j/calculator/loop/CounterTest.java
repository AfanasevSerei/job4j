package ru.job4j.calculator.loop;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Афанасьев Сергей(qwerr75@mail.ru)
 * проверка Подсчет суммы чётных чисел в диапазоне
 */
public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
     Counter con = new Counter();
     int resu=con.add(1,10);
     assertThat(resu, is(30));
    }
}
