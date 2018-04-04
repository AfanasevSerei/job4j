package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * тест вес
 */
public class FitTest {
    /**
     * Идеальный вес для мужщины.
     * (рост в сантиметрах – 100) · 1,15.
     */
    @Test
    public void manWeight() {
        Fit fit = new Fit();
        double weight = fit.manWeight(180);
        assertThat(weight, is(92D));
    }

    /**
     * Идеальный вес для женщины.
     * (рост в сантиметрах – 110) · 1,15.
     */
    @Test
    public void womanWeight() {
        Fit fit = new Fit();
        double weight = fit.womanWeight(170);
        assertThat(weight, is(69D));
    }
}