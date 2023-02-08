package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflections {
    private final String name;
    private int age;

    public Reflections(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void meow(){
        System.out.println("meow");
    }
    private void heyPrivate(){
        System.out.println("this is a private method");
    }
    public static void thisIsAPublicStaticMethod(){
        System.out.println("I am a public and static method");
    }
    private static void thisIsAPrivateStaticMethod(){
        System.out.println("I am a private and static method");
    }
}
class ShowDemo{
    public static void main (String[] args) throws Exception{
        // normally if we want to set the age field in created Reflections class,
        // we can just create an instance to Reflection
        Reflections reflections = new Reflections("stella",30);
        System.out.println(reflections.getName() + " " + reflections.getAge());// stella 30
        Field[] fields = reflections.getClass().getDeclaredFields();

        //if we want to change the name as john and age as 40
        // reflections.setName ?? because the name field is final variable, it cannot be changed.
        for (Field field : fields){
            if(field.getName().equals("name")){
                field.setAccessible(true);
                field.set(reflections, "jimmy");
            }
        }
        System.out.println(reflections.getName() + " " + reflections.getAge());// jimmy 30

        //invoke method using reflection
        Method myMeow = reflections.getClass().getDeclaredMethod("meow");
        myMeow.invoke(reflections);//meow

        Method myPrivate = reflections.getClass().getDeclaredMethod("heyPrivate");
        myPrivate.setAccessible(true);
        myPrivate.invoke(reflections);//this is a private method

        Method staticMethod = reflections.getClass().getDeclaredMethod("thisIsAPrivateStaticMethod");
        staticMethod.setAccessible(true);
        staticMethod.invoke(null);//I am a private and static method

//        Method[] m = reflections.getClass().getDeclaredMethods();
//        for (Method method : m){
//            System.out.println(method.getName());
//        }

    }
}
class ShowAnotherDemo{
    public static void main(String[] args) throws Exception {
        //if we do not know which class object we need to instantiate, and we want to use reflection mechanism
        // to search the exists class objects in jvm
        Reflections reflections = new Reflections("john", 40);

        Class c = Class.forName("Reflection.Reflections");
        Method setAge = c.getMethod("setAge", int.class);
        setAge.invoke(reflections,59);
        System.out.println(reflections.getAge());//59

        Field myName = c.getDeclaredField("name");
        myName.setAccessible(true);
        myName.set(reflections, "jimmy");
        System.out.println(reflections.getName());//jimmy
    }
}