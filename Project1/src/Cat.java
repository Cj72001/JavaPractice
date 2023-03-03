public class Cat implements Animal{

    private String animalName = "no_name";
    private int animalAge = 0;
    
    @Override
    public void animalSound() {
        System.out.println("meow meow i am a cat");
    }

    @Override
    public void animalName() {
        System.out.println("meow meow, my name is: "+ animalName);
    }

    

    public void setAnimalName(String n) {
        animalName = n;
    }

    public void setAge(int a) {
        animalAge = a;
    }

    public int getAge() {
        return animalAge;
    }


    

   

}
