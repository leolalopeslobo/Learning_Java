class LessonTwo{
	public static void main(String[] args){
		int[] x = {200, 129, 016};
		for(int i : x)
			System.out.print(i+" ");
	}
}

/*
200 129 14 
The above is the output since all numbers starting with 0 are treated as Octal numbers
and those that start with 0x are treated as hex numbers
Hence the decimal equivalent of 016 is 14
*/
