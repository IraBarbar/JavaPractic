// Напишите метод, который сжимает строку.
// Пример: вход aaaabbbcdd.
// Пример выхода: a4b3c1d2

public class Task02 {
    public static void main(String[] args) {
        String text = "aaaabbbcddz";
        System.out.println(pressString(text));
    }

    public static String pressString(String data) {
        StringBuilder myString = new StringBuilder();
        if (data.length() == 0)
            return "Пустая строка";
        int count = 0;
        char letter = data.charAt(0);
        for (int i = 0; i < data.length(); i++) {
            if (letter == data.charAt(i)) {
                count++;
            } else {
                myString.append(letter).append(count);
                count = 1;
                letter = data.charAt(i);
            }
            if ((i + 1) == data.length()) {
                myString.append(letter)
                        .append(String.valueOf(count));
            }
        }
        return myString.toString();
    }
}
