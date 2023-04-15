<h2>Java IO</h2>

Each Input Output is a Stream

**java.io** Package

<h5>Stream</h5>
What is a Stream?
It flow of information.

Input Stream: (Incoming)
To bring in informartion, a progarm opens a stream on an informarion source (a file, memory, a socket) and reads the information sequentially
![image](https://user-images.githubusercontent.com/83197830/232174451-4732f2f3-d9e2-4aaf-a6b3-c767b58b1d90.png)

Output Stream: (Outgoing)
A program can send information to an externa; destination by opening a stream to a destination and writing the information out sequentially
![image](https://user-images.githubusercontent.com/83197830/232174531-591597e4-7708-45fe-a17f-df82c0a9988d.png)

What can/does this Stream contain?
These streams can be of 2 data types
1. Character Stream
2. Byte Stream


Character Stream:
This stream contains A-Z, a-z, 0-9, and all the special characters, basically all that belongs to the charset and anything that contains or a combination of the charset is a text stream. <br>
![image](https://user-images.githubusercontent.com/83197830/232187071-ca06077c-1662-4bee-9645-7f8f750bea9c.png) <br>
It's deals with 16-bit since UNICODE is 16-bit


Byte Stream:
This contains binary stream which is actually called byte stream, byte means 8 bits also called octet thats a byte
If the data is in the form of octets then it is a byte stream


Now since we say byte stream, hence each data is represented in 1B only and in character stream it uses 2B

Advantage of Charcater Stream:
Provides more readable, and hence is mostly used

Advantage of Byte Stream:
They occupy less space


We require both streams, hence we have the concept of **serialization** and **de-serialization**
Serialization: The conversion of text stream to byte stream
De-Serialization: The conversion of byte stream to text stream

Say my object contains some data and I want to a server, it occupies to much space, too much bandwidth so this is then converted into byte stream, a binary file.



<h5>Types of Byte Streams</h5>
These are pre-defined Byte Streams
1. System.out -> using this we can write something to the Console using the method println() that's from PrintStream class
2. System.in -> to read we don't actually have a direct method, hence we use someother methods that are present in classes like Scanner, BufferedReader, Console, etc.
3. System.err -> this is for Error that you would like to send, println() can be used with this



<h5>2 Directions and 2 Streams</h5>
To define each of these directions with each of these streams.

Text Stream -> Input and Output
Byte Stream -> Input and Output
Hence we have 4 Classes to handle the Input and Output of each streams
![image](https://user-images.githubusercontent.com/83197830/232184381-b02d3f0a-53d7-4561-8f99-252aa3c9e829.png) <br>
These are 4 main base classes which are abstract to deal with IO in Java
- From the Text Stream we have 2 classes: a. **Reader** class and b. **Writer** class
- From the Byte Stream we have 2 classes: a. **InputStream** class and b. **OutputStream** class


Why are we wrapping?
Because certain classes can't be used directly, because it is a processing buffer.


Text Stream:
Output:
Writer class
FileWriter class -> This class is used for writing to files.
So by using FileWriter we can open a stream to a file and write to that file

Remember, if already there exists a file with the same one as that you are creating, then the earlier file gets replaced (overwritten) with this one.

**write() method**

Input:
Reader class
FileReader class -> This class is used for reading from files.
So by using FileReader we can open a stream to a file and read from that file

**read() method** - this reads charcters an returns **int**
