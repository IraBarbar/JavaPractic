package Practic01;

import java.util.Scanner;
import java.text.Format;
import java.time.LocalDateTime;


public class Task01 {

    public static void main(String[] args) {
        
        System.out.println("Привет!");

        Scanner iScanner =  new Scanner(System.in);
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s", name);
        iScanner.close();
        System.out.println();
        
        var time = LocalDateTime.now();
        System.out.printf("Time, %s", time);
        
    }
}