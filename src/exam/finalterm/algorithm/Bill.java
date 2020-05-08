package exam.finalterm.algorithm;

public class Bill {
	public static int currentBill(int consumedPower, int consumptionLevel) {
		int currentBill = 0;
		switch(exam.finalterm.algorithm.PowerConsumption.consumptionLevel(consumedPower)) {
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
	
	public static double total(int currentBill) {
		double total = 0;
		int first = 300000, second = 500000, third = 1000000;
		if(currentBill < first) {
			total = currentBill;
			
		} else if(currentBill >= first && currentBill < second) {
			total = currentBill * 1.3;
			
		} else if(currentBill >= second && currentBill < third) {
			total = currentBill * 1.8;
			
		} else {
			total = currentBill * 2.1;
			
		}
		return total;
	}
}
