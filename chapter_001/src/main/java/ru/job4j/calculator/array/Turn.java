package ru.job4j.calculator.array;
/**
 * afanasev serei (qwerr75@mail.ru).
 * перевернуть массив.
 */
public class Turn {
    public int[] turn(int[] array) {
        int y = (int)array.length / 2;
        int minindex = 0;
        int maksindex=array.length - 1;
        for (int i = 0; i < y; i++) {
             int element1 = array[minindex];
             int element2 = array[maksindex];
             array[minindex] = element2;
             array[maksindex] = element1;
             minindex++;
             maksindex--;
        }
        return array;
    }
}
