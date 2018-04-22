package ru.job4j.calculator.array;
/**
 * удаление Удаление дубликатов в массиве.
 *@author afanasev sergei(qwerr75@mail.ru)
 *
 */
public class ArrayDuplicate {
    public String[] remove(String[] array) {

        int n = array.length;

        for ( int i = 0, m = 0; i != n; i++, n = m )
        {
            for ( int j = m = i + 1; j != n; j++ )
            {
                if ( array[j] != array[i] )
                {
                    if ( m != j ) array[m] = array[j];
                    m++;
                }
            }
        }


        if ( n != array.length )
        {
            String[] b = new String[n];
            for ( int i = 0; i < n; i++ ) b[i] = array[i];

            array = b;
        }
        return array;
    }
}
