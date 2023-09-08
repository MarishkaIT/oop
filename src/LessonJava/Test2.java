package LessonJava;

public class Test2 {
    public static void main(String[] args) {

    }

}
class Human{
    private String name;
    private int age;

    public Human(){
        this("Alex", 38);
    }
    public Human(String name){
        System.out.println("Hello, from second constructor!");
        this.name = name;
    }
    public Human(String name, int age){
        System.out.println("Hello, from third constructor!");
        this.name = name;
        this.age = age;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void getInfo(){
        System.out.println(name + " " + age);
    }
}
