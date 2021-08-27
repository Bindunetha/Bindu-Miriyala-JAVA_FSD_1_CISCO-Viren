package Oops;

public class NestedTry {

	public static void checkException() {
		try {
			int res = 3 / 0;

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException ");

		} finally {
			System.out.println("Finally inside method");

		}
	}

	public static void main(String[] args) {

		try {
			checkException();
		} catch (ArithmeticException e) {
			System.out.println("ArrayIndexOutOfBoundsException");

		} finally {
			System.out.println("Finally outside method");
		}
	}

}
