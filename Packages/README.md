<h2>Packages</h2>
What is a Package?
A Package is a grouping thing. It groups related types { classes, interfaces, enums, errors, annotations and even contains sub packages }

C++ doesn't have packages.

Why use packages or what is the need of packages or benefits of packages?
Manage/maintenance related types
Increases Encapsulation
		package mypack;
		class X {
			int x;
		}
		
		In order to access the variable and with the addition of more encapsulation we can do the following
		mypack.X x = new X();
		Therefore, this adds another layer of encapsulation.
Naming conflict resolution (Major benefits)
This allows us to use/have multiple classes with the same name

There 2 keywords used here, **package** - to create a package and **import** to import a package.

What we need to learn in Packages...
1. How to Import Packages
2. How to Create Custom Packages (create your own packages)

How to import packages
1. import package_name.*; //this means that everything in this package is available for use except its subpackages. -> **Implicit Import**
2. import package_name.class_name; //here the class required is clearly mentioned. -> **Explicit Import**
3. Through the use of **Fully Qualified Names (FQN)** //here we use the whole name most times everywhere hence we don't need to use the import keyword along.

What is the difference between Implicit and Explicit Imports?
Explicit has higher precedence over Implicit.
Therefore say suppose both the packages declare have a similar class name associated with them then, whichever one is explicitly import will be considered since it will have higher precedence over the implicit one. This is obvious since its explicitly (clearly) declared.


<h5>Static Import</h5>
What is Static Import?
In Java, static import concept is introduced in 1.5 version. With the help of static import, we can access the static members of a class directly without class name or any object. For Example: we always use sqrt() method of Math class by using Math class i.e. Math.sqrt(), but by using static import we can access sqrt() method directly. 
According to SUN microSystem, it will improve the code readability and enhance coding. But according to the programming experts, it will lead to confusion and not good for programming. If there is no specific requirement then we should not go for static import.

Eg: <br>
import static java.lang.Math.*; //static import   <br> 
Now you can use,  <br>
random(); directly instead of Math.random();  <br>
