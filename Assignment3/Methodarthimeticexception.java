package Assignment3;

public class Methodarthimeticexception {

	void method() throws ArithmeticException {
		throw new ArithmeticException("ArithmeticException Occurred");
	}

	public static void main(String[] args) {

		Methodarthimeticexception obj = new Methodarthimeticexception();
		obj.method();
		System.out.println("handle Arthimetic Exception ");

	}

}
