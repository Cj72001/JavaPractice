import java.util.ArrayList;
import java.util.Collections; // Import the Collections class
import java.util.HashMap;
import java.util.HashSet; // import the HashSet class
import java.util.Iterator;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {

        //Java ArrayList: elements can be added and removed from an ArrayList whenever you want.
        ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
        cars.add("Bolvo");
        cars.add("Amber");
        cars.add("Coush");
        //____________________________________________________________________________________________

        //The LinkedList stores its items in "containers." The list has a link to the first container
        //and each container has a link to the next container in the list.
        LinkedList<String> laptops = new LinkedList<String>(); 
        
        //USING LINKEDLIST METHODS TO ADD CARS IN ORDER OF COME:
        laptops.addLast("HP"); //FIRST INCOME
        laptops.addLast("DELL");
        laptops.addLast("Apple"); //LAST INCOME

        //____________________________________________________________________________________________

        //Creating a HashMap object called capitalCities that will store String keys and String values
        HashMap<String,String> capitalCities = new HashMap<String,String>(); 

        System.out.println(capitalCities.size());
        
        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        //____________________________________________________________________________________________

        // Create a HashSet object called people
        HashSet<String> people = new HashSet<String>();

        // Add String Objects (it can be Int, Char, etc)
        people.add("Omar Rafael Flores Alas");
        people.add("Omar Rafael Flores Alas"); //It will appear only one time, because it has to be unique
        people.add("Erick Alexis Flores Alas");
        people.add("Jose Omar Flores Jurado");

        //____________________________________________________________________________________________









        //CREATE AN ITERATOR FOR EACH ONE (ARRAYLIST, LINKEDLIST, HASHMAP, HASHSET)
        //ArrayList:
        Iterator i1 = cars.iterator();

        while(i1.hasNext()){
            
            String comp = (String) i1.next();

            if(comp.equals("Bolvo")){
                i1.remove();
            }
            else{
                System.out.println(comp);
            }
        }


        i1 = laptops.iterator();

        while(i1.hasNext()){
            System.out.println(i1.next());
        }

        //ITERATOR CANT BE USED FOR HASHMAP
        //WRONG -> i1 = capitalCities.iterator();

        i1 = people.iterator();

        while(i1.hasNext()){
            System.out.println(i1.next());
        }





    }
}
