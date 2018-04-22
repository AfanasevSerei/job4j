package ru.job4j.calculator.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    @Test
    public void teste() {
        ArrayDuplicate word = new ArrayDuplicate();
        String[] myarr = {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] result = word.remove(myarr);
        String[] proverka = {"Привет", "Мир", "Супер"};
        assertThat(result, is(proverka));
    }
}
