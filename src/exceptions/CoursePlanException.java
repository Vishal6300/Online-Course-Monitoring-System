package exceptions;

@SuppressWarnings("serial")
public class CoursePlanException extends Exception{
	public CoursePlanException() {
		
	}
public CoursePlanException(String msg) {
		super(msg);
	}
}
