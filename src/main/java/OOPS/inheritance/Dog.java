package OOPS.inheritance;

public class Dog extends Animal{
    private String earShape;
    private String tailShape;

    public Dog(String type, double weight){
        this(type, weight, "Perky","Curled");
    }
    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type,
                weight < 15 ? "small" : (weight < 35 ? "medium" : "large"),
                weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    public Dog() {
        super("cute animal", "small",30);
        /**
         * super() is a way to call a constructor on the super class,
         * directly from the sub-class's constructor.
         * so super() is a lot like this()
         * super() and this() can never be called from the same constructor.
         */
    }
    private void bark(){
        System.out.println("woof");
    }
    private void run(){
        System.out.println("dog running ");
    }
    private void walk(){
        System.out.println("dog walking ");
    }
    private void wagTail(){
        System.out.println("dog wagging tail ");
    }
    public void move(String speed){
        super.move(speed);
//        System.out.println("Dogs walk, run and wag their tail");
        if(speed == "slow"){
            walk();
            wagTail();
        }else {
            run();
            bark();
        }
    }
    public void makeNoise(){
        if (type == "wolf"){
            System.out.println("ow wo wo wo wo wo wo");
        }else {
            bark();
        }
    }
    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                '}' + super.toString();
    }
}
