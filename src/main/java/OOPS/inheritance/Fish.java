package OOPS.inheritance;

import java.awt.*;

public class Fish extends Animal{
    private int fins;
    private int grills;
    public Fish(String type, double weight, int fins, int grills){
        super(type,"small",weight);
        this.fins = fins;
        this.grills = grills;
    }
    public void moveMuscles(){
        System.out.println("Muscles moving");
    }
    public void moveBackFin(){
        System.out.println("Back fin moving");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if(speed == "fast"){
            moveBackFin();
        }
    }

    @Override
    public String toString() {
        return "Fish{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                ", fins=" + fins +
                ", grills=" + grills +
                '}';
    }
}
