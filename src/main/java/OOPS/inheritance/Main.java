package OOPS.inheritance;

public class Main {
    public static void main(String[] args){
        Animal animal = new Animal("generic animal", "huge",200);
        doSomething(animal, "fast");

        Dog dog = new Dog();
        doSomething(dog, "fast");

        Dog yorkie = new Dog("Yorkie", 45);
        doSomething(yorkie, "fast");

        yorkie.move("fast");

        Dog wolf = new Dog("wolf",40);
        doSomething(wolf,"slow");

        Fish fish = new Fish("goldfish",2, 4, 4);
        doSomething(fish, "fast");
        /**
         * polymorphism simply means many forms, such as animal has forms of fish and dogs.
         * it makes the code simpler, we can use the base class or super class
         * it encourages the code extensibility.
         *
         */
    }
    public static void doSomething(Animal animal, String speed){
        animal.move(speed);
        animal.makeNoise();
        System.out.println(animal.toString());
        System.out.println("-------------");
    }
}
