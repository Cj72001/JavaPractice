

//There are two ways to create a thread.
//Another way to create a thread is to implement the Runnable interface
//It can be created by extending the Thread class and overriding its run() method:
public class App extends Thread{

    //Attribute that belongs to the App class:
    public static int var = 0;

    public static void main(String[] args) throws Exception {
    //Running Threads
    //If the class extends the Thread class, the thread can be run by creating 
    //an instance of the class and call its start() method

    App thread = new App();

    //This method come from Thread class
    thread.start();

    System.out.println(var);

    //All after this line is out of the thread, so to prevent 
    //concurrency problems we use isAlive() method of thread object
    //for waiting the end of the thread that is running at that moment
    while(thread.isAlive()){
        System.out.println("Waiting...");
    }

    //the thread finished
    var++;
    System.out.println(var);
        
        
}

//This method is override from "Thread" class
    @Override
    public void run() {
        System.out.println("This code is running in a thread");
        var++;
    }
    


}
