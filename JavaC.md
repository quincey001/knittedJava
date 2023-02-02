# 1. why do we want to use Static in java?
### Static is a keyword that used to define class, method, constructor and variables, the reason that using the static keyword is it does not need to create an instance to access static objects, so it saves lot of memory.Static inner class can be accessed by referencing the outer class's name, static method can only accessed by only static variables. static constructors will be excuted by order and only once. static variables are global variables.

# 2. what is an abstract variables and why we use it?
### Abstract is keyword that used on class and method, an abstract method must be overridden by subclass, the body code needs to provide by the overrided method in the subclass, an abstract class must be inheritated/implemented by subclass.
### The reason we using abstract in java is, if there are some common behavours in different related classes, such as shape class has a area method that was used to calculate the square of the area of this shape.
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
