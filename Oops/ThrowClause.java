package Oops;

import java.util.Scanner;

public class ThrowClause {

	static int add(int num1, int num2) {
		if (num1 > 900) {
			throw new ArithmeticException("Num 1 is greater than 900 and hence exception is thrown"); // exception threw
		} else {
			System.out.println("Both parameters are correct..!!!");
		}

		return num1 + num2;
	}

	public static void main(String[] args) {
		int result = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number : ");
		int num1 = sc.nextInt();

		System.out.println("Enter the second number : ");
		int num2 = sc.nextInt();

		try {
			result = add(num1, num2);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());

		}

		System.out.println("Result is " + result);

	}

}

