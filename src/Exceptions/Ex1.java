package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
       /* File file = new File("sayds");
        try {
            Scanner scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println(" File undefined");
        }
        System.out.println("Go to code");*/

        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Обработка исключения в методе main");
        }

    }



    public static void readFile() throws FileNotFoundException {
        File file = new File("test");
        Scanner scan = new Scanner(file);
    }
}
