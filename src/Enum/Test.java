package Enum;

public class Test {

    public static void main(String[] args) {
     //  Animal animal = Animal.DOG;
     //   System.out.println( animal);


       /* switch (animal){
            case CAT -> System.out.println("Its a cat");
            case DOG -> System.out.println("Its a dog");
            case FOX -> System.out.println("Its a fox");

        }

        */

        Season season = Season.SUMMER;
        System.out.println(season.getTemperature());

       /* switch (season){
            case SUMMER -> System.out.println("Its warm outside");
            case WINTER -> System.out.println("Its cold outside");
        }

       */
    }
}
