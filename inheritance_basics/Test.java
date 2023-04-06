public class Test{
	public static void main(String[] args){
		//creating an Object of child class

		TechEmployee te = new TechEmployee();
		te.setEmployee(123, "TEMP", 100000);
		te.getEmployee();
		te.calculateSalary();		
	}
}