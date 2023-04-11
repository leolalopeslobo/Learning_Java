package cdac.hyd.online;

public class DAC{
	private int id;
	private int totalStrength;
	static private String name = "PG-DAC";

	public DAC(int id, int totalStrength){
		this.id = id;
		this.totalStrength = totalStrength;
	}

	public void getDAC(){
		System.out.println(id+" "+totalStrength+" "+name);
	}
}
