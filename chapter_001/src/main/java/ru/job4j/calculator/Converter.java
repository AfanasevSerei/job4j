package ru.job4j.calculator;

/**
 * конвертер валют.
 */
public class Converter {
    /**
     * евро = 70 рублей.
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public double rubleToEuro(double value) {
        return value / 70;
    }

    /**
     * 1доллар = 60 рублей.
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллоры.
     */
    public double rubleToDollar(double value) {
        return value / 60;
    }
    /**
     * евро = 70 рублей.
     * Конвертируем рубли в евро  рубли .
     * @param value рубли.
     * @return Евро.
     */
    public  double evroToRubl(double value) {
        return value * 70;
    }
    /**
     * 1доллар = 60 рублей.
     * Конвертируем доллары в рубли.
     * @param value рубли.
     * @return Доллоры.
     */
    public double dollarToRuble(double value) {
        return value * 60;
    }
}
