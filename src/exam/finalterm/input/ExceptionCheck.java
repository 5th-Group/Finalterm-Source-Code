package exam.finalterm.input;

import exam.finalterm.exception.MyException;
import exam.finalterm.input.Input;
public class ExceptionCheck {
	Input Test = new Input();
	public ExceptionCheck() {
	}
	public void getName() throws MyException {
		while(true) {
			try {
				Test.getName(); 
				break;
			} catch (MyException e) {
				System.out.println("Ten khong hop le!! Vui long khong nhap ki tu dac biet hoac so !!");
			}
		}
	}
	
	public void getPhoneNumber() throws MyException {
		while(true) {
			try {
				Test.getPhoneNumber(); 
				break;
			} catch (MyException e) {
				System.out.println("Vui long nhap dung so dien thoai!!");
			}
		}
	}
	
	public void getWattage() throws MyException {
		while(true) {
			try {
				Test.getCSC();
				break;
			} catch (MyException e) {
				System.out.println("!! Chi so khong hop le !! Vui long khong nhap chu hoac ky tu dac biet !!");
			}
		}
		while(true) {
			try {
				Test.getCSM();
				break;
			} catch (MyException e) {
				System.out.println("!! Chi so khong hop le !! Vui long khong nhap chu hoac ky tu dac biet !!");
			}
		}
	}
	
	public void getID() throws MyException {
		while(true) {
			try {
				Test.getID();
				break;
			} catch (MyException e) {
				System.out.println("!! Ma khach hang khong hop le !! Ma khach hang chi bao gom 10 so");
			}
		}
	}
	public void getAddress() throws MyException {
		Test.getAddress();
	}
}
