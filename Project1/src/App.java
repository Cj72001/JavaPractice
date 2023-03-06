import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
        //The try statement allows you to define a block of code to be tested for errors while it is being executed.
        //The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
        

        //This will generate an error, because myNumbers[10] does not exist.
        //if an error occurs, we can use try...catch to catch the error and execute some code to handle it
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
          } catch (Exception e) {
            System.out.println("Array not found");
          }

        
        //The finally statement lets you execute code, after try...catch, regardless of the result
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int n2 = sc.nextInt();

        int res = 0;
        
        try {

            res = n1/n2;

          } catch (Exception e) {

            System.out.println("Something were wrong: "+e);
            System.out.println("we going to use the same first number...");
            res = n1/n1;
            
          } finally {
            System.out.println("The result is: "+res);
          }



          //The throw statement allows you to create a custom error
          checkAge(15); // Set age to 15 (which is below 18...)


    }

    static void checkAge(int age) {
        if (age < 18) {
          throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else {
          System.out.println("Access granted - You are old enough!");
        }
      }
}
