package Abstract;



abstract class AbstractDemo {

	private String name = "Abc";

	AbstractDemo() {
		System.out.println("Hello im in Abstract class...");
	}

	public void mymethod() {
		System.out.println("Hello " + name);
	}

	abstract public void anotherMethod();
}

public class AbstractDemo2 extends AbstractDemo {

	AbstractDemo2() {
		super();
		System.out.println("Hello im in Child class...");
	}

	@Override
	public void anotherMethod() {
		System.out.println("Abstract Method...");
	}

	public void normalChildMethod() {
		System.out.println("normalChildMethod...");
	}

	public static void main(String[] args) {
		AbstractDemo obj = new AbstractDemo2();

		obj.anotherMethod();
		obj.mymethod();

	}

}




