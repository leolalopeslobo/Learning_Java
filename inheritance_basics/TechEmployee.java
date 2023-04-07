/*
here we use inheritance since similar requirements are present which can be easily obtained from another class
*/

public class TechEmployee extends Employee{
	//all non-private members inherited

	//creating child members
	final int BONUS = 10000; //fixed value hence final
	//by default all final values are static

	//getter
	public void getBonus(){
		System.out.println("Bonus is: "+BONUS);
	}

	//overriding
	//redefining the behavious
	@Override   //annotation
	public void calculateSalary(){
		double salary = getBasicSalary() + getBasicSalary()*84/100 + BONUS;
		System.out.println(salary);
	}

	public void getEmployee(){
		//System.out.println(getEId()+" "+getEName()+" "+getBasicSalary()+" "+BONUS+" "+org);
		System.out.println(getEId()+" "+getEName()+" "+basicSalary+" "+BONUS+" "+org);
	}
}


//this is the Specialized class