import java.lang.reflect.Constructor;

import javax.swing.AbstractAction;

public class Computer {

    //Attributes of the Computer class (these always should be initialized)
    final String product = "PC";
    int price = 0;
    String brand = "no_brand";
    String os = "no_os";

    
    //The constructor is a special method of the class, it initializes the objects in the other classes.
    public Computer(int p, String brand, String os) {
        price = p;
        this.brand = brand;
        this.os = os;
    }

    //This is a constructor too, but the difference is that it doesn't initializes the object
    //It allows to create an object and initialize it after create it
    public Computer() {
    }

    //Method that it can be accesed without creating an object of this class ( by Static modifier)
    static void sayHi() {
        System.out.println("Hi");
    }

    public void turnOnPC() {
        System.out.println("Turning on the PC...");
        System.out.println("PC is on!");
    }

    public void turnOffPC() {
        System.out.println("Turning off the PC");
        System.out.println("PC is off!");
    }
    
}


