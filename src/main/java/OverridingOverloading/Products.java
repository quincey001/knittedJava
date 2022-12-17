package OverridingOverloading;

public class Products {
    private int price;
    private int quantity;
    public void counting(float p){
        price = 1000;
        quantity = 4;
        float benefit = price * quantity * p;
        System.out.println(benefit);
    }
    public void counting(float p, int quantity){
        price = 1000;
        this.quantity = quantity * 3;
        float benefit = price * this.quantity * p;
        System.out.println(benefit);
    }
//    public static void main(String[] args){
//        Products p = new Products();
//        p.counting((float) 0.4);
//        p.counting((float) 0.4, 4);
//    }

}
class Pen extends Products{
    @Override
    public void counting(float p) {
        super.counting(p);
    }
}
class Main{
    public static void main(String[] args){
        Pen p = new Pen();
        p.counting((float) 0.9);
    }
}