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
