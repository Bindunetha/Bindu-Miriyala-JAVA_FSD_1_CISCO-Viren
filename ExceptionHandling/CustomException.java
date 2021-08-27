package ExceptionHandling;
	

	public class CustomException {

		static void validate(int age) throws InvalidAgeException {	//Method called while hinting custom exception(Checked Exception)

			if (age < 18) {
				throw new InvalidAgeException("Not valid");		//object will be created
			} else {
				System.out.println("Welcome to vote");
			}
		}

		public static void main(String[] args) {

			try {
				validate(17);		//Calling method

			} catch (Exception e) {
				System.out.println("Exception occured : " + e.getMessage());
			}

			System.out.println("rest of the code...");

		}

	}

	//Custom Exception

	class InvalidAgeException extends Exception {
		InvalidAgeException(String s) {
			super(s);
		}
	}

	

		

	


