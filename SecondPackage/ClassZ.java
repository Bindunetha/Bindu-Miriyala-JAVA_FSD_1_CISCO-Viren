package SecondPackage;


import FirstPackage.ClassM;
import FirstPackage.ClassN;

public class ClassZ extends ClassM {
	public static void main(String[] args)
	{
	
		ClassX x=new ClassX();
		ClassZ z=new ClassZ();
		ClassN n=new ClassN();
		System.out.println("Display all the methods of class M,N and P");
		z.myMethod();
		n.anotherMethod();
		System.out.println("Display all the variables of class X");
	    x.Display();
		
	}

}
