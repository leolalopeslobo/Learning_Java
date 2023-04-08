/*
here we use inheritance since similar requirements are present which can be easily obtained from another class
*/

public class TechEmployee extends Employee{
	//all non-private members inherited

	//creating child members
	private int bonus;
	String desig = "Project Engineer";

	//Creating a Construct to set the values
	public TechEmployee(int eid, String ename, double basicSalary, int bonus){
		super(eid, ename, basicSalary); //calling/referencing to the constructor of the immediate parent class
		this.bonus = bonus;
	}

	//overriding
	//redefining the behavious
	@Override   //annotation
	public void calculateSalary(){
		double salary = basicSalary + basicSalary*84/100 + bonus;
		System.out.println(salary);
	}
	@Override
	public void getEmployee(){
		super.getEmployee(); //calling immediate parent class methods
		System.out.println("Bonus = "+bonus);
		System.out.println("Designation: "+desig); //prints child desig
		System.out.println("Designation: "+super.desig);	//prints parent desig
	}
}


//this is the Specialized class