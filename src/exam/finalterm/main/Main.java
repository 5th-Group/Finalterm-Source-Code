package exam.finalterm.main;

import exam.finalterm.output.*;
import exam.finalterm.algorithm.Bill;
import exam.finalterm.algorithm.PowerConsumption;
import exam.finalterm.exception.MyException;
import exam.finalterm.input.*;
public class Main {
	public static void main(String[] args) throws MyException {
		ExceptionCheck Test = new ExceptionCheck();
			Test.getName();
			Test.getID();
			Test.getPhoneNumber();
			Test.getAddress();
			Test.getWattage();
			PowerConsumption.consumedPower();
			PowerConsumption.consumptionLevel();
			Bill.currentBill();
			Bill.total();
			Output.conLV();
			
		Output.printInfo();
	}
}
