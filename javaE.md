# what are differences between string, stringbuffer, stringbuilder in java ?

String objects are unchageable object in java, if you change a string, it will create another string object

A StringBuffer object is mutable in java, it is used to change and modify string objects.
(1) the disadvantage is that all public methods for StringBuffer are synchronized, so you can use StringBuffer with multiple threads without any problems
(2) StringBuffer provides thread safety but at a performance cost.

A StringBuilder object is similar as StringBuffer
(1) it is changeable except thread safety, which means the public methods in StringBuilder are not synchronized.
(2) it has better performance than the StringBuffer.
(3) When you need a modifiable string and only one thread is accessing, you can use StringBuilder.

