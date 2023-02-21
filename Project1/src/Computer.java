import java.lang.reflect.Constructor;

import javax.swing.AbstractAction;

//this is a final class because it cannot be inherited by other class
final class Computer extends AbstractClass_SO{

    //Attributes of the Computer class (these always should be initialized)
    final String product = "PC";
    int price = 0;
    String brand = "no_brand";

    
    //The constructor is a special method of the class, it initializes the objects in the other classes.
    public Computer(int p, String brand) {
        price = p;
        this.brand = brand;
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


    //This method must be implemented, because is an abstract method of the super class
    @Override
    void printSO() {
        System.out.println(SO);
    }

    
     

    
}


