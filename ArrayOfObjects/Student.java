import java.util.Scanner;
public class Student{
	private int id;
	private String name;
	private static String org = "CDAC Hyd";

	public Student(){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter name and id: ");
		name = in.next();
		id = in.nextInt();
	}
	@Override
	public String toString(){
		return ""+id+" "+name+" "+org;
	}
	
}