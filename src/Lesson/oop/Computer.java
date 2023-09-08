package Lesson.oop;

public class Computer {
    private Ram ram;     //это композиция, класс Computer зависит от класса Ram(включает его в себя в виде полей)
    private Ssd ssd;
    public Computer(Ram ram, Ssd ssd) {
        this.ram = ram;
        this.ssd = ssd;
    }
    public void  printState(){
        System.out.println("Computer: ram " + ram.getValue() + ", ssd " + ssd.getValue());
    }
}
