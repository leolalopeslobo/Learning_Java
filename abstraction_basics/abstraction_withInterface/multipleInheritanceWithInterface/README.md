<h2>Multiple Inheritance with Interfaces</h2>

In Java, it is not possible to have multiple inheritance using classes. Why? https://www.javatpoint.com/what-is-diamond-problem-in-java
Since this leads to a **Diamond Problem** <br>
A   &nbsp;&nbsp;&nbsp;&nbsp;  B <br>
&nbsp;&nbsp;&nbsp;    C <br>
This is multiple inheritance

In Java, multiple classes cannot be extended.
So what exactly happens, <br><br>

Say A extends Objects and B extends Object and C extends A, B <br>
 &nbsp;&nbsp; Object <br>
 A   &nbsp;&nbsp;&nbsp;&nbsp; B <br>
  &nbsp;&nbsp; C   <br>
  
  So in the way A and B both inherit the 11 members from the Object class. Now C since it extends both A and B, inherits their methods and in total it inherits duplicates and duplicates are not allowed in Java
  Since the above forms a diamond it is called the diamond problem.
  Hence inheritance is not allowed in Java, since at the Object class will always be present.
  
  
  So inorder to allow multiple inheritance in Java, we can do so with the use of interfaces that can be implemennted by a class. Also a class can implement multiple intefaces. <br>
  Eg: class A implements B, C, D{ <br>
   // code <br>
   }
   
   
   A interface that contains only one method is called a **'Functional Interface'**
   There is an Annotation called **@FunctionalInterface**
