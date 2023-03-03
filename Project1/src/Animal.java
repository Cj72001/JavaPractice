//Interface, it must be implemented to access to this class
//An interface is a completely "abstract class" that is used to group related methods with empty bodies
interface Animal {

    //~Interface attributes are by default public, static and final
    String nature = "Animal";
    
    //~Interface methods are by default abstract and public
    //Interface class can haves abstract and normal methods:
    //abstract method:
    //abstract void animalSound();


    //regular methods:

    public void animalSound();

    public void animalName();

}
