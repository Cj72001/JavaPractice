public class App {
    public static void main(String[] args) throws Exception {
        
        //instantiating Computer class (creating an object of that class)
        Computer c1 = new Computer(); //c1 (computadora1)

        //printing the attributes that c1 has from the Computadora class using getters 
        System.out.println(c1.getPrice()+", "+c1.getBrand());

        //setting values for c1 attributes
        c1.setPrice(100);
        c1.setBrand("DELL");

        System.out.println(c1.getProduct()+", $"+c1.getPrice()+", "+c1.getBrand());


    }
}
