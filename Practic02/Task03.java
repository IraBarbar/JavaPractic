// Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает
// boolean значение).

public class Task03 {
    
    public static void main(String[] args) {
        String string1 = "шАлаш";
        String string2 = "шоколад";
        System.out.println(testPolidrom(string1));
        System.out.println(testPolidrom(string2));

    }

    public static boolean testPolidrom(String text) {
        StringBuilder myString = new StringBuilder();
        myString.append(text.toLowerCase()).reverse();
        System.out.printf("%s and %s\n", text.toLowerCase(), myString);
        return text.equalsIgnoreCase(myString.toString());
    }
}
