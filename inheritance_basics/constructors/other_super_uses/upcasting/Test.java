public class Test{
	public static void main(String[] args){
		//creating an Object of child class

		//System.out.println("Demostrating Overriding");
		//System.out.println("Employee Object");
		//Employee e = new Employee(456, "HUE", 100000);
		//e.getEmployee();
		//e.calculateSalary();
		
		//System.out.println("\nTechEmployee Object");
		//TechEmployee te = new TechEmployee(846, "JIE", 100000, 15000);
		//te.getEmployee();
		//te.calculateSalary(); //overridden

	
		System.out.println("\nUpCasting");
		Employee e = new TechEmployee(846, "JIE", 100000, 15000); //Upcasting
		e.getEmployee();   //upcasting+overriding=deadly combo
		e.calculateSalary();
		e.hello(); //child-specific method called using parent refernce		
		//System.out.println("\n"+e.desig);
	}
}