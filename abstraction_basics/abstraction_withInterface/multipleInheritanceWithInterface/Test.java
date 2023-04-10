//Functional Interface
interface Printable{
	void print();
}
interface Showable{
	void show();
}
public class Test implements Printable, Showable{ //multiple inheritance with interfaces
	public void print(){
			System.out.println("Printing.....");
		}
		public void show(){
			System.out.println("Showing.....");
		}
	public static void main(String[] args){
		Printable p = new Test();
		p.print();
		Showable s = new Test();
		s.show();
	}
}