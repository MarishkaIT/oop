package Exceptions3;

// Checked и Unchecked исключения.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        // Checked Exception (Compile time exception) = исключительные случае в работе программы

        File file = new File("test");
        try {
            Scanner scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Undefined file");
        }

        //Unchecked Exception (Runtime exception) = ошибка в работе программы

//        int a = 1 / 0;
//
//        String name = null;
//        name.length();
//
//        int[] arr = new int[2];
//        System.out.println(arr[2]);

    }
}
