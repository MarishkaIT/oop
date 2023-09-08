package LessonJava;

public class Test1 {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        person1.setName("Kristian");
        person1.setAge(38);
        person1.speak();
        System.out.println(person1.getName());
        System.out.println(person1.getAge());






    }
}

class Person{
    private String name;
    private int age;

    public void setName(String use){
       if (use.isEmpty()){
            System.out.println("Error");
        }else {
           name = use;
       }
    }

    public String getName(){
        return name;
    }

    public void setAge(int useAge){
        if (useAge < 0){
            System.out.println("Error");
        }else {
            age = useAge;
        }
    }

    public int getAge(){
        return  age;
    }


    int calculeteYars(){
        int years = 65 - age;
        return years;
    }

    void speak(){

        System.out.println("My name is "+ name + ", my age " + age);
    }

    void sayHello(){
        System.out.println("Hello!");
    }
}
