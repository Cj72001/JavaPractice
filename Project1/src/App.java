public class App {
    public static void main(String[] args) throws Exception {
        
        //Printing a mesage
        System.out.println("Hello, World!");

        //initializing a string var with "Hola"
        String a = "Hola";
        System.out.println(a);

        //instantiating Saludar class (creating an object of that class)
        Computer c1 = new Computer(); //c1 (computadora1)

        //printing the attributes that c1 inherited from the Computadora class
        System.out.println(c1.price+", "+c1.brand+", "+c1.os);

        //setting values for c1 attributes
        c1.price = 100;
        c1.brand = "DELL";
        c1.os = "Windows 10";

        System.out.println(c1.product+", $"+c1.price+", "+c1.brand+", "+c1.os);

        //Static method of "Computer" Class, it can be accesed without an object of the class
        Computer.sayHi();

        //Using methods of c1
        c1.turnOnPC();
        c1.turnOffPC();

        //creating other Computer object, initializating with the constructor of the class
        Computer c2 = new Computer(1200, "Apple", "Mac os");
        System.out.println(c2.product+", $"+c2.price+", "+c2.brand+", "+c2.os);

    }
}
