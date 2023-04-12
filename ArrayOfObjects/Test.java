public class Test{
	public static void main(String[] args){

		Student[] s = new Student[5]; //creating an array of Student type
		//creating objects
		for(int i=0;i<s.length;i++){
			s[i] = new Student();
		}

		for(int i=0;i<s.length;i++){
			System.out.println(s[i]); //s[i].toString()
		}
	}
}