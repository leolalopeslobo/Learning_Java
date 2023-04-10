interface X{
	void fun();
	default void msg(){
		System.out.println("I'm a default method");
		test(); //calling private method, here since you can't call the private method outside the class
	}
	private void test(){
		System.out.println("I'm a private method");
	}
	static void meth(){
		System.out.println("I'm a static method");
	}
}

public class Demo implements X{
	public void fun(){
		System.out.println("fun() implemented by class");
	}	
	public static void main(String[] args){
		X x = new Demo();
		x.fun();
		x.msg(); //here I'm calling the default method and inturn calls the private method
		X.meth(); //you can call static methods using the class name	
	}
}