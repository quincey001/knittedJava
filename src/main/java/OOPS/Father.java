package OOPS;

import OOPS.Car;

public class Father {
    public static void main(String[] args){
        Car car = new Car("germany","BMW","red",4,true);
//        car.color = "fdfd"; the private data cannot be accessed from another package.
        car.setColor("yellow");
        System.out.println(car.toString());

        DefaultConstructor df = new DefaultConstructor();
        float num = df.getAmount();
        System.out.println(num);
    }
}
