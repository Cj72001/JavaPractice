import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Java File Handling
// The File class from the java.io package, allows us to work with files.

// To use the File class, create an object of the class, and specify the filename or directory name:

public class App{


    public static void main(String[] args) throws Exception {
      

      // In the following example, we use the Scanner class to read the contents of the text file we created in the previous chapter
          try {

            File myObj = new File("java files\\filename.txt");

            //The "myReader" Scanner object is created with the file "myObj" as a parameter
            Scanner myReader = new Scanner(myObj);

            //So the Scanner object "myReader" has the Scanner methods as "hasNextLine()"
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              System.out.println(data);
            }

            myReader.close();
            
          } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }


          System.out.println("______________________________________________");
          //As we said, myReader has the Scanner methods as next ones:

          File myObj = new File("java files\\filename.txt");
          if(myObj.exists()){
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable: " + myObj.canRead());
            System.out.println("File size in bytes: " + myObj.length());
          }
          else{
            System.out.println("The file does not exist");
          }
            

        
}
}
