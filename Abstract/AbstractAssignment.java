package Abstract;

abstract class MNC
{
	MNC()
	{
		System.out.println("Inside MNC Constructor");
	}

	abstract void CEO();

	abstract void Vice();

	public void Employees()
	{
		System.out.println("Inside the normal method of MNC class");
	}
}
abstract class Infosys extends MNC
{
	@Override
	abstract void CEO();
	@Override
	public void Vice()
	{
		System.out.println("Impletation of stop2 method");
	}
}

public class AbstractAssignment {
	public static class Hello extends Infosys {
	@Override
	public void CEO()
	{
		System.out.println("Impletation of stop1 method");
	}

	public void Company()
	{
		System.out.println("This is method of Hello Class");
	}

	public static void main(String args[])
	{
		Infosys i=new Hello();
		Hello h=new Hello();
		i.Employees();
		i.CEO();
		i.Vice();
		h.Company();
		
	}
		
}

}


