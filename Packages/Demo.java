import java.sql.*; //Implicit Import
import java.util.Date; //Explicit Import
public class Demo{	
	public static void main(String[] args){
		java.util.Scanner in = new java.util.Scanner(System.in); //Fully Qualified Name (FQU)
		System.out.println("Enter your name:");
		String name = in.next();
		System.out.println("Your name is: "+name);
		Date d = new Date();
		System.out.println(d); //d.toString();
	}
}

//Hence here the compiler is clearly able to understand which Date class needs to be used.