// Задание №1
// Заполнить список десятью случайными числами.
// Отсортировать список методом sort() и вывести его на
// экран.

package Practic03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task02 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
            Random random = new Random();
        
            for (int i = 0; i < 10; i++) {
              int randomNumber = random.nextInt(100); // случайное число от 0 до 99
              numbers.add(randomNumber);
            }
        
            System.out.println("Список случайных чисел: " + numbers);
            numbers.sort(null);
            System.out.println("Список случайных чисел: " + numbers);
          }
                
}
