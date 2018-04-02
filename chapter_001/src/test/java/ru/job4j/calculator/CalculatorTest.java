package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test Plus
 *   1+1=2
 */
public class CalculatorTest {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    /**
     * Test Minus
     * 2-1=1
     */
    @Test
    public void whenAddTwoMinysOneThenOne() {
        Calculator calc = new Calculator();
        calc.subtract(2D,1D);
        double result = calc.getResult();
        double expected = 1.0;
        assertThat(result, is(expected));
    }

    /**
     * Test Multiple
     * 2*2=4
     */
    @Test
    public void whenAddTwoMultipleOneThenTwo(){
        Calculator calc = new Calculator();
        calc.multiple(2D,2D);
        double result = calc.getResult();
        double expected = 4D;
        assertThat(result, is(expected));
    }
    /**
     * Test Div
     * 4/2=2
     */
    @Test
    public void whenAddFourDivTwoThenTwo() {
        Calculator calc = new Calculator();
        calc.div(4D,2D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
}