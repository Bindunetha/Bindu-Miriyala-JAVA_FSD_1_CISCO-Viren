package Oops;

public class MethodOverload {

	public void area(int b, int h) {
		System.out.println("Area of rectangle is :" + b * h);
	}

	public void area(int r) {
		System.out.println("Area of circle is : " + 3.14 * r * r);
	}

	public void area(float g, int c) {
		System.out.println("The values are :" + g + " and " + c);
	}

	public static void main(String[] args) {

		MethodOverload obj = new MethodOverload();
		obj.area(3, 4);
		obj.area(3);
		obj.area(3.14f, 5);
	}

}
