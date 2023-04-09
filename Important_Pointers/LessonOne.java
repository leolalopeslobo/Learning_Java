public class LessonOne{
	public static void main(String[] args){
		byte x = 127;
		x++;  //-128
		x++;  //-127
		System.out.print(x); //-127
	}
}

/*
Note: Range of byte data type in java is -128 to 127. But the byte data type in java is cyclic in nature
*/
