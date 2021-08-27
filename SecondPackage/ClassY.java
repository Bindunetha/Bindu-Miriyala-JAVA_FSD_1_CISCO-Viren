package SecondPackage;


import FirstPackage.ClassM;
import FirstPackage.ClassN;

public class ClassY extends ClassN {
	public static void main(String[] args) {

		ClassM m = new ClassM();
		ClassY y = new ClassY();
		ClassX x = new ClassX();
		System.out.println("Display all the methods of class M and N");
		m.myMethod();
		y.anotherMethod();
		System.out.println("Display all the variables of class X");
		x.Display();
	}

}
