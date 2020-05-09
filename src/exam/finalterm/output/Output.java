package exam.finalterm.output;

import java.text.DecimalFormat;
import exam.finalterm.algorithm.*;
import exam.finalterm.input.*;
public class Output {
	public static String conLv;
	public static int consumptionLevel = PowerConsumption.consumptionLevel;
	
	public static String capitalizeFully(String name) {
	    if (name == null || name.isEmpty()) {
	        return name;
	    }
	 
	    StringBuilder converted = new StringBuilder();
	 
	    boolean convertNext = true;
	    for (char ch : name.toCharArray()) {
	        if (Character.isSpaceChar(ch)) {
	            convertNext = true;
	        } else if (convertNext) {
	            ch = Character.toTitleCase(ch);
	            convertNext = false;
	        } else {
	            ch = Character.toLowerCase(ch);
	        }
	        converted.append(ch);
	    }
	    
	    return converted.toString();
	}
	
	public static String conLV() {
		conLv = " ";
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
		int consumedPower = PowerConsumption.consumedPower;
		double bill = Bill.total;
		String customerID = Input.customerID, phoneNumber= Input.phoneNumber;
		String address = capitalizeFully(Input.address);
		String name = capitalizeFully(Input.name);
		DecimalFormat fix = new DecimalFormat("###,###,###,###.0");
		
		System.out.println("//======================================================================//");
		System.out.println(">> Ho va ten: " + name);
		System.out.println(">> Ma khach hang: " + customerID);
		System.out.println(">> So dien thoai: " + phoneNumber);
		System.out.println(">> Dia chi: " + address);
		System.out.println(">> Luong dien nang tieu thu la " + consumedPower + " kw" + ", thuoc dinh muc " + conLv);
		System.out.println(">> Tong so tien phai tra la " + fix.format(bill) + " VND.");
	}
}