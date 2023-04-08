/*
here we use inheritance since similar requirements are present which can be easily obtained from another class
*/

public class TechEmployee extends Employee{
	//all non-private members inherited

	//creating child members
	private int bonus;
	//by default all final values are static

	//Creating a Construct to set the values
	public TechEmployee(int eid, String ename, double basicSalary, int bonus){
		super(eid, ename, basicSalary); //calling/referencing to the constructor of the immediate parent class
		this.bonus = bonus;
	}

	//getter
	public void getBonus(){
		System.out.println("Bonus is: "+bonus);
	}

	//overriding
	//redefining the behavious
	@Override   //annotation
	public void calculateSalary(){
		double salary = basicSalary + basicSalary*84/100 + bonus;
		System.out.println(salary);
	}

	public void getEmployee(){
		System.out.println(getEId()+" "+getEName()+" "+basicSalary+" "+bonus+" "+org);
	}
}


//this is the Specialized class