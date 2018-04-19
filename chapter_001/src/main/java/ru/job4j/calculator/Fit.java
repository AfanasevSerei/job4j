package ru.job4j.calculator;

/**
 * Программа расчета идеального веса.
 */
public class Fit {

    /**
     * (рост в сантиметрах – 100) · 1,15.
     * Идеальный вес для мужщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    public double manWeight(double height) {
        double res = (height - 100) * 1.15;
        return res;
    }

    /**
     * (рост в сантиметрах – 110) · 1,15.
     * Идеальный вес для женщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    public double womanWeight(double height) {
        double res = ( height - 110 ) * 1.15;
        return res;
    }
}