package exam.finalterm.input;

import exam.finalterm.exception.*;
import java.util.Scanner;
public class Input {
	Scanner input = new Scanner(System.in);
	public static String name, address = " ", phoneNumber, customerID;
	public static int CSM, CSC;
	public Input() {
		System.out.println("//=================Customer Electricity Service Bill=================//");
	}
	public void getName() throws MyException {
		String pattern = "[\\sa-zA-Z]+";
		System.out.print(">> Ho ten khach hang: ");
		name = input.nextLine();
		while(name.isEmpty()) {
			System.out.println("!! Vui long nhap ho va ten !!");
			System.out.print(">> Ho ten khach hang: ");
			name = input.nextLine();
		} 
		if(!name.matches(pattern)) {
			throw new MyException(name);
		}
	}
	
	public void getID() throws MyException {
		String pattern = "ES-\\d{10}";
		System.out.print(">> Ma khach hang: ");
		customerID = input.nextLine();
		while(customerID.isEmpty()) {
			System.out.println("!! Ma khach hang khong duoc de trong !!");
			System.out.print(">> Ma khach hang: ");
			customerID = input.nextLine();
		} 
		if(!customerID.matches(pattern)) {
			throw new MyException(customerID);
		}
	}
	
	public void getAddress() {
		System.out.print(">> Dia chi khach hang: ");
		address = input.nextLine();
	}
	
	public void getPhoneNumber() throws MyException {
		String pattern = "[0\\d]{10,11}";
		System.out.print(">> So dien thoai: ");
		phoneNumber = input.nextLine();
		while(phoneNumber.isEmpty()) {
			System.out.println("!! Vui long nhap so dien thoai !!");
			System.out.print(">> So dien thoai: ");
			phoneNumber = input.nextLine();
		} 
		if(!phoneNumber.matches(pattern)) {
			throw new MyException(phoneNumber);
		}
	}
	
	public void getElectricUsage() throws MyException {
		String pattern = "[0-9]+";
		
		System.out.print(">> Chi so cu: ");
		CSC = input.nextInt();
		while(String.valueOf(CSC).isEmpty()) {
			System.out.println("!! Vui long nhap chi so !!");
			System.out.print(">> Chi so cu: ");
			CSC = input.nextInt();
		} 
		if(!String.valueOf(CSC).matches(pattern)) {
			throw new MyException(String.valueOf(CSC));
		}
		
		System.out.print(">> Chi so moi: ");
		CSM = input.nextInt();
		while(String.valueOf(CSM).isEmpty()) {
			System.out.println("!! Vui long nhap chi so !!");
			System.out.print(">> Chi so moi: ");
			CSM = input.nextInt();
		} 
		if(!String.valueOf(CSM).matches(pattern) || CSM < CSC) {
			throw new MyException(String.valueOf(CSM));
		}
	}
}
