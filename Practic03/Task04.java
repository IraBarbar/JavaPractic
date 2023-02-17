// Создать список типа ArrayList<String>.
// Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа

package Practic03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Task04 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Марс", "1", "5", "привет"));

        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            try {
                Integer.parseInt(list.get(i));
                list.remove(i);
                i--;
            } catch (Exception e) {}
        }
        System.out.println(list);
    }
}
