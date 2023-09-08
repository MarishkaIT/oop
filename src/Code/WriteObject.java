package Code;

// Сериализация

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person[] people = {new Person(1, "Kris"), new Person(2,"Alex"), new Person(3, "Tom")};

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))){

            oos.writeObject(people);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
