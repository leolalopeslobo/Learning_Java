//Specifier
abstract public class ATM{
	private double interest;
	private int cashback;

	//this constructor helps us access/construct the data
	public ATM(double interest, int cashback){
		this.interest = interest;
		this.cashback = cashback;
	}

	public double interest(){
		return interest;
	}

	public int cashback(){
		return cashback;
	}

	//abstract methods
	public abstract void withdraw();
	public abstract void deposit();
	//concrete methods
	public void display(){
		System.out.println("I'm XYZ ATM");
		System.out.println(interest+" "+cashback);
	}
}