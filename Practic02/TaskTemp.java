// package Practic02;

// public class Task02 {
//     /*
// Напишите метод, который сжимает строку.
// Пример: вход aaaabbbcdd.
// Пример выхода: a4b3c1d2
// */
// public class Task_2 {
//     public static void main(String[] args) {
//         String data = "aaaabbbcdd";
//         System.out.println(encrypter(data));
//     }

//     public static StringBuilder encrypter(String data) {
//         StringBuilder myString = new StringBuilder();
//         if (data.length() == 0) return myString;
//         char currentChar = data.charAt(0);
//         int currentCount = 0;
//         for (int i = 0; i < data.length(); i++) {
//             if (currentChar == data.charAt(i)) {
//                 currentCount++;
//             } else {
//                 myString.append(currentChar)
//                         .append(String.valueOf(currentCount));
//                 currentChar = data.charAt(i);
//                 currentCount = 1;
//             }
//             if ((i+1) == data.length()){
//                 myString.append(currentChar)
//                         .append(String.valueOf(currentCount));
//             }
//         }

//         return myString;
//     }
// }
// }
// // Напишите метод, который принимает на вход строку (String) и 
// // определяет является ли строка палиндромом (возвращает 
// // boolean значение).

// /*
// Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает
// boolean значение).
// */
// public class Task_3 {
//     public static void main(String[] args) {
//         String myString1 = "шалаш";
//         String myString2 = "шоколад";
// //        System.out.println(palindrome(myString1));
// //        System.out.println(palindrome(myString2));
//         System.out.println(palindrome2(myString1));
//     }

//     public static boolean palindrome(String data){
//         int size = data.length();
//         for (int i = 0; i < data.length() / 2; i++) {
//             if (data.charAt(i) != data.charAt(size - i - 1)){
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static boolean palindrome2(String data){
//         StringBuilder reversed = new StringBuilder(data.toLowerCase()).reverse();
//         return reversed.toString().equalsIgnoreCase(data);
//     }
// }
// /*
// Напишите метод, который составит строку, состоящую из 100
// повторений слова TEST и метод, который запишет эту строку в
// простой текстовый файл, обработайте исключения.
// */

// import java.io.File;
// import java.io.FileWriter;

// public class Task_4 {
//     public static void main(String[] args) {
//         String myString = "TEST";
//         String data = getString(myString);
//         writeToFile(data);
//     }

//     public static String getString(String template){
//         return template.repeat(100);
//     }

//     public  static void writeToFile(String data){
//         try {
//             String pathProject = System.getProperty("user.dir");
//             String pathFile = pathProject.concat("\\file.txt");
//             File file = new File(pathFile);

//             FileWriter fileWriter = new FileWriter(file, true);
//             fileWriter.write(data);
//             fileWriter.flush();
//             fileWriter.close();
//         }
//         catch (Exception e){
//             System.out.println("Вот исключение.");
//             e.printStackTrace();
//         }


//     }

// }

// public class Main {
//     public static void main(String[] args) {
//         int n = 8;
//         String c1 = "c1";
//         String c2 = "c2";
//         System.out.println(name2(n,c1,c2));
//     }

//     public static String name(int k, String a, String b) {
//         String[] arr = new String[k];
//         for (int i = 0; i < k; i++) {
//             arr[i] = i % 2 == 0 ? a : b;

//         }
//         return String.join("",arr);
//     }

//     public static StringBuilder name2(int k, String a, String b) {
//         StringBuilder myString = new StringBuilder();
//         for (int i = 0; i < k; i++) {
//             myString.append(i % 2 == 0 ? a : b);
//         }
//         return myString;
//     }
// }