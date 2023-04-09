//Implementer
public class Bank extends ATM{
	public Bank(double interest, int cashback){
		super(interest,cashback);
	}
	public void withdraw(){
		System.out.println("Withdraw Success and you got cashback: "+cashback());
	}
	public void deposit(){
		System.out.println("Deposit Success and you got interest: "+interest()+" on amount");
	}
	@Override
	public void display(){
		//super.display();
		System.out.println("I'm XYZ Bank");
		super.display();
	}

	public void msg(){
		System.out.println("This is a message from the Bank");
	}
}