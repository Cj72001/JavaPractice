public class App {
    public static void main(String[] args) throws Exception {
        
        //Attributes of a interface are public and static by default
        System.out.println("The nature of the next living being is: "+ Animal.nature);
        Cat normalCat = new Cat();

        normalCat.setAge(12);
        normalCat.setAnimalName("Juan");

        normalCat.animalSound();
        normalCat.animalName();

        

    }
}
