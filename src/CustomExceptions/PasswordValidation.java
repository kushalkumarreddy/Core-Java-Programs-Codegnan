package CustomExceptions;

class PasswordTooShortException extends Exception {
 PasswordTooShortException(String message) {
     super(message);
 }
}

public class PasswordValidation {
	static void ValidatePassword(String password) throws PasswordTooShortException {
		if ( password.length() < 8) {
			throw new PasswordTooShortException ("Password must contain atleast 8 characters");
		} else {
			System.out.println("Valid password");
		}
	}
	
	public static void main(String[] args) {
		String password = "java123";
		
		try {
			ValidatePassword(password);
		} catch(PasswordTooShortException e) {
			System.out.println("Exception: "+ e.getMessage());
		}
	}
}