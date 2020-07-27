package technoCredits.customException;

public class AgeNotValidException extends Exception {
	String message;
	public AgeNotValidException(String message) {
		super(message);
		this.message = message;
	}
	
	public AgeNotValidException() {
		super("User age is less than 18");
		this.message = "User age is less than 18";
	}
	
	public String toString() {
		return message;
	}
}
