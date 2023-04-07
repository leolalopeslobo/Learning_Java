public class Test{
	public static void main(String[] args){
		//creating an Object of child class

		System.out.println("Demostrating Overriding");
		System.out.println("Employee Object");
		Employee e = new Employee();
		e.setEmployee(623, "EMP", 100000);
		e.getEmployee();
		e.calculateSalary();
		
		System.out.println("\nTechEmployee Object");
		TechEmployee te = new TechEmployee();
		te.setEmployee(123, "TEMP", 100000);
		te.getEmployee();
		te.calculateSalary();
		te.getBonus();		
	}
}