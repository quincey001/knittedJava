package MultiThreading;

public class Computing {
    private int count = 0;
    public synchronized int increment(){
        count++;
        return count;
    }
    public int getCount(){
        return count;
    }
    public static void main(String[] args){
        Computing computing = new Computing();
        System.out.println(computing.increment());
//        System.out.println(computing.getCount());
    }
}
