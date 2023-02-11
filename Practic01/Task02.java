// Дан массив двоичных чисел, например [1,1,0,1,1,1],
// вывести максимальное количество подряд идущих 1.

package Practic01;

public class Task02 {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 1, 0, 1, 1, 1,0,1};
        int Maxcount = 0;
        int num = 1;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count = count +1;
                if (count > Maxcount) {
                    Maxcount = count;
                }
            } else {
                count = 0;
            }
        }
        System.out.println(Maxcount);
    }
}
