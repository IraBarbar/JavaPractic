// Каталог товаров книжного магазина сохранен в виде двумерного
// списка List<ArrayList<String>> так, что на 0й позиции каждого
// внутреннего списка содержится название жанра, а на остальных
// позициях - названия книг. Напишите метод для заполнения данной
// структуры.

package Practic03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task05 {
    public static void main(String[] args) {
        List<List<String>> catalog = new ArrayList<>();
        catalog.add(Arrays.asList("проза", "поэзия", "детектив"));
        catalog.add(Arrays.asList("1", "2", "3"));
        System.out.println(catalog);
    }
}
