public class App {
    public static void main(String[] args) throws Exception {
        
        Cat normalCat = new Cat();
        normalCat.setAge(12);
        normalCat.setAnimalName("Juan Cat");
        normalCat.animalSound();


        Cat.SuperCat superCat = normalCat.new SuperCat();
        superCat.setAnimalName("Rafael");
        superCat.animalSound();
        
        //static, which means that you can access it without creating an object of the outer class
        Cat.UglyCat uglyCat = new Cat.UglyCat();
        uglyCat.setAnimalName("George");
        uglyCat.setAgeUgly(50);
        uglyCat.animalSound();

    }
}
