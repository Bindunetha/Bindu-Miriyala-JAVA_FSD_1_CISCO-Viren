package Oops;

class bank {

	float rate() {
		return 0;
	}
}

class sbi extends bank {

	int n = 9;

	@Override
	float rate() {
		return 5f;
	}
}

class icici extends bank {
	@Override
	float rate() {
		return 6f;
	}
}

class axis extends bank {
	@Override
	float rate() {
		return 7f;
	}
}

public class RuntimePolymorphism {

	public static void main(String[] args) {

		bank b;
		b = new sbi();

		System.out.println("Rate from sbi is " + b.rate());

		b = new icici();
		System.out.println("Rate from icici is " + b.rate());

		b = new axis();

		System.out.println("Rate from axis is " + b.rate());

	}

}

