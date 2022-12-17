## 1. What is access modifier?
access modifiers are keywords that can be used to control the visibility of 
fields, methods,  and constructors in a class.

There are four access modifiers in java: public, default, protected 
and private.
* Public modifier can be accessed by everyone,everywhere. 
both within the package and outside the package.
* Default modifier can be accessed only within the same package.
if we do not specify any access modifier it will automatically
consider it as default.
* Protected modifier can be accessed  
from the subclass outside the package and class in the same package.
* Private modifier can be accessed only within the same declared class.

## Access modifiers for interfaces
interface only have public and default modifier
Nested interfaces and clasees can have all access modifiers
we cannot declare class/interface with private or protected access
modifiers.


## 2. What are non-access modifiers?
Non-access modifiers are used to control a variety of things,
such as inheritance capabilities, whether all objects of the class 
share the same member value or have their own values.
whether a method can be overridden in a subclass, etc

we cannot declare class with static, transient, synchronized
and volatile.
Class only has final and abstract non-access modifiers

* Final modifier:
final class cannot be inherited by other classes.
final method cannot be overridden.
final variables cannot be modified.

* Abstract modifier:
Data abstraction is the process of hiding certain details and showing only 
essential information to the user.
Only classes and methods can be abstract
it cannot be applied with variable, constructor, 
block and enum.
  (1).Abstract class is a restricted class that cannot be used to create objects or 
access it. it must be inherited from another class.
  (2).Abstract method can only be used in an abstract class, and it does not have a body.
The body is provided by the inherited subclass.

* Static modifier:
Using static modifier is to save the memory.
you don't need to create an instance to access static methods or variables.
objects sometimes can share some properties to save memory as well.
  (1). static variables are global variables, which means they can be shared 
among all objects in the class level and without referencing their class name.
  (2). static blocks are executed in order and once, when the class ic 
first loaded.
  (3). static method can access only static data(static variables), static 
method can be executed by just referencing the method name.
  (4). inner static class can be used by just referencing 
outer class name.
  (5). inner static method can access only static data in outer
class. 

## 3. what is an abstract variable and why do you use it?
## 4. what is overriding when compare to overloading?
method overriding happens in inherited subclass, it won't change the 
method name and parameters of the method, but the code block.
method overloading happens in the same class, it won't change the method name,
but parameters of the method and the code block.

## 5. what is hashmap, what is the difference between map and hashmap?
## 6. what is collection?
## 7. why do you use linked list?
## 8. what is iterator?
## 9. what is bad code?
## 10. what are differences between == and equals?
## 11. what are differences between String, StringBuffer, and StringBuilder?
## 12. What is JVM?
