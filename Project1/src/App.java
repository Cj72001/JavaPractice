import java.util.Collections; // Import the Collections class
import java.util.HashMap; // import the HashMap class

public class App {
    public static void main(String[] args) throws Exception {

        //A HashMap however, store items in "key/value" pairs, 
        //and you can access them by an index of another type (e.g. a String).

        //Creating a HashMap object called capitalCities that will store String keys and String values
        HashMap<String,String> capitalCities = new HashMap<String,String>(); 

        System.out.println(capitalCities.size());
        
        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
        System.out.println(capitalCities.size());

        
        // Print keys (countries)
        System.out.println("countries: "+ capitalCities.keySet());

        //Loop through the items of a HashMap with a for-each loop:
        System.out.println("First way to traverse the HashMap by a loop for-each, printing keys:"); 
        for(String i: capitalCities.keySet()){
            System.out.println(i);
        }

        //Loop through the items of a HashMap with a for-each lambda.
        System.out.println("Second way to traverse the HashMap by a for-each lambda, printing keys:"); 

        capitalCities.keySet().forEach(country ->{
            System.out.println(country);
        });

        //------

        // Print values (capitals), this method can be used same as keySet()
        System.out.println("countries: "+ capitalCities.values());


        //Printing each key and its respective value
        capitalCities.keySet().forEach(c ->{
            System.out.println("The capital of: "+c+" is: "+capitalCities.get(c));
        });


        //-------------------------------------------------------------------------------------
        // Keys and values in a HashMap are actually objects. In the examples above, we used objects 
        // of type "String". Remember that a String in Java is an object (not a primitive type). To 
        // use other types, such as int, you must specify an equivalent wrapper class: Integer. For 
        // other primitive types, use: Boolean for boolean, Character for char, Double for double, etc.

        // Create a HashMap object called people
        HashMap<Integer, String> people = new HashMap<Integer, String>();


        // Add keys and values (Name, DUI)
        people.put(06200577,"Omar Rafael Flores Alas");
        people.put(05302537,"Erick Alexis Flores Alas");
        people.put(56122373,"Jose Omar Flores Jurado");

        System.out.println("People and their DUI:");
        for (Integer i : people.keySet()) {
          System.out.println("key: " + i + " value: " + people.get(i));
        }


    }
}
