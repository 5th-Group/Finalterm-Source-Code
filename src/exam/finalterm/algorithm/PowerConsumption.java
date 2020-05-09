package exam.finalterm.algorithm;

import exam.finalterm.input.*;
public class PowerConsumption {
	
	public static int CSC = Input.CSC, CSM = Input.CSM;
	public static int consumedPower, consumptionLevel;
	
	public static int consumedPower() {
		consumedPower = CSM - CSC;
		return consumedPower;
	}
	
	public static int consumptionLevel() {
		if(consumedPower <= 30) {
			return consumptionLevel = 1;
			
		} else if(consumedPower > 30 && consumedPower <= 50) {		
			return consumptionLevel = 2;
			
		} else if(consumedPower > 50 && consumedPower <= 100) {
			return consumptionLevel = 3;
			
		} else if(consumedPower > 100 && consumedPower <= 150) {
			return consumptionLevel = 4;
			
		} else {
			return consumptionLevel = 5;
		}
	}
}
