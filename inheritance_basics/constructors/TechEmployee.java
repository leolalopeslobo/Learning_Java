/*
here we use inheritance since similar requirements are present which can be easily obtained from another class
*/

public class TechEmployee extends Employee{
	//all non-private members inherited

	//creating child members
	final int BONUS = 10000; //fixed value hence final
	//by default all final values are static

	//Creating a Construct to set the values
	public TechEmployee(int eid, String ename, double basicSalary){
		super(eid, ename, basicSalary); //calling/referencing to the constructor of the immediate parent class
	}

	//getter
	public void getBonus(){
		System.out.println("Bonus is: "+BONUS);
	}

	//overriding
	//redefining the behavious
	@Override   //annotation
	public void calculateSalary(){
		double salary = basicSalary + basicSalary*84/100 + BONUS;
		System.out.println(salary);
	}

	public void getEmployee(){
		System.out.println(getEId()+" "+getEName()+" "+basicSalary+" "+BONUS+" "+org);
	}
}


//this is the Specialized class