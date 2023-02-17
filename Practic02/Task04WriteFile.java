// Напишите метод, который составит строку, состоящую из 100
// повторений слова TEST и метод, который запишет эту строку в
// простой текстовый файл, обработайте исключения.
import java.io.File;
import java.io.FileWriter;

public class Task04WriteFile {
    public static void main(String[] args) {
        String text = "TEST";
        int count = 100;
        
        System.out.println(repetition(text, count));
        writeToFile(repetition(text, count));
    }
    public static String repetition(String a,int n) {
        return a.repeat(n);
    }
    public static void writeToFile(String a) {
        try{
            //Блок для создания нового файла для записи:
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.txt");
            File fileText = new File(pathFile);
            System.out.println("File write");

            // Блок для записи файла:
            FileWriter fileWriter = new FileWriter(fileText, true);
            fileWriter.write(a);
            fileWriter.flush();
            fileWriter.close();
        }
        catch (Exception e){
            System.out.println("ERROR");
            e.printStackTrace(); // указывает, где возвозможная ошибка
        }
    }
}
