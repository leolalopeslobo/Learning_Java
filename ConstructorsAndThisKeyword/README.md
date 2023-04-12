<h2>Constructors</h2>

What is the primary role of a Constructor?
Its duty/role is to construct/initialize the instance members of the class. It has nothing to do with static.


Properties of a Constructors.
1. These are special methods whose name is same as the class name
2. Constructor is written without any type but it returns class type (nothing but hashCode)


Types of Constructors
- Defaut Constructor
- Parameterized Constructor

<h6>Note: If there is no constructor in the class, the compiler supplies a defaut constructor</h6> which is usually as follows <br>
public className() { <br>
//empty implementation <br>
} <br>
Even though its implementation is empty it still assigns the defalut values to the instance variables

Also if you already have a constructor written, then the compiler won't supply any constructor

<h5>Constructor Overloading is possible</h5> - this means that you have multiple constructors in a class
Overloading is a Polymorphic feature.

You can eliminate the need of a setter method by the use of a Constructor, so initially the constrcutor constructs the default valued for the instance varaibles and later as the byte codes are being executed it constructs the local variable values are assigned to the instance values.


<h4>this</h4>
Use of this keyword
public Student(int sid, String sname, double gpa){
	//principle of locality reference
	sid = sid;
	sname = sname;
	gpa = gpa;
}

the output here will be the default values since inside the method (or constructor) you are assigning the variable to itself. There is no where its referencing to the instance variables because of according to the "principle of locality reference" says that priority will be for the local variables only, and since every thing is local we don't have distinguish since both are of the same name.
And inorder to distinguish between them we use the 'this' keyword

**this** Keyword:
- it is a reference variable
- refers to current object

**this()** - this Constructor:
- refers to curent constructor

Advantage:
Allows you to reuse the existing constructor


The call to this() constructor is always the first statement. Why?
Because the purpose of 'this' is to invoke the current class constructor. So it means first construct the existing one and later construct yourself
This is a rule in Java


Can you prove this refers to the same method?
YES!


class Student{

	public void msg(){
		System.out.println(this); //calling/referring to the cuurent object
	}
	
	public static void main(String[] args){
		Student s = new Student();
		s.msg();
		System.out.println(s); //current object
	}
}
