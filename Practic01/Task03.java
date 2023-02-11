// Дан массив nums = [3,2,2,3] и число val = 3. 
// Если в массиве есть числа, равные заданному, 
// нужно перенести эти элементы в конец массива. 
// Таким образом, первые несколько (или все) 
// элементов массива должны быть отличны от заданного, а остальные - равны ему.

package Practic01;
import java.util.Arrays;

public class Task03 {
    public static void main(String[] args) {
        int[] arr = new int[] {3,2,2,1,2,3,1,3,1,3};
        int val = 3;
        int iEnd = arr.length-1;
        for (int i = 0; i < iEnd; i++) {
            if (val == arr[i] && val != arr[iEnd]){
                int temp = arr[i];
                arr[i] = arr[iEnd];
                arr[iEnd] = temp;
                iEnd --; 

            }
            if (val == arr[i] && val == arr[iEnd]){
                int temp = arr[i];
                arr[i] = arr[iEnd-1];
                arr[iEnd-1] = temp; 
                iEnd = iEnd-2;
                i --;
            }

            
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
