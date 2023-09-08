package Interface;

public class TestDrive {
    public static void main(String[] args) {
        Info info1 = new Animal(1);
        Info info2 = new Person("Tom");
        info1.showInfo();
        info2.showInfo();
    }

}
