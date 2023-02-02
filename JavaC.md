# 1. Why do we want to use static in Java??
### Static is a keyword that is used to define classes, methods, constructors, and variables. The reason for using the static keyword is that it does not need to create an instance to access static objects, so it saves a lot of memory. Static inner classes can be accessed by referencing the outer class's name; the static method can only be accessed by static variables. Static constructors will be executed by order and only once. Static variables are global variables.
# 2. what is an abstract variables and why we use it?
### Abstract is a keyword that is used on class and method names; an abstract method must be overridden by the subclass, the body code needs to be provided by the overridden method in the subclass, and an abstract class must be inherited or implemented by the subclass.
### The reason we use abstract in Java is if there are some common behaviors in different related classes, such as a shape class that has an area method that is used to calculate the square of the area of this shape.
### Circle and ractangle also have the method area that can be used to get the area of these shapes.
### So the abstract provides a way to enforce consistency and encourage modularity in the code.
```java
abstract class Shape {
  abstract double area();
}

class Rectangle extends Shape {
  double length;
  double width;
  
  Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }
  
  @Override
  double area() {
    return length * width;
  }
}

class Circle extends Shape {
  double radius;
  
  Circle(double radius) {
    this.radius = radius;
  }
  
  @Override
  double area() {
    return Math.PI * radius * radius;
  }
}
```
