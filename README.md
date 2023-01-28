# knittedJava
---------This is a project for learning the basic java programming knowledge & Interview questions Practices--------------------

# Java SE (Java Standard Edition)
It is a platform for developing and deploying java applications on desktops and servers. It includes the Java Virtual Machine, Java Library(java API), and other tools for developing, debugging and monitoring java applications.

# JRE (Java Runtime Environment)
It is a subset of JSE, which includes JVM, and Java Library. It is typically used to run java application on a user's computer

# Apache Tomcat
It is an open source web server and servlet container developed by the Apache Software Fundation.
It is used to deploy and run java servlets and javaServer Pages(JSPs) on a web server.

# JSP(Java Server Pages)
It is technology that allows developers to create dynamic web pages using conbination of HTML,CSS, and java code.
JSP are compiled into java servlets, which are then executed by the web server.

# Servlets
Servlets are java classes that run on the server side and can handle client requests and generate dynamic content.

![image](https://user-images.githubusercontent.com/37968494/214590254-ea93abd2-e3c4-4d1c-b37a-513fc8cec34e.png)

# Popular MVC Frameworks that are built on top of JSP and servlet.
Spring 
JSF
Struts 


# Steps for setup Java Development Environment
## 1. install the Java Development Kit(JDK).

## 2. Required Software
### (1). Java Application Server
Tomcat server (optional)

#### ---install tomcat web server----
www.tomcat.apache.org

bin/startup.sh is the file that used to start the tomcat server.

#### ----start the tomcat service---- 
brew services start tomcat

#### ----verify the tomcat server----
localhost:8080

### (2). Java Integrated Development Environment(IDE)
Eclips IDE (optional)

----------------------------------------------------------------------------------------------------------------------------------------------------------
# 1. Compare the Student Object by name and age using Comparable and Comparator interface & Collections.sort()
### Colletions.sort() is the method that usually used to sort array and list in the java programming.
compareTo method in the Collections is defined the way how to compare the objects in a natural order.
By implementing compareTo or compare method in the Student class, you are telling Collections to sort the objects in 
multiple times, the algorithm method will use the results of compare method to determine the final order of the object
in the list.

```java 
class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.getName());
    }
}

List<Student> students = new ArrayList<>();
students.add(new Student("John", 25));
students.add(new Student("Mary", 22));
students.add(new Student("Bob", 28));

Collections.sort(students);

for (Student student : students) {
    System.out.println(student.getName() + " " + student.getAge());
}
```
```java 
class StudentAgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getAge() - s2.getAge();
    }
}

List<Student> students = new ArrayList<>();
students.add(new Student("John", 25));
students.add(new Student("Mary", 22));
students.add(new Student("Bob", 28));

Collections.sort(students, new StudentAgeComparator());

for (Student student : students) {
    System.out.println(student.getName() + " " + student.getAge());
}

```
----------------------------------------------------------------------------------------------------------------------------------------------------------
# 2. Java Interview questions.
### [Link to the directory](https://github.com/quincey001/knittedJava/blob/main/Java.md)
----------------------------------------------------------------------------------------------------------------------------------------------------------
# 3. RESTful API Interview questions.
### [Link to the directory](https://github.com/quincey001/knittedJava/blob/main/Java.md)
