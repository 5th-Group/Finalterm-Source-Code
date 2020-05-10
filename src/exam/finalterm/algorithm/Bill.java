package exam.finalterm.algorithm;

import exam.finalterm.algorithm.PowerConsumption;
public class Bill {
	public static double addFee, total;
	public static int currentBill, consumedPower = PowerConsumption.consumedPower, consumptionLevel = PowerConsumption.consumptionLevel;
	
	public static int currentBill() {
		switch(consumptionLevel) {
			case 1: 
					currentBill = consumedPower * 1500;
					break;
			case 2:
					currentBill = consumedPower * 1800;
					break;
			case 3: 
					currentBill = consumedPower * 2000;
					break;
			case 4:
					currentBill = consumedPower * 2500;
					break;
			case 5:
					currentBill = consumedPower * 3500;
		}
		return currentBill;
	}
	
	public static double additionalFee() {
		int first = 300000, second = 500000, third = 1000000;
		if(currentBill < first) {
			return addFee;
			
		} else if(currentBill >= first && currentBill < second) {
			return addFee = 0.3;
			
		} else if(currentBill >= second && currentBill < third) {
			return addFee = 0.8;
			
		} else {
			return addFee = 1.1;
			
		}
	}
	
	public static double total() {
		return total = currentBill + (currentBill * addFee);
	}
}
