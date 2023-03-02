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

    

    //InnerClass can have acces to attributes and methods of OutterClass, in this case "age"
    class SuperCat extends Animal{

        @Override
        void animalSound() {
            System.out.println("meow meow, my name is: "+getAnimalName()+" SUPER CAT!, and am "+age+" years old");
        }

        public int getAgeOfOutter(){
            return age;
        }

        public void setAgeOfOutter(int a){
            age = a;
        }

    }

    //static InnerClass doesn't have access to methods and attributes of OutterClass

    static class UglyCat extends Animal{

        private int ageUgly = 0;

        @Override
        void animalSound() {
            System.out.println("meow, iam: "+getAnimalName()+" and am not a full cat :(, my age: " + ageUgly);
        }

        public void setAgeUgly(int a){
            ageUgly = a;
        }

    }


}
