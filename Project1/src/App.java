import java.util.ArrayList; // import the ArrayList class
import java.util.Collections; // Import the Collections class

public class App {
    public static void main(String[] args) throws Exception {

        //Java ArrayList: elements can be added and removed from an ArrayList whenever you want.
        ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object

        System.out.println(cars.size());
        
        cars.add("Bolvo");
        cars.add("Amber");
        cars.add("Coush");

        System.out.println(cars.size());

        
        System.out.println("First way to traverse the ArrayList by a loop"); 
        for(int i=0; i<cars.size(); i++){
            System.out.println(cars.get(i));
        }

        System.out.println("Second way to traverse the ArrayList by a for-each loop"); 
        for(String c : cars){
            System.out.println(c);
        }

        System.out.println("Third way to traverse the ArrayList by a for-each lambda");
        cars.forEach(c->{
            System.out.println(c);
        });

        //Sorting the ArrayList (it can be sorted numerically or alphabetically) using the Class Collections
        Collections.sort(cars);
        System.out.println("Sorted List of Cars:");
        cars.forEach(c->{
            System.out.println(c);
        });

}
}
