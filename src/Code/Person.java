package Code;

import java.io.Serial;
import java.io.Serializable;

public class Person  implements Serializable {
    @Serial
    private static final long serialVersionUID = 4099740745910878332L;
    private int id;
    private String name;




    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return id + " : " + name;
    }
}
