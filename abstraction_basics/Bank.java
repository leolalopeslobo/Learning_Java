//Implementer
public class Bank extends ATM{
	public void withdraw(){
		System.out.println("Withdraw Success");
	}
	public void deposit(){
		System.out.println("Deposit Success");
	}
	@Override
	public void display(){
		//super.display();
		System.out.println("I'm XYZ Bank");
		super.display();
	}
}