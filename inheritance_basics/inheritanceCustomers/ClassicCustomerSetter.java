class Customer{
	private int cid;
	private String cname;
	private double cbalance;
	static String bank = "State Bank of India";

	//setter
	public void setCustomer(int cid, String cname, double cbalance){
		this.cid = cid;
		this.cname = cname;
		this.cbalance = cbalance;
	}

	//getter
	public double getCBalance(){
		return cbalance;
	}
	public void getCustomer(){
		System.out.println(cid+" "+cname+" "+cbalance+" "+bank);
	}

	//calculate Interest
	public void calculateInterest(){
		double rate = 8.5;
		double time = 2.5;
		double interest = cbalance*time*rate/100;
		System.out.println(interest);
	}
}

class ClassicCustomerSetter extends Customer{
	private double rateOfInterest = 9.5;

	//Overriding calculate Interest
	@Override
	public void calculateInterest(){
		double interest = getCBalance()*rateOfInterest*2.5/100;
		System.out.println(interest);
	}

	public static void main(String[] args){
		System.out.println("Customer");
		Customer c = new Customer();
		c.setCustomer(883, "CUS", 820000);
		c.getCustomer();
		c.calculateInterest();
		System.out.println("\nClassic Customer");
		ClassicCustomer cc = new ClassicCustomer();
		cc.setCustomer(427, "CCUS", 820000);
		cc.getCustomer();
		cc.calculateInterest();
	}
}