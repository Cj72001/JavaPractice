//Abstract class, it must be inherited to access to this class
abstract class Animal {
    
    private String animalName = "no_name";

    abstract void animalSound();

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

}
