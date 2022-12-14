package OOPS;

public class OOPConstructor {
    /**
     * a constructor is used in the creation of an object, that's an instance of a class.
     * it is a special type of code block that has a specific name and parameters, much like a method
     * it has the same name as the class itself, and it doesn't return any values.
     */
    private String name;
    private int age;
    private String sexual;
    public OOPConstructor(){
        this("jack", 20,"male");
        System.out.println("Constructor with empty parameters called.");
        /**
         * constructor chaining is when one constructor explicitly calls another overloaded constructor.
         * call a constructor only from another constructor.
         */
    }
    public OOPConstructor(String name, int age, String sexual) {
        this.name = name;
        this.age = age;
        this.sexual = sexual;
        System.out.println("Constructor with parameters called.");
        /**
         * you should not call a method in the constructor, because the field initialization may not be finished
         * in the constructor(or even call setter method in the constructor)
         */
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSexual() {
        return sexual;
    }

    public void setSexual(String sexual) {
        this.sexual = sexual;
    }

    @Override
    public String toString() {
        return "OOPConstructor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sexual='" + sexual + '\'' +
                '}';
    }

    public static void main(String[] args){
        OOPConstructor oopConstructor = new OOPConstructor();
        System.out.println(oopConstructor.toString());
    }
}
