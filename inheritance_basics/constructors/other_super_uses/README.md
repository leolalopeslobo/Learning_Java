The 'super' keyword can be used to directly access parent class methods
Syntax:
  super.(method_name());


The 'super' keyword can be used to directly access parent class variables
Syntax:
  super.(variable_name);



Very Important property about Inheritance
'The objects of Child Class are specialized objects of Parent Class'
By this, Parents can refer to Child objects
This means, suppose A is Parent Class and B is Child Class, then,
  A a = new B(); //here Parent A is referring to Child object B
  
 OR
 
 A a = new A();
 B b = new B();
 a = b; //now a is referring to b
 
When parents refer to their child class objects then this is called 'UPCASTING'

Remember, child specific members cannot be called by the parent reference. Since the reference type is parent and all parent members are available to child through inheritance, but child members are not available to parent.


Upcasting + Overriding = deadly combo = 'Runtime Polymorphism'
Runtime Polymorphism means the 'Binding' is going to happen at the runtime.
Binding is linking method calls to method codes.

Runtime Polumorphism or Dynamic Method Dispatch
If a parent refrence refers to a child object then this is Upcasting (For Eg.: A a = new B();). Now say suppose you have called an overridden method (say getEmployee();) that means this method is present in both parent as well as child. Then if you say a.getEmployee(); the compiler gets confused while doing the binding since it's present in the parent as well as the child and usuallly compiler goes with the reference. But in the case there is a confusion/ambiguity since it's present in both parent and child. Hence the JVM comes in play and tells the compiler not to make the binding rather the JVM will do it. Now the JVM does the binding and always goes with the object. Hence the object's version of the method will be called since the JVM looks at the object being referred. This is called Runtime Polymorphism or Dynamic Method Dispatch. Since the binding occurs at Runtime and not at Compile time.
In Runtime Polymorphism the compiler doesn't perform binding rather leaves it to the JVM.
