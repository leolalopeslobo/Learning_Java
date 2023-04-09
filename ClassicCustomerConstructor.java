class Customer{
	private int cid;
	private String cname;
	private double cbalance;
	static String bank = "State Bank of India";

	//constructor
	public Customer(int cid, String cname, double cbalance){
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

class ClassicCustomerConstructor extends Customer{
	private double rateOfInterest;

	public ClassicCustomerConstructor(int cid, String cname, double cbalance, double rateOfInterest){
		super(cid,cname,cbalance);
		this.rateOfInterest = rateOfInterest;
	}

	//Overriding calculate Interest
	@Override
	public void calculateInterest(){
		double interest = getCBalance()*rateOfInterest*2.5/100;
		System.out.println(interest);
	}

	public static void main(String[] args){
		System.out.println("Customer");
		Customer c = new Customer(883, "CUS", 820000);
		c.getCustomer();
		c.calculateInterest();
		System.out.println("\nClassic Customer");
		ClassicCustomerConstructor cc = new ClassicCustomerConstructor(427, "CCUS", 820000,9.9);
		cc.getCustomer();
		cc.calculateInterest();
	}
}