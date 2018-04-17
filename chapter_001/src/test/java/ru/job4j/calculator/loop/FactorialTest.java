package ru.job4j.calculator.loop;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
   @Test
    public void provercaFactorial() {
        Factorial fac = new Factorial();
        int result = fac.calc(5);
        assertThat(result, is(120));

    }
}
