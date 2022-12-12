## Object-oriented Programming:

oop is one of the programming approaches, which is used for designing a 
program using classes and objects.
It is a way to model real world objects, as software objects, which contain 
both data and code.
it can also be characterized as data controlling for accessing the 
code.

oops in java is to improve code readability and reusability by 
defining java program efficiently.
The main principles of object-oriented programming are: abstraction 
, encapsulation, inheritance, and polymorphism.


## what is Object?

Object is a specific instance of a class where the object can be combined 
of data structures, functions, and variables. it has its own state
behaviour and identity.

## what is class?
A class is simply a representation of a type of object or collections of 
object.

## what is Abstraction?
It is the concept of hiding the internal details/information
and describing things in simple terms.

An abstract class is a type of class that declares one or more 
abstract methods.
An abstract method is a method that has a method definition but 
not implementation.

```java
	Class Solution{
		public boolean ContainsDuplicate(int[] nums){
			//sorting the array with an ascending order
			Arrays.sort(nums);
			// traverse the array, and compare i and i + 1 elements
			for(int i = 0; i < nums.length - 1; i++){
				if(nums[i] == nums[i + 1]){
					return true;
				}
			}
			return false;
		}

}
```

## Encapsulation
Encapsulation in object oriented programming usually has two meanings.
One is the building of behaviour and atrributes on a signle object.
The other is the practice of hiding fields, and some methods, 
from public access.

## What are getters and setters? why should we use them?
A getter is method on a class, that retrieves the value of a private 
field, and returns it.
A setter is a method on a class, that sets the value of a private 
field.

The purpose of these methods is to control, and protect, access to private fields.




