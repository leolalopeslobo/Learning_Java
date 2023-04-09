public class Address{
	private int hno;
	private String streetName;
	private String locality;
	private String city;
	private int pin;
	private String state;


	public Address(int hno, String streetName, String locality, String city, int pin, String state){
		this.hno = hno;
		this.streetName = streetName;
		this.locality = locality;
		this.city = city;
		this.pin = pin;
		this.state = state;
	}

	public void getAddress(){
		System.out.println(hno+" "+streetName+" "+locality+" "+city+" "+pin+" "+state);
	}
}

