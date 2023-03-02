//Abstract class, it must be inherited to access to this class
abstract class Animal {
    
    private String animalName = "no_name";


    //abstract class can haves abstract and normal methods:
    //abstract method:
    abstract void animalSound();


    //normal methods:
    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

}
