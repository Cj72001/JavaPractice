import java.util.LinkedList;
import java.util.function.Consumer;

//There are two ways to create a thread.
//Another way to create a thread is to implement the Runnable interface
//It can be created by extending the Thread class and overriding its run() method:
public class App{


    public static void main(String[] args) throws Exception {
        
        LinkedList l = new LinkedList<Integer>();

        for(int i=1; i<=5; i++){
            l.add(i);
        }

        l.forEach(n->{
            if((Integer)n!=4){
                System.out.println(n);
            }
        });

        System.out.println("_____________________");

    //Lambda expressions can be stored in variables if the variable's type 
    //is an interface which has only one method. The lambda expression should have the
    //same number of parameters and the same return type as that method

    Consumer<Integer> m = (n) ->{System.out.println(n);};

    l.forEach(m);

//To use a lambda expression in a method, the method should have a parameter with a 
//single-method interface as its type. Calling the interface's method will run the lambda expression

StringFunction changeStr = (s -> s = "New str");
StringFunction addAsk = (s) -> s + "?";

//sending the lambda methods above as a parameter:
//but the methods will named as the name of the method of the interface
printFormatted("Hello", changeStr);
printFormatted("Hello", addAsk);
        
}

public static void printFormatted(String str, StringFunction format) {
    String result = format.run(str);
    System.out.println(result);
  }

}
