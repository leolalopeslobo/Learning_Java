<h1>Abstraction</h1>
Hiding the implementation/background details and exhibiting/showing the essential features.

Hence there are two components to this
1. What to do? -> Specification -> this is shown
2. How to do? -> Implementation -> this is hidden

Eg:
- Govenment specifies, L&T builds it.
- RBI specifies, SBI implements it.
Hence the UI is the same for all the banks but their functionality is different since RBI specifies it.

<h3>Abstraction is a design principle that is used to 'reduce the complexity'.</h3>
<h3>Also design principle called 'loose coupling' is achieved through abstraction.</h3>

According to Software Engineering Design Principle, we should have tight cohesion and loose coupling.
https://stackoverflow.com/questions/14000762/what-does-low-in-coupling-and-high-in-cohesion-mean

<h4>Abstraction is achieved in Java with the help of Abstract Class (AC) and Interfaces</h4>

Keywords: abstract, interface

<h4>Abstract Class: 0 - 100% abstraction -> Because it can contain both specifications and implementations<br>
Interface: 100% abstraction -> Because it contains all the specifications </h4>
Therefore the implemetations is done by classes only. Interfaces will never implement.


When we create/have classes we have data and methods and the methods are the implementaion part only. The Specifications part is for design purpose.
In order to achieve the implementation and these two can be separated.



<h2>Abstract Class</h2>
1. Any class can be made abstract.<br>
But if a class is made abstract then, it cannot be instantiated.<br>
Instantiation is the process of creating an object. -> new Class() : this is instantiation.<br>
Eg: abstract class X { <br>
    //data and behaviour <br>
 } <br>
X x = new X(); //this will give an error
<br><br>

2.A class **must** be made abstract, if it contains at least one abstract method.<br>
**Abstract Method: Methods that have no implementation; no body.** <br>
Eg: void display(); <br>
Therefore, <br>
 abstract class X{ <br>
      abstract void display(); <br>
  } <br>
  <br>
  
3.Abstract Classes cannot be instantiated.
<br><br>
4.Abstract Classes can contain concrete methods as well. That means it can contain methods with body too. <br><br>

Usually we try to balance the level of abstraction. <br><br>

5.<br>
abstract class X{ <br>
  //abstract methods <br>
  //concrete methods <br>
 } <br><br>
So how to use this class? <br>
 
This can be done by using another class through inheritance that is able to extend this class and provide the implemetation for the specification. <br>

There should exists a class that must extend abstract class and provide implementation for all the abstract methods.
<br><br>
6.If this fails to provide implementation for at least one abstract method, then it must also become abstract. <br>
abstract class X{ <br>
 //4 - abstract methods <br>
 //2 - concrete methods <br>
 } <br>
 Now is Y extends X then it should provide implementation for all the 4 abstract methods, if it provides for only 3, then it must become abstract too <br>
 abstract class Y extends X{ <br>
  // out of 4 only 3 have been implemented <br>
  } <br>
  
  OR <br>
 class Y extends X{ <br>
  // since out of 4 only all 4 have been implemented <br>
  } <br>
<br><br><br><br>

Questions:
What is loose coupling? <br>
Less dependencies. For Example: Say for ATM, SBI implements in it's own way, HDFC implements in it's own way, ICICI implements in it's own way, they are all completely different implementations and do not depend on each other. <br>
What is tight cohesion?
Why do we have interfaces when 100% abstraction is possible using Abstract Classes also?
