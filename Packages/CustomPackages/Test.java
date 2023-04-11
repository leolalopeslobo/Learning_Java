package cdac; //should be in a package since I want to access the other packages using import

import cdac.hyd.online.*; //implicit import
import cdac.hyd.DBDA; //explicit import

public class Test{
	public static void main(String[] args){
		DAC dac = new DAC(203, 126); //cdac.hyd.online
		dac.getDAC();
		DBDA dbda = new DBDA(305, 53); //cdac.hyd.DBDA
		dbda.getDBDA();
		cdac.pune.DAI dai = new cdac.pune.DAI(430, 50); //FQN
		dai.getDAI();
	}
}
