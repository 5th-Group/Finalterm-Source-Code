package exam.finalterm.output;

import java.text.DecimalFormat;
import exam.finalterm.algorithm.*;
import exam.finalterm.input.*;
public class Output {
	public static StringBuilder nameFix(String name) {
		int pos = 0;
		boolean capitalize = true;
		StringBuilder namefix = new StringBuilder(name);
		while (pos < namefix.length()) {
		    if (namefix.charAt(pos) == '.') {
		        capitalize = true;
		    } else if (capitalize && !Character.isWhitespace(namefix.charAt(pos))) {
		        namefix.setCharAt(pos, Character.toUpperCase(namefix.charAt(pos)));
		        capitalize = false;
		    }
		    pos++;
		}
		return namefix;
	}
	
	public static String conLV(int consumptionLevel) {
		String conLv = " ";
		switch(consumptionLevel) {
			case 1:
					conLv = "I [1500VND].";
					break;
			case 2:
					conLv = "II [1800VND].";
					break;
			case 3:
					conLv = "III [2000VND].";
					break;
			case 4: 
					conLv = "IV [2500VND].";
					break;
			case 5:
					conLv = "V [3500VND].";
					break;
		}
		return conLv;
	}
	
	public static void printInfo() {
		int consumedPower = PowerConsumption.consumedPower(Input.CSC, Input.CSM);
		int consumptionLevel = PowerConsumption.consumptionLevel(consumedPower);
		double bill = Bill.total(Bill.currentBill(consumedPower, consumptionLevel));
		String conLv = Output.conLV(PowerConsumption.consumptionLevel(consumedPower));
		String address = Input.address, customerID = Input.customerID, phoneNumber= Input.phoneNumber;
		StringBuilder name = Output.nameFix(Input.name);
		DecimalFormat fix = new DecimalFormat("###,###,###,###.0");
		
		System.out.println("//======================================================================//");
		System.out.println(">> Ho va ten: " + name);
		System.out.println(">> Ma khach hang: " + customerID);
		System.out.println(">> So dien thoai: " + phoneNumber);
		System.out.println(">> Dia chi: " + address);
		System.out.println(">> Dien nang tieu thu la " + consumedPower + " kw" + ", thuoc dinh muc " + conLv);
		System.out.println(">> Tong so tien phai tra la " + fix.format(bill) + " VND.");
	}
}