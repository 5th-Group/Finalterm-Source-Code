package exam.finalterm.input;

import exam.finalterm.exception.MyException;
import exam.finalterm.input.Input;
public class ExceptionCheck {
	Input Test = new Input();
	public ExceptionCheck() {
	}
	public void getName() throws MyException {
		int numTries = -1;
		while(true) {
			try {
				Test.getName(); 
				break;
			} catch (MyException e) {
				System.out.println("Ten khong hop le!! Vui long khong nhap ki tu dac biet hoac so !!");
				if (--numTries == 0) throw e;
			}
		}
	}
	
	public void getPhoneNumber() throws MyException {
		int numTries = -1;
		while(true) {
			try {
				Test.getPhoneNumber(); 
				break;
			} catch (MyException e) {
				System.out.println("So dien thoai khong ton tai!!");
				if (--numTries == 0) throw e;
			}
		}
	}
	
	public void getWattage() throws MyException {
		int numTries = -1;
		while(true) {
			try {
				Test.getElectricUsage();
				break;
			} catch (MyException e) {
				System.out.println("!! Chi so khong hop le !! Ban da nhap: " +e);
				if (--numTries == 0) throw e;
			}
		}
	}
	
	public void getID() throws MyException {
		int numTries = -1;
		while(true) {
			try {
				Test.getID();
				break;
			} catch (MyException e) {
				System.out.println("!! Ma khach hang khong hop le !! Ban da nhap: " + e);
				if (--numTries == 0) throw e;
			}
		}
	}
	
	public void getAddress() throws MyException {
		Test.getAddress();
	}
}
