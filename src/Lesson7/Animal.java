package Lesson7;

interface AbleToEat{
    public void eat();
}



class TestDrive{
    public static void main(String[] args) {
        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Someone is eating");
            }
        };
        ableToEat.eat();



    }
      /*  Animal an = new Animal();
        an.eat();

        // Анонимный класс (может быть создан только один объект)
        Animal an2 =new Animal(){
            public void eat(){
                System.out.println("Other animals is eating...");
            }
        };
        an2.eat();

    }

       */
}
