// Напишите метод, который находит самую длинную строку общего 
// префикса среди массива строк.
// Если общего префикса нет, вернуть пустую строку "".
package Practic01;

public class Task04 {
    public static void main(String[] args) {
    String[] arr   = new String[] {"abckkkkkflllllfsfs", "abcss","abcahjfaj","fdsssssssssssssssss"};
    int MaxLenght = 0;
    String pref = "abc";
    String result = "";
    for (String item : arr){
        if (item.startsWith(pref)){
            if (item.length() > MaxLenght){
                MaxLenght = item.length();
                result = item;
            }
        }
    }
    System.out.println(result);

    }
}
