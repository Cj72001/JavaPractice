import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;

// Java File Handling
// The File class from the java.io package, allows us to work with files.

// To use the File class, create an object of the class, and specify the filename or directory name:

public class App{


    public static void main(String[] args) throws Exception {

        //-To create a file in a specific directory: 
        //File myObj = new File("C:\\Users\\MyName\\filename.txt");

        //-To create a file in a specific directory of this project:
        //File myObj = new File("Directory\\filename.txt");

        String filePath = "java files\\filename.txt";

        try { 
            //Creating a file in an specific directory of this project, in this case "java files"
            File myObj = new File(filePath);

            if (myObj.createNewFile()) {
              System.out.println("File created: " + myObj.getName());
            } else {
              System.out.println("File already exists.");
            }

          } catch (Exception e) {

            System.out.println("An error occurred.");
            e.printStackTrace();
          }


        //   In the following example, we use the FileWriter class together with its write() method
        //   to write some text to the file we created in the example above. Note that when you are
        //   done writing to the file, you should close it with the close() method

          try {
            FileWriter myWriter = new FileWriter("java files\\filename.txt");

            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();

            System.out.println("Successfully wrote to the file.");

          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }

        
}
}
