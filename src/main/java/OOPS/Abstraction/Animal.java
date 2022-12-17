package OOPS.Abstraction;

abstract class Animal {
    //abstract method does not have a body
    public abstract String animalSound();
    //regular method
    public void sleep(){
        System.out.println("Sleeping ZZzzzz");
    }
    public static void main(String[] args){
        //'Animal' is abstract; cannot be instantiated
//        Animal animal = new Animal();
    }
}
class Pig extends Animal{
    public String animalSound(){
        return "the pig says: wee wee wee";
    }
}
class main{
    public static void main(String[] args){
        Pig mypig = new Pig();
        System.out.println(mypig.animalSound());
        mypig.sleep();
    }
}