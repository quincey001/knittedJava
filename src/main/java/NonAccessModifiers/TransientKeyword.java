package NonAccessModifiers;

public class TransientKeyword {

}

/**
 * In this example, the age field is marked as transient, which means that it will not be
 * included when the Person object is serialized. If the object is written to a file or
 * sent over a network, the age field will not be included.
 */
class Person {
    private String name;
    private transient int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
