package OOPS;

public class OOPConstructor {
    /**
     * In a class, the constructor is a special method that is called when an instance of the class is created
     * it is used to initialize the instance variables of the object.
     *
     * if a class does not define a constructor, then a default constructor is provided by the compiler.
     * the default constructor simply creates an instance of the object with the default values for its instance
     * variables.
     *
     * Scenarios that you want to use constructor:
     * (1) you want to set initial values for the instance variables of your object that are different
     * from default values.
     * (2) you want to perform some initialization tasks when an object is created, such as setting up
     * connections to a database or registering an object with some external service.
     * (3) you want to enforce(强制执行) some invariants(不变量) on the state of your object, such as
     * making sure that an object is always in a valid state. such as you want to write a class that represents
     * a user in your application, and you want to make sure that each user has a unique user ID and
     * a valid email address.
     *
     *
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
