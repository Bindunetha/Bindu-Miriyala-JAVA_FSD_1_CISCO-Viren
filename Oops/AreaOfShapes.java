package Oops;

public class AreaOfShapes {
	int s, b, h;
	float r;

	AreaOfShapes() {
		System.out.println("Inside Default Constructor");
	}

	AreaOfShapes(int i) {
		s = i;
	}

	AreaOfShapes(int i, int j) {
		b = i;
		h = j;
	}

	AreaOfShapes(float i) {
		r = i;
	}

	public void Display1() {
		System.out.println("Area of Square :" + s * s);
	}

	public void Display2() {
		System.out.println("Area of Rectantgle :" + (b * h));
	}

	public void Display3() {
		System.out.println("Area of Circle :" + (0.14 * r * r));
	}

	public void Area(int d1, int d2) {
		int rh = (1 / 2) * d1 * d2;
		System.out.println("Area of Rhombus :" + rh);
	}

	public void Area() {
		int s1 = 5, s2 = 9;
		int tr = (1 / 2) * s1 * s2;
		System.out.println("Area of Triangle :" + tr);
	}

	public static void main(String args[]) {
		AreaOfShapes s = new AreaOfShapes();
		AreaOfShapes s1 = new AreaOfShapes(25);
		s1.Display1();
		AreaOfShapes s2 = new AreaOfShapes(2, 8);
		s2.Display2();
		AreaOfShapes s3 = new AreaOfShapes(20.0f);
		s3.Display3();
		s.Area();
		s.Area(4, 7);
	}

}
