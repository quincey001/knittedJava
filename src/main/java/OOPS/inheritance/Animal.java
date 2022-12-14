package OOPS.inheritance;

public class Animal {
    /**
     * it is a way to organize classes into a parent-child hierarchy,
     * which lets the child inherit /reuse fields and methods from its parent.
     *
     */
    protected String type;
    protected String size;
    protected double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void move(String speed){
        System.out.println(type + " moves " + speed);
    }
    public void makeNoise(){
        System.out.println(type + " makes some kind of moise" );
    }
}
