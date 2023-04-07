public class Test{
	public static void main(String[] args){
		//creating an Object of child class

		System.out.println("Demostrating Overriding");
		System.out.println("Employee Object");
		Employee e = new Employee();
		e.getEmployee();
		e.calculateSalary();
		
		System.out.println("\nTechEmployee Object");
		TechEmployee te = new TechEmployee();
		te.getEmployee();
		te.calculateSalary(); //overridden		
	}
}