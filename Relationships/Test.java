public class Test{
	public static void main(String[] args){
		Address add = new Address(502,"Dream Valley","GY","Panaji",537492,"Goa");
		//Employee depends on Address
		//When a class has some dependency it is called 'Dependency Injection'
		Employee e = new Employee(123,"Ruby",100000,add);
		e.getEmployee(); //add.getAddress();
		e.calSalary();
	}
}