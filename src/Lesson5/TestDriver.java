package Lesson5;

public class TestDriver {
    public static void main(String[] args) {

        Dog dog = new Dog();
        //Upcasting - Восходящее преобразование (всегда безопасно)
        Animal an1 = dog;

        //Downcasting - Нисходящее преобразование (не всегда безопасно)
        Dog dog1 = (Dog) an1;
        dog1.bark();




    }


}
