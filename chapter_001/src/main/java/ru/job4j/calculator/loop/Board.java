package ru.job4j.calculator.loop;

/**
 * @author afanasev sergei(qwerr75@mail.ru).
 * @version 01.
 */
public class Board {
    /**
     *
     * @param width ширина.
     * @param height высота.
     * @return доска.
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        boolean flag = true;
        for (int i=0; i < height; i++ ) {
            for (int j=0; j < width; j++) {
                // условие проверки, что писать пробел или X
                // Выше в задании мы определили закономерность, когда нужно проставлять X
                if (flag == true) {
                    screen.append("X");
                    flag = false;
                } else {
                    screen.append(" ");
                    flag = true;
                }
            }
            // добавляем перевод на новую строку.
            screen.append(ln);
        }
        return screen.toString();
    }
}
