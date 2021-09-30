package Assignment3;

public class Numberexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";

		try {
			int i = Integer.parseInt(s);

			System.out.println(i);

		} catch (NumberFormatException e) {

			System.out.println("Enter valid number");

		}
	}
}
