package Lessons10;

// Вложенные классы

public class Electrocar {
    private int id;

    private class Motor{                  // вложенный нестатический класс(нужен тогда, когда объект класса сложный,
                                          // комплексный  и его можно разделить на несколько подобъектов)
        public void startMotor(){
            System.out.println("Motor is starting...");
        }
    }

    public static class Battery{         // вложенный статический класс
        public void charge(){
            System.out.println("Battery is charging...");
        }
    }

    public Electrocar(int id) {
        this.id = id;
    }
    public void start(){
        Motor motor = new Motor();
        motor.startMotor();
        final int x = 1;     // можно использовать только константы

        class SomeClass{                   //вложенный класс внутри метода
            public void someMethod(){
                System.out.println(x);
                System.out.println(id);
            }
        }

        SomeClass someObject = new SomeClass();
        test(someObject);

        System.out.println("Electrocar "+ id + "is starting...");
    }

    private void test(Object object){

    }
}
