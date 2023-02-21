//this is an abstract class, it cannot be use for create objects,
//to acces this clas it must be inherited from another class
abstract class AbstractClass_SO {
    
    //These attributes will be inherited to the class that extends this "AbstractClass_SO" class
    public final String productName = "SO.v0.1";
    public final int productYear = 2023;
    public String SO = "no_SO";
    static String AbstractAttribute = "AA"; 


    //These methods will be inherited to the class that extends this "AbstractClass_SO" class

    //the body of this abstract method MUST BE implemented by the class that extends this class
    abstract void printSO ();

    public void messageSuperClass(){
        System.out.println("This is a method from a super class");
    }
}
