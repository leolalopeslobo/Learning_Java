<h2>Static</h2>

static variables, static methods, static classes, static block

Static is a modifier that is applied to variables, methods
Static members can be called directly with the Class name
Static is also applicable to classes -> called as **'static nested class'**

Static variables obviously can be changed. Only final values do not change

What is a static variable?
A normal variable will not retain its value, whereas **a static variable will retain its value** during the program execution.

check slide for more programs

int x = 10;
fun(int x){
	x++;
	System.out.println(x);
}
fun(x);  //11
fun(x); //11
fun(x); //11

static int x = 10;
fun(int x){
	x++;
	System.out.println(x);
}
fun(x); //11
fun(x); //12
fun(x); //13


A static variable is separately allocated in class area or method area during class loading only i.e. before the main()


What is a static method?
In method that is designated with a static keyword is a static method
Static methods can handle only static data
static methods have 2 disadvantages and 1 advantage

1 advantage:
- It can be called by class name directly, no object is required

2 disadvantage:
1. Since it is static, you can't access static variables or methods cannot be accessed (hence objects are created for accessibility)
2. this and super doesn't fit in a static context, since this refers to current object and super refers to immediate parent class



What is static block?
Any block with a static keyword defined to that block is a static block

static { <br>
<br>
} <br>

Only static variables and static methods can be decalared inside a static block 

Why are static blocks used?
To initialise static members

Static blocks will be allocated during class loading only, that means anything that is there will get executed.
Incase you want some code that needs to be executed before that main then you use static blocks
