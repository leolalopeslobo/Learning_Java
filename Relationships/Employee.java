public class Employee { //fully encapsulated class
	private int eid;
	private String ename;
	private double salary;
	private static String org = "Google";
	private Address address; //this is a separate class itself, contains address details like hno, streetname, locality, city, pincode, etc.

	public Employee(int eid, String ename, double salary, Address address){
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.address = address;
	}

	public double getSalary(){
		return salary;
	}

	public void getEmployee(){
		System.out.println(eid+" "+ename+" "+salary+" "+org);
		address.getAddress(); //address details -> using the address getter
	}

	public void calSalary(){
		//hra=30, da=42, ta=12
		double totalSalary = salary + salary*84/100;
		System.out.println(totalSalary);
	}
}