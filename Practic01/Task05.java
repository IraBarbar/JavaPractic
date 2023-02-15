import java.util.Arrays;

// Во фразе "Добро пожаловать на курс по Java" переставить слова
// в обратном порядке.

public class Task05 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String text = "Добро пожаловать на курс по Java";
        String reversText ="";
        String[] arrText = text.split(" "); 
        for (int i = arrText.length-1; i >=0; i--) {
            reversText +=arrText[i]+ " ";
        }
        System.out.println(reversText); 
        
    }
}
