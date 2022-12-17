package StaticKeyword;

public class StaticMethodDemo {
    private int TOTAL = 1000;
    private static int NUMBER = 100;
    public int deducting(){
        return TOTAL - NUMBER;
    }
    public void result(){
        // non-static method can access non-static method
        // but not static method
        int result = deducting();
        System.out.println(result);
    }
    public static void counting(){
        int result = NUMBER;
        System.out.println("result from static method " + result);
    }
    public static void main(String[] args){
        //access the static method without referencing an instance.
        counting();
    }
}
