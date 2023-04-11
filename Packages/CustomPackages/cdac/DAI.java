package cdac.pune;

public class DAI{
	private int id;
	private int totalStrength;
	static private String name = "PG-DAC";

	public DAI(int id, int totalStrength){
		this.id = id;
		this.totalStrength = totalStrength;
	}

	public void getDAI(){
		System.out.println(id+" "+totalStrength+" "+name);
	}
}
