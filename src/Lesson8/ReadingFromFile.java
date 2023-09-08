package Lesson8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {

        String separator = File.separator;
        String path = separator + "C:" +separator +"Users" + separator + "Admin" + separator + "Desktop" + separator + "test";

        File file = new File(path);

        Scanner scan = new Scanner(file);
        String  line = scan.nextLine();
        String[] numbers = line.split(" ");     //числа типа String
        int[] num = new int[3];
        int counter = 0;
        for (String number : numbers){
           num[counter++] = Integer.parseInt(number);     // преобразовуем строки в примитивный типы int
        }

        System.out.println(Arrays.toString(num));

        scan.close();      // закрываем метод
    }

}
