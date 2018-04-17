package ru.job4j.calculator.array;

/**
 * afanasev serei (qwerr75@mail.ru).
 * zapolnenie masiva.
 * @version 0.1.
 */
public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        // заполнить массив через цикл элементами от 1 до bound возведенными в квадрат
        for(int i = 0; i < bound; i++){
            int ii=i+1;
            int res=(int)Math. pow(ii, 2);
            rst[i] = res;
        }
        return rst;
    }
}
