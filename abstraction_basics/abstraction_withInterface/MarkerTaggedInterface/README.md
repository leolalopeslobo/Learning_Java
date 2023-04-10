<h2>Marked or Tagged Interfaces</h2>
Cloneable, Serializable
Cloneable is required to clone an object
Serializable is required to serialize an object
These are also known as Marker or Tagged Interface
<br>
A marker or tagged interface is an interface that has no objects

public interface Serializable{ <br>
 //no methods <br>
 } <br>
 
 
 Say suppose I have a Person class and I want to clone it then the Cloneable interface can be used
 class Person implements Cloneable{ <br>
 <br>
 }
 
 Refer to this video: https://www.youtube.com/watch?v=enFvv2q7IAY&t=1s
