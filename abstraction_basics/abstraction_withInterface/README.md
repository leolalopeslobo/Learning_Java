Abstraction done using **Interface**


**interface** is a keyword.
Anything that starts with interface word is an interface.
What is an Inteface?
It is a reference type just like a class

In Java API, we have intefaces that are usually like adjectives names like Cloneable, Serializable and Runnable

Eg: interface X{ <br>
  //abstract methods
  //contants
  //nested types (AIC - Anonymous Inner Classes)
  
  int x = 10; //By default, it is -> public final static int x = 10;
  void fun(); //By default, it is -> public abstract void fun();
  //Therefore you have to specify public, final and all, its understood.
} <br>

You cannot use abstract and final for intefaces. Generally intefaces are public since they have to be implemented by somebody else.


What do Interfaces contain?
They contain all abstract methods, and data that are constant is allowed. All the members of an interface are public members by default


1. All data members have to be contant
2. All members are public by default
3. Intefaces cannot be instantiated
4. There should exists a class that **implements** interface.
All the methods must be provided with implementations
5. If the class fails to implement any of the methods then it should become abstract.

<br>
class Y implements X{ <br>
 // <br>
 }
if the class fails to provide implemetation for all (any one of) the methods then, it must become abstract
<b>
This is relationship between class Y and inteface X is called 'Realization' Relationship and also it is between two different components.


<br><br>
- Interfaces will extend each other
- Multiple Inheritance is possible with inheritance
