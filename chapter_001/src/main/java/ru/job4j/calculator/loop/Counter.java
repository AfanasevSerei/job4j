package ru.job4j.calculator.loop;
/**
 * @author Афанасьев Сергей(qwerr75@mail.ru)
 * проверка Подсчет суммы чётных чисел в диапазоне
 */
public class Counter {
    /**
     * @param start начальный парам..
     * @param finish конечный парам..
     */
    public int add(int start, int finish) {
        int res=0;
        for (int i=start; i<=finish; i++) {
            if(i%2==0) {
               res=res+i;
            }
        }
        return res;
    }
}
