# Java 

# 1. What is access modifier?
### access modifiers** are public, default, protect and private modifier, these are some keywords that used on variables, method, and class.they define the access level of these objects.

### Public: <br>
``A class, method, or variable that is declared as public can be access by anywhere and anyone.``<br>

### Default: <br>
``A class, method, or variable that does not using any keywords will be defined as default object, they can be accessed within this package.``<br>

### Protected:<br>
``A class, method, or variable that is declared as protected can be access by other class in this package and subclass outside this package.``<br>

### Private: <br>
``A class, method, or variable that is defined as private can only be access within the same declared class.``<br>

# 2. what are non-access modifiers?

### non-access modifiers are some keywords that can be used to modify the behaviour of a class, method and variable.<br>

### Final: final class cannot be inherited by other classes <br>
       ``final methods cannot be overriden``<br>
       ``final variables cannot be modified``<br>
       
### static: using static modifier is to save the memory, you donnot need to create an instance to access static method or variables.<br>
       ``inner static class can be used by just referencing outer class name``<br>
       ``inner static method can access only static data in the outer class``<br>
       ``static method can acess only static data by just referencing their names``<br>
       ``static blocks are executed in order and once, when the class is loaded.``<br>
       ``static variables are global variables in the class level.``<br>
       
### abstract: data abstraction is the process of hiding certain details and show only essential info <br>
       `` abstract class is a restricted class, it must be implemented/inherited by subclass. it cannot be used or access by creating an instance``<br>
       `` abstract method can only be used by abstract class, and it does not have body code, the body is written in method of subclass.``<br>
       
### Synchronized: it is the keyword that can used to method and blocks of code. it used to control the access and to share the source in multiple threads,and ensure there is only one thread access at a time.``<br>
If two threads try to call the increment() method at the same time, one thread will acquire the lock on the Counter object, and the other thread will be blocked until the first thread releases the lock.
```java
Class Counter{
  private int count = 0;
  public synchronized void increment(){
    count++;
  }
  public int getCount(){
    return count;
  }
}
```

### transient: it is the keyword that used on a field in a class to indicate that this transient field will not be serialized in the class object. ``<br>
 When an object is serialized, all of its fields are written to the stream of bytes, unless the field is marked as transient. If a field is marked as transient, its value will not be included in the stream of bytes, and it will not be restored when the object is deserialized.``

### volatile: it only guarantees the visibility of variables among different threads, not the consistency of the data. a variable's value may be modified by multiple threads.

----------------------------------------------------------------------------------------------------------------------------------------------------------
# 3.  what is overriding when compare to overloading?
### overriding: 
## it happens in subclass override the methods in the superclass, The overriding method must have the same name, return type, and parameters as the overridden method.

### overloading:
## it hapends in the same class, the overloading method has the same name, return type but different parameters with the overloaded method.

 
