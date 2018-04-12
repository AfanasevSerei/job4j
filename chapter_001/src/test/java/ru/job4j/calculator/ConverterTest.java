package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * тест конвертера валют
 */
public class ConverterTest {
    /**
     *рубль в доллар
     */
    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        double result = converter.rubleToDollar(60D);
        assertThat(result, is(1D));
    }

    /**
     *рубль в евро
     */
    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        double result = converter.rubleToEuro(70D);
        assertThat(result, is(1D));
    }
    /**
     * доллар в рубль
     */
    @Test
    public void when60DollarToRubleThen1() {
        Converter converter = new Converter();
        double result = converter.dollarToRuble(60);
        assertThat(result, is(3600D));
    }

    /**
     *евро в рубль
     */
    @Test
    public void when70EuroToRubleThen1() {
        Converter converter = new Converter();
        double result = converter.evroToRubl(70);
        assertThat(result, is(4900D));
    }
}
