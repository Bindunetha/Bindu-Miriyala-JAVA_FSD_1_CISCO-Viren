package Constructor;



	public class ConstructorOverload {

		long id;
		String name;
		int age;

		ConstructorOverload(long i) {
			id = i;
		}

		ConstructorOverload(long i, String n) {
			id = i;
			name = n;
		}

		ConstructorOverload(long i, String n, int a) {
			id = i;
			name = n;
			age = a;
		}  

		void display() {
			System.out.println("Value are: " + id + " " + name + " " + age);
		}

		public static void main(String[] args) {

			ConstructorOverload ob1 = new ConstructorOverload(3, "sam");
			ConstructorOverload ob2 = new ConstructorOverload(2, "sid", 24);
			ConstructorOverload ob3 = new ConstructorOverload(2);

			ob1.display();
			ob2.display();
			ob3.display();
		}

	}



