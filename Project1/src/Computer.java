import java.lang.reflect.Constructor;

import javax.swing.AbstractAction;

//this is a final class because it cannot be inherited by other class
final class Computer extends AbstractClass_SO{

    //Attributes of the Computer class (these always should be initialized)
    //We'll use encapsulation (private attributes, public methods setters and getters)
    final private String product = "PC";
    private int price = 0;
    private String brand = "no_brand";

    
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

    //Getters and Setters
    public String getProduct() {
        return product;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    

    
     

    
}


