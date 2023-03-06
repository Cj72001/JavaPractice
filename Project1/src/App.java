

public class App {
    public static void main(String[] args) throws Exception {
    
        //Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.

        //Using primitive data types:
        int n1 = 764;

        //Using primitive data types as objects, by Warapper classes:
        Integer n2 = 229;



        System.out.println("As numbers: "+n1+", "+n2);
        System.out.println("As numbers n1 + n2: "+ (n1+n2));


        String n1Str = String.valueOf(n1);
        String n2Str = n2.toString();

        System.out.println("As strings: "+n1Str+", "+n2Str);


        //Printing each number of full number of n1 ^ n2:

        int n3 = 0;

        for(int i =0; i<n1Str.length(); i++){
            n3 = Character.getNumericValue(n1Str.charAt(i));
            System.out.println(n3);
        }

        System.out.println("--------");

        for(int i =0; i<n2Str.length(); i++){
            n3 = Character.getNumericValue(n2Str.charAt(i));
            System.out.println(n3);
        }

    }
}
