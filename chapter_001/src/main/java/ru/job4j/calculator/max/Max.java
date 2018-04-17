package ru.job4j.calculator.max;

/**
 * афанасьев сергей (qwerr75@mail.ru)
 * Максимум из двух чисел
 * @version 0.1
 */
public class Max {
    /**
     *
     * @param second второе число от пользователя
     * @param first первое число от пользователя
     * @return ответж
     *
     */
    public int max2( int first, int second ) {
        int res = 1;
       if ( first > second ) {
           res = first;
       }else {
           res = second;
       }
       return res;
    }
    /**
     *
     * @param second второе число от пользователя
     * @param first первое число от пользователя
     * @param  third    3 число от пользователя
     * @return ответж
     *
     */
    public int max(int first, int second, int third) {
       return max2( max2(first,second),third);
    }
}
