import java.util.Collections; // Import the Collections class
import java.util.HashSet; // import the HashSet class

public class App {
    public static void main(String[] args) throws Exception {

        // Create a HashSet object called people
        HashSet<String> people = new HashSet<String>();


        // Add String Objects (it can be Int, Char, etc)
        people.add("Omar Rafael Flores Alas");
        people.add("Omar Rafael Flores Alas"); //It will appear only one time, because it has to be unique
        people.add("Erick Alexis Flores Alas");
        people.add("Jose Omar Flores Jurado");

        people.forEach(p->{
            System.out.println(p);
        });

        String deleteP = "Erick Alexis Flores Alas";
        String newP = "Dolores Siomara Alas de Flores";

        if(people.contains(deleteP)){
            people.remove(deleteP);
            people.add(newP);
        }

        System.out.println("Lista Actualizada:");
        people.forEach(p->{
            System.out.println(p);
        });

    }
}
