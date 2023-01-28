# Java 

## 1. What is access modifier?
access modifiers are public, default, protect and private modifier, these are some keywords that used on variables, method, and class.
they define the access level of these objects.

``Public: A class, method, or variable that is declared as public can be access by anywhere and anyone.``

``Default: A class, method, or variable that does not using any keywords will be defined as default object, they can be accessed within this package.``

``Protected: A class, method, or variable that is declared as protected can be access by other class in this package and subclass outside this package.``

``Private: A class, method, or variable that is defined as private can only be access within the same declared class.``

## 2. what are non-access modifiers?

non-access modifiers are some keywords that can be used to modify the behaviour of a class, method and variable.
``Final: final class cannot be inherited by other classes``
       ``final methods cannot be overriden``
       ``final variables cannot be modified``
       
``static: using static modifier is to save the memory, you donnot need to create an instance to access static method or variables.``
       ``inner static class can be used by just referencing outer class name``
       ``inner static method can access only static data in the outer class``
       ``static method can acess only static data by just referencing their names``
       ``static blocks are executed in order and once, when the class is loaded.``
       ``static variables are global variables in the class level.``
       
``abstract: data abstraction is the process of hiding certain details and show only essential info``
       `` abstract class is a restricted class, it must be implemented/inherited by subclass. it cannot be used or access by creating an instance``
       `` abstract method can only be used by abstract class, and it does not have body code, the body is written in method of subclass.``
       
``Synchronized: it is the keyword that can used to method and blocks of code. it used to control the access and to share the source in multiple threads,
                and ensure there is only one thread access at a time.``
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

``transient: it is the keyword that used on a field in a class to indicate that this transient field will not be serialized in the class object. ``
 When an object is serialized, all of its fields are written to the stream of bytes, unless the field is marked as transient. If a field is marked as transient, its value will not be included in the stream of bytes, and it will not be restored when the object is deserialized.
       
