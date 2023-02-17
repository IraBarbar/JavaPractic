// Заполнить список названиями планет Солнечной
// системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его
// повторений в списке.
// Задание состоит из двух блоков
// Задание №2.2 (если выполнено первое задание)
// Пройти по списку из предыдущего задания и удалить
// повторяющиеся элементы.

package Practic03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task03 {
    public static void main(String[] args) {
        ArrayList <String> planeta = new ArrayList<>(Arrays.
                        asList("Марс", "Земля", "Марс"));
        Set<String> set =new LinkedHashSet<>(planeta);  
        for (String item : set) {
            int count = Collections.frequency(planeta, item);
            System.out.printf("%s - %d\n", item, count);            
        } 
        for (String item : set) {
            int count = Collections.frequency(planeta, item);
            while (count > 1){
            planeta.remove(item);
            count = Collections.frequency(planeta, item);
        }
    }   
    System.out.println(String.join(", ", planeta) );             
    }
}
