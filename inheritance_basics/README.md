What is Inheritance?
The process of aquiring properties of a class by another class.
---------------

Without the presence of Inheritance, the and language behaves like an Object Based Language(OBL). Some examples are JavaScript, VB, Ada.
---------------

Inheritance provides us with 'Code Reusability' and this is also leads to 'Faster Development'.
---------------

'extends' keyword specifies Inheritance.
extends is used by one class to acquire the properties of another class.
In this way, the called using the extend keyword is the Child class since it inherits the properties of another class and that class is called the Parent class.
---------------

What all can be inherited by Child class from Parent class?
All non-private members from Parent Class can be inherited by Child class
---------------

Properties of Inheritance
1. Child class can define its own members
2. Child class can redefined the behaviour of Parent class methods (Polymorphism - Overriding (dynamic polymorphism))
----------------

Inheritance automatically contains Polymorphism in it in the form of Overriding.
Overriding: This is a mechnism in which the subclass (child class) redefines the behaviours of the super class (parent class) methods.
The signature must be same for overrriding
----------------

Annotations
Here, we have used @Override which is an annotation.
Even without it the program will be compiled without an error, but annotations are very useful and sometimes important.

What are Annotations?
Annotations basically used to provide/give information to the compiler or the JVM

Here, the annotation @Override tells the compiler that the following method is an Overriden method, so then the compiler checks the parent class and sees if the claim is correct then it allows
Incase the claim to overridden method is not in the parent class then an error is returned since the claim is incorrect
So what is the actaul use:
 - This helps since sometimes the overridden method can contain spelling errors and since the annotation is present an eeror will be given, otherwise if not present then the compiler will treat as anyother function

2 Kinds of Annotations
1. Annotations for Compiler
2. Annotations for JVM
----------------


'protected' keyword
This is an access modifier or a visibility specifier, that is used in Inheritance
All members of the Paremt/Super class are directly available to the Child class, since the class is partially encapsulated.
----------------


Members of the Parent class can be accessed to the Child class through
1. Incase Fully Encapsulated - then through setters and getter
2. Incase Partially Encapsulated - then directly only those members that are protected
----------------
