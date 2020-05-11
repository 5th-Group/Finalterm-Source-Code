package exam.finalterm.exception;

public class MyException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private String message;
	
	public MyException(String name) {
		message = name;
	}
	
	@Override
	public String toString() {
		return message;
	}
}
