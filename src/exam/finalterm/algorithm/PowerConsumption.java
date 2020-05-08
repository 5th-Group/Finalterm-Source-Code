package exam.finalterm.algorithm;

import exam.finalterm.input.*;
public class PowerConsumption {
	int CSC = Input.CSC, CSM = Input.CSM;
	public static int consumedPower(int CSC, int CSM) {
		int consumedPower = CSM - CSC;
		return consumedPower;
	}
	
	public static int consumptionLevel(int consumedPower) {
		if(consumedPower <= 30) {
			return 1;
		} else if(consumedPower > 30 && consumedPower <= 50) {
			return 2;
		} else if(consumedPower > 50 && consumedPower <= 100) {
			return 3;
		} else if(consumedPower > 100 && consumedPower <= 150) {
			return 4;
		} else {
			return 5;
		}
	}
}
