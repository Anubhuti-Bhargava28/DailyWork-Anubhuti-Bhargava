package com.cts.regularWork;

public class ExceptionHandling {

	public static void divideNumber(int a, int b)throws CustomException
	{
		if(b>0) {
			System.out.println(a/b);
		}
		else {
			throw new CustomException();
		}
	}
	public static void main(String[] args) {
		try {
			divideNumber(4,0);
		}
		catch(CustomException ex) {
			System.out.println(ex.getMessage("Divide by zero"));
		}
	}

}
class CustomException extends Exception{
	public CustomException() {
		System.out.println("custom messgae");
	}
	String getMessage(String message) {
		return "Exception is :"+ message;
	}
}
