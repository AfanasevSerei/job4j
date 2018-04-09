package ru.job4j.calculator.max;

import org.junit.Test;
//import ru.job4j.calculator.max.Max;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * афанасьев сергей (qwerr75@mail.ru)
 * тест Максимум из двух чисел
 * @version 0.1
 */
public class MaxTest {

    @Test
    public void whenFirstLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(3, 5, 6);
        assertThat(result, is(6));
    }
}
