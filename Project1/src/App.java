import java.util.Collections; // Import the Collections class
import java.util.LinkedList; // import the LinkedList class

public class App {
    public static void main(String[] args) throws Exception {

        //The LinkedList stores its items in "containers." The list has a link to the first container
        //and each container has a link to the next container in the list.
        LinkedList<String> cars = new LinkedList<String>(); 

        System.out.println(cars.size());
        
        //USING LINKEDLIST METHODS TO ADD CARS IN ORDER OF COME:
        cars.addLast("Bolvo"); //FIRST INCOME
        cars.addLast("Amber");
        cars.addLast("Coush"); //LAST INCOME

        System.out.println(cars.size());

        
        System.out.println("First way to traverse the LinkedList by a loop"); 
        for(int i=0; i<cars.size(); i++){
            System.out.println(cars.get(i));
        }

        System.out.println("Second way to traverse the LinkedList by a for-each loop"); 
        for(String c : cars){
            System.out.println(c);
        }

        System.out.println("Third way to traverse the LinkedList by a for-each lambda");
        cars.forEach(c->{
            System.out.println(c);
        });

        //Sorting the LinkedList (it can be sorted numerically or alphabetically) using the Class Collections
        Collections.sort(cars);
        System.out.println("Sorted List of Cars:");
        cars.forEach(c->{
            System.out.println(c);
        });

        

}
}
