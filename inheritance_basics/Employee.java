public class Employee{
	private int eid;
	private String ename;
	//private double basicSalary;
	protected double basicSalary; //here this basicSalary will be accessible to the child
	static String org = "CDAC"; //static - since the organization is common for all the Employees

	//creating a setter
	public void setEmployee(int eid, String ename, double basicSalary){
		this.eid = eid;
		this.ename = ename;
		this.basicSalary = basicSalary;
	}
	
	//creating a getter
	public void getEmployee(){
		System.out.println(eid+" "+ename+" "+basicSalary+" "+org);
	}

	public int getEId(){
		return eid;
	}
	public String getEName(){
		return ename;
	}
	public double getBasicSalary(){
		return basicSalary;
	}
	
	public void calculateSalary(){
		double salary = basicSalary + basicSalary*84/100;
		System.out.println(salary);
	}
}

//this is the Generalized class