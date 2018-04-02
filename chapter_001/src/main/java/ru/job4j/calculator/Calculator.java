package ru.job4j.calculator;
/**
 * Package for calculate task.
 * @author Afanasev Serei (qwerr75@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Calculator {
    private double result;

    /**
     * сложение
     * @param first
     * @param second
     */
    public void add(double first, double second) {
        this.result = first + second;
    }

    /**
     * вычетание
     * @param first
     * @param second
     */
    public void subtract(double first, double second) {
        this.result = first - second;
    }

    /**
     * умножение
     * @param first
     * @param second
     */
    public void multiple(double first, double second) {
        this.result = first * second;
    }

    /**
     * деление
     * @param first
     * @param second
     */
    public void div(double first, double second) {
        this.result = first / second;
    }
    /**
    * @return
    */
    public double getResult() {
        return this.result;
    }
}