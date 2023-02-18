package Interface;

public interface Drawable {
    public String NAME = "jerry";
    public void drawing();
    static String getString(){
        return NAME;
    }
}
class Rectangle implements Drawable{
    @Override
    public void drawing() {
        System.out.println(NAME + " Drawing a rectangle.");
    }
}
class Circle implements Drawable{
    @Override
    public void drawing() {
        System.out.println(NAME + " Drawing a circle.");
    }

}
class Main{
    public static void main(String[] args) {
        Drawable d  = new Rectangle();
        d.drawing();
        Drawable a = new Circle();
        a.drawing();
    }
}
