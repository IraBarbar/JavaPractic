// Задание №0
// Даны следующие строки, cравнить их с помощью == и
// метода equals() класса Object
// String s1 = "hello";
// String s2 = "hello";
// String s3 = s1;
// String s4 = "h" + "e" + "l" + "l" + "o";
// String s5 = new String("hello");
// String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

package Practic03;

import java.util.ArrayList;
import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        ArrayList<String> arrList = new ArrayList<> (Arrays.asList(s1, s2, s3, s4, s5, s6));
        for (int i = 0; i < arrList.size()-1; i++) {
            for (int j = 1; j < arrList.size(); j++) {
                System.out.printf("%d  %s инквивалентно %d %s : %b\n" , i+1,
                arrList.get(i),j+1, arrList.get(j), arrList.get(i).equalsIgnoreCase(arrList.get(j))  );
                System.out.printf("%d %s == %d %s : %b\n" , i+1,
                arrList.get(i),j+1, arrList.get(j), arrList.get(i)==(arrList.get(j))  );
                System.out.println();
            }

        } 
            
        

    }
}
