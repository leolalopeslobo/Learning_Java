
Constructors in Inheritance
Instead of using of setters we can also used constructors.

Usually setters are used for specific members, while constructos are used to set most members.


When default construct of parent and child are present the scenario looks something like this:
ParentClass(){
}
ChildClass(){
  super(); //this calls the parent constructor
}

Hence the super() constructor allows us to access the parent class constructor.
