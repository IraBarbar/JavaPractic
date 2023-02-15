// Дано четное число N (>0) и символы c1 и c2. 
// Написать метод, который вернет строку длины N, 
// которая состоит из чередующихся символов c1 и c2, начиная с c1.

public class Task01 {
    public static void main(String[] args) {
        String c1 = "c1ffffff56";
        String c2 = "c21dkeTdl1";
        int n = 17;
        System.out.println(stringLengthN(n, c1, c2));
    }

    public static String stringLengthN(int n, String a, String b) {
        StringBuilder str = new StringBuilder(n);
        String myString="";

        for (int i = 0;  str.length()<n; i++) {
            str.append(i % 2 == 0 ? a : b);    
        }
        for (int i = 0; i < n; i++) {
             myString +=  str.charAt(i);
        }
        return myString;
    }
}
