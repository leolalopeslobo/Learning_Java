class Test{
	public static void main(String[] args){
		//Also here Upcasting and Runtime Polymorphism is achieved
		ATM atm = new Bank(); //The reference here is ATM and not Bank even though it can be done using Bank reference, but contextually these methods belong to the ATM and the Bank is just the implementer
//Similar to when the government decides to build a bridge and even though L&T has built it, it belongs to the government and not L&T
		atm.withdraw();
		atm.deposit();
		atm.display();
	}
}