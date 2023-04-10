public class SBI implements RBI{
	//all methods of RBI needs to be implemented by SBI
	//If it fails to implement even one method, then it must become abstract, otherwise if it implements all the methods then it can remain a class
	public void withdraw(){
		System.out.println("Withdraw Successful");
	}
	public void deposit(){
		System.out.println("Deposit Successful and you get "+intRate+" interest");
	}
	public void chkBalance(){
		System.out.println("Your balance is: ");
	}

	public static void main(String[] args){
		RBI rbi = new SBI();  //upcasting between inteface and class
		//Runtime Polymorphism
		//this occurs when the object is referred by its parent type
		rbi.withdraw();
		rbi.deposit();
		rbi.chkBalance();
	}
}