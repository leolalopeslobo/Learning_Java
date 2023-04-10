public interface RBI extends TTP{ //here both RBI and TTP are interfaces
	double intRate = 3.5; //constant

	//all abstract methods
	void withdraw();
	void deposit();
	void chkBalance();
	// +1
}