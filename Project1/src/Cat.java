public class Cat extends Animal{

    private int age = 0;
    
    @Override
    void animalSound() {
        System.out.println("meow meow, my name is: "+ getAnimalName() +", and am "+ age + " years old");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    } 



}
