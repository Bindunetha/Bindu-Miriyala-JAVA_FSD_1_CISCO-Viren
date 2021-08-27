package Oops;

class A {
	
	public void Ado()
	{
		System.out.println("Inside class A");
	}
}

class B extends A
{
	public void Bdo()
	{
		System.out.println("Inside class b");
	}
}


class C extends B
{
	public void Cdo()
	{
		System.out.println("Inside class c");
	}
}
public class MultiLevel {

	public static void main(String[] args) {

		
		C ob = new C();
		ob.Ado();
		ob.Bdo();
		ob.Cdo();

	}

}

