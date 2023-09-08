package Lessons;

public class MathRendom {
    public static void main(String[] args) {
   //     double a = Math.random();   //генерирует числа от 0 до 1(не включительно)
   //     System.out.println(a);

   //     double a = Math.random()*3;  //генерирует числа от 0 до 3(не включительно)
   //     System.out.println(a);

   //     double a = Math.random()+2;    // получить число с плавающей точкой в интервале [ 2; 3) (3 исключительно)

   //     System.out.println(a);

   //     double a = 20 + Math.random() * 40;  // генерирует от 20 до 60

   //     int a = (int)(Math.random()*(200 + 1)) - 100; // Целочисленное значение в интервале [ -100; +100](100 включительно

        int a = (int)(Math.random()*(1 + 1)) + 1; //Целочисленное значение в интервале [ 1; 2] (2 включительно):

        System.out.println(a);
    }
}
