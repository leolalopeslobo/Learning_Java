<h2>How To Create User-Defined Exceptions</h2>

Step1: A user-defined exception becomes an exception whenit **extends Exception class**
_class InvalidAgeException extends Exception_ <br>
So any class can become an exception or a throwable class when it extends exception class

Step2: In the constructor of the user-defined exception class, pass the error description of String type, and then pass error description to super() constructor i.e. it is poassed to the exception class constructor
_InvalidAgeException(String errDesc){ _  <br>
  _super(errDesc);_    <br>
  _}_ <br>
_}_

Step3: They just save it, get the .class file

Step4: Wherever you are used the user-defined exception you need to declare it explicitly and throw the object and catch it accordingly
_throw new InvalidAgeException("message");_


Note: All user-defined exceptions are 'checked exceptions' since it extends Exception class
Hence any exception that extends Exception class is a Checked Exception
