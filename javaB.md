# 1.what are differences between == and equals()?
There are some primitive datatypes such as boolean, byte, short, int, long, float, double, char. and some referece datatypes such as Strings, Arrays, Objects.
== is used to compare the value of primitive datatypes, and compere the address of reference datatypes.
equals is used to compare the content of objects.

# 2. What are Collections in java?
java.util.Collections is a frameword that has build-in classes and interfaces, which provides some ready-made architectures to store, manage, manipulate a large number of objects.
it implemented some structure such as list, set, map, stack, queue.

#### (1)List: A list is an order-based and index based collection of elements that can contain duplicates. List implementations include ArrayList and LinkedList.
#### (2)Set: A set is a collection of unique elelments. Examples of Set implementations include HashSet and TreeSet.
#### (3)Map: A map is a collection of key-value pairs. Example of Map implementations include HashMap and TreeMap.
#### (4)Queue: A queue is a collection that follows the First-In-First-Out order. Examples of queue implementations include LinkedList and PriorityQueue.
#### (5)Deque: A deque(Double Ended Queue) is a collection that can be added or removed from both ends. Implementations include LinkedList and ArrayDeque.
#### (6)Stack: A stack is a collection that follows Last-In-First-Out order. example of stack implementations include ArrayDeque and LinkedList.

# Why do we need to use LinkedList?

LinkedList has a dynamic size, and allows you to insert or delete elements at any position in constant time.
It does not require extra ememory to store the size information.

Disadvantages: slower access time for elements not at the head of the list.require additional memory for the links between nodes.

