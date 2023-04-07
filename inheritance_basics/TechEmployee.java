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
}


//this is the Specialized class