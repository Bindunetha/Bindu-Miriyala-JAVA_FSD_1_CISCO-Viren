package Abstract;


	class Vehicle {
		int speed = 40;
		long distance = 900;

		public void run() {
			System.out.println("run method of Vehicle class");
		}

		public void stop() {
			System.out.println("stop method of Vehicle class");
		}

		public void fuel(int a) {
			System.out.println("First fuel method of Vehicle class");
		}

		public void fuel(float f, String s) {
			System.out.println("second fuel method of Vehicle class");
		}

		public void fuel(char c, int i) {
			System.out.println("third fuel method of Vehicle class");
		}

		Vehicle() {
			System.out.println("Default constructor of Vehicle class");
		}

		Vehicle(int p) {
			System.out.println("Parameterized constructor of Vehicle class");
		}

		void Display() {

		}
	}

	class TwoWheeler extends Vehicle {
		int speed = 40;
		long distance = 5000;
		int nos_of_tyre = 2;

		TwoWheeler() {
			System.out.println("Inside defalut constructor of TwoWheeler");
		}

		@Override
		public void run() {
			System.out.println(" run method of TwoWheeler class");
		}

		@Override
		public void stop() {
			System.out.println("stop method of TwoWheeler class");
		}

		@Override
		public void Display() {
			System.out.println("Value of Speed: " + super.speed);
			System.out.println("Value of distance: " + super.distance);
			System.out.println("Value of Speed: " + speed);
			System.out.println("Value of distance: " + distance);
			System.out.println("Value of Nos_of_tyre: " + nos_of_tyre);

		}
	}

	class ThreeWheeler extends TwoWheeler {
		int speed = 80;
		long distance = 1000;
		int nos_of_tyre = 3;

		@Override
		public void run() {
			System.out.println("run method of ThreeWheeler class");
		}

		@Override
		public void stop() {
			System.out.println("stop method of ThreeWheeler class");
		}

		ThreeWheeler() {
			System.out.println("Inside defalut constructor of ThreeWheeler");
		}

		@Override
		public void Display() {
			System.out.println("Value of Speed: " + super.speed);
			System.out.println("Value of distance: " + super.distance);
			System.out.println("Value of Speed: " + speed);
			System.out.println("Value of distance: " + distance);
			System.out.println("Value of Nos_of_tyre: " + nos_of_tyre);

		}

	}

	class FourWheeler extends ThreeWheeler {
		int speed = 100;
		long distance = 5000;
		int nos_of_tyre = 4;

		@Override
		public void run() {
			System.out.println(" run method of FourWheeler class");
		}

		@Override
		public void stop() {
			System.out.println("stop method of FourWheeler class");
		}

		FourWheeler() {
			System.out.println("Inside defalut constructor of FourWheeler");
		}

		@Override
		public void Display() {
			System.out.println("Value of Speed: " + super.speed);
			System.out.println("Value of distance: " + super.distance);
			System.out.println("Value of Speed: " + speed);
			System.out.println("Value of distance: " + distance);
			System.out.println("Value of Nos_of_tyre: " + nos_of_tyre);

		}

	}

	public class VehicleAssignment extends FourWheeler {
		int speed = 520;
		long distance = 300;
		int nos_of_tyre = 8;

		@Override
		public void run() {
			System.out.println("run method of EightWheeler class");
		}

		@Override
		public void stop() {
			System.out.println("stop method of EightWheeler class");
		}

		VehicleAssignment() {
			System.out.println("Inside defalut constructor of EightWheeler");
		}

		@Override
		public void Display() {
			System.out.println("Value of Speed: " + super.speed);
			System.out.println("Value of distance: " + super.distance);
			System.out.println("Value of Speed: " + speed);
			System.out.println("Value of distance: " + distance);
			System.out.println("Value of Nos_of_tyre: " + nos_of_tyre);

		}

		public static void main(String args[]) {
			Vehicle v = new Vehicle();
			v.run();
			v.stop();
			v.fuel(10);
			v.fuel(5.5f, "sneha");
			v.fuel('s', 10);
			v = new TwoWheeler();
			v.run();
			v.stop();
			v.Display();
			v = new ThreeWheeler();
			v.run();
			v.stop();
			v.Display();
			v = new FourWheeler();
			v.run();
			v.stop();
			v.Display();
			v = new VehicleAssignment();
			v.run();
			v.stop();
			v.Display();

		}
	}



