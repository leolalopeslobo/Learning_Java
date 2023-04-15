<h2>Strings || String Handling</h2>

<h6>This is an easy concept/topic and is usually the most asked about topic in Java for interviews</h6>


What is a String?
It is sequence of characters (that means belonging to the charset, like A-Z, a-z, 0-9, 66 special symbols [34 non-printable characters and 32 printable characters]) and this squence is specified within the double quotes is a String.

<h4>Strings are immutable, that means you cannot change them (they are constant, they cannot be changed)<h4>
**A String class is a final class**


<h4>StringBuffer is Mutable</h4>

"java" - String literal value

**In Java, String literals are also objects in Java**

In Java, we have a package called - java.lang.String, that can also be used to create String objects

There are 2 ways to create String objects:
 1. Using string literals - "java"
 2. Using the String class and new keyword to instate - new String("java")
 
 
<h4>1. Creating a String object using literals</h4>
__String s1 = "java";__
s1 =  reference of type String

![image](https://user-images.githubusercontent.com/83197830/232150354-d7335f2d-4185-487e-a971-d89ba6bd25b7.png)

Now this object created, is stored in the Heap, in a special section (portion) called **String Constant Pool (SCP)** usually called non-hepa mempry but actually its a part, just a separate section.

Hence String literals are strored in the 'String Constant Pool (SCP)'
![image](https://user-images.githubusercontent.com/83197830/232153224-770efbe8-0a7c-4e4e-8602-703f2be7557c.png)

As we can see in the image above for s1, s2 objects are created where as whereas for s3 no new object is created. When a String object is created using literals, the JVM first checks for that literal in th SCP, if not present it creates an object, if already present then only a refrence is returned.
Hence for the 3 statments only 2 objects are created

Why is the done?
Since Strings are immutable and Java used a String Constant Pool, JVM saves the memory by not creating multiple objects which are same. hence it avoid creating duplicates and saves the memory.


<h4>2. Creating a String object using String class and new</h4>
String s1 = new String("hello");   //here 2 objects are created - 1. heap (because new keyword creates in the heap) and 2. "hello" is a String literal which is an object, hence one in the SCP if not present and this has no reference

Always remember 'new' always creates an object and stored in the heap, only String literals are checked if present since they are stored in the SCP.

String objects created using both methods:
![image](https://user-images.githubusercontent.com/83197830/232161862-a21b225a-2f6f-42d7-ab70-bdeb1d84d339.png)






<h5>String Comparison</h5>
**1. equals() - from Object clas**
This compares values or contents
Returns 'boolean'

String s = "java";
s.equals("python"); //false - contents/values are different

OR

String s1 = "java";
String s2 = "Java";
s.equals(s2); //false

String s1 = "java";
String s2 = "python";
s.equals(s2); //false

but also in Java we have a method 'equalsIgnoreCase()'
"Java".equalsIgnoreCase(s1); //true


**2. compareTo()**
This compares values or contents
Returns 'int'
if s1 > s2 => +ve
if s1 < s2 => -ve
if s1 = s2 => 0

String s1 = "abc";
String s2 = "xyz";
s1.compareTo(s2); //-ve, xyz is bigger a=97, x=120 97>120 => hence -ve and value is 97-123 = -23 -> output
s2.compareTo(s1); //+ve, xyz is bigger a=97, x=120 120>97 => hence +ve and value is 120-97 = +23 -> output
a.compareTo(b) checks in this way is 'a bigger than b?' and accordingly the answer is given
Alos compareToIgnoreCase() is also present

3. ==
This compares references and NOT values (checks if they refer to the same location)
Returns 'boolean'

String s1 = "abc";
String s2 = "xyz";
sout(s1==s2) //false


Eg:
String s1 = new String("java"); //2 objects created, heap and scp, and heap object refers to s1 and the other has no reference
String s2 = "java"; //no object created, since already present in scp, only reference of object in scp is return to s2

2 Objects created -> one in heap and another is scp
sout(s1==s2); //false
sout(s1.equals(s2)); //true
sout(s1.compareTo(s2)); //0


<h5>+ Operator</h5>
When '+' operator is given with at least one String, the concatenation takes place
Eg:
String s1 = "hello";
String s2 = " java";
String s3 = s1 + s2;
sout(s3); //hello java

also for "Sam" + 5 = "Sam5"

But if both oprands are integers then it's a binary operation and normal addition takes place.

<h6>How does the + operator actually works? How does these constants (strings) get added or concatenated?</h6>
Behind the scene actually this happens,
so whenever the + operator is involved, a new StringBuilder or StringBuffer comes into the picture,
**new StringBuilder().append(s1).append(s1).toString();**
new StringBuilder() - creates and empty string object, which is then appended by s1 and then s2 and then toString() to convert whole thing into a String so that it becomes immutable.

So whenever there is a '+' operator a series of append() methods are called on a StringBuilder or StringBuffer empty object



<h5>Substrings</h5>
What is a Substring?
A part or itself ois considered a Substring

String s = "HELLO"
s is actually indexed/offset with the starting index/offset of 0

0 1 2 3 4
H E L L O

**substring()** method:
s.substring(2); //since one value is given it is the start index
s.substring(1,4); //since two values are given, one is the start index and the second is the end index
Remember, the start index is always included and the end index is always excluded

s.substring(2); //LLO -> starts from the start index and goes upto the end of the string
s.substring(1,4); //ELL


**String s = 20+10+"java"+70;   //30java70**
**String s = 20+"java"+10+70;   //20java1070**

<h6>Some more important string methods</h6>
toUpperCase()
toLowerCase()
trim()
length()
startsWith()
endsWith()
chatAt()


<h5>charAt() method</h5>
Returns char at the given index

String s = "Database";
sout(s.charAt(3));  //a
char ch = s1.charAt(0); //D

**charAt() is a very useful method since we don't have a method to read a character in Java**
Through charAt(0)


Why does Strings have so many classes?
Strings have 3 classes namely, String, StringBuffer and StringBuilder.
Why 3 and not 1?
String is an immutable class - cannot be modified
Whereas StringBuilder and StringBuffer are mutable
Why are there 2 mutable classes?
In order to achieve thread safety we have 2 classes, out of which, StringBuffer is thread safe while StringBuilder is not thread safe
StringBuffer is a legacy (old) class while StringBuilder is not thread safe
Sometimes we don’t want Thread safety all the time because sometimes we need performance, and thread safety hinders the performance
What is thread safety?
When you have thread safety, all the threads come under or flow an order and the have to execute one after the other (synchronisation basically)
Eg: Thread safety is needed in Transactions and there we can go for StringBuffer
Otherwise if not thread safely is not important then use StringBuilder

 
**capacity() method in Java for both StringBuffer and StringBuilder**
 Default size is 16
 If the input exceeds 16, then it follows this capacity increase calculation - (16*2)+2 = 34
 If still 34 isn't enough then it goes ahead repeat th eincrease capacity calculation - (34*2)+2 = 70
 Hence its fulfills the capacity criteria then calculation will occur
 In general,     **(oldCapacity*2)+2**
 
 StringBuffer and StringBuilder have the same methods
 
 
 StringsBuffer and StringBuilder can only be intantiated, NO literals involved
 Strings can be intantiated and through literals
 Even in StringBuffer and StringBuilder the literals will go to the SCP
