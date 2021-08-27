package Constructor;



public class ConstructorExample {

	int id;
	String name;

	public ConstructorExample() {
		id = 3;
		name = "sam";
		System.out.println("Im in the default constructore");
	}

	public ConstructorExample(int i, String n)
	{
		id = i;
		name = n;
		System.out.println(" in the parameterized constructor");
	}

	void display() {
		System.out.println("Values are :" + id + " " + name);
	}

	public static void main(String[] args) {

		ConstructorExample ob = new ConstructorExample();
		ob.display();
		ConstructorExample ob1 = new ConstructorExample(111, "Akash");
		ob1.display();

	}

}
