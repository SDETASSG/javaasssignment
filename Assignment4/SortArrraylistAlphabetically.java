package Assignment4;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrraylistAlphabetically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<String>();
		list.add("Volkswagen");
		list.add("Toyota");
		list.add("Porsche");
		list.add("Ferrari");
		list.add("Mercedes-Benz");
		list.add("Audi");
		list.add("Rolls-Royce");
		list.add("BMW");
		System.out.println("Before Sorting: " + list);
		Collections.sort(list);
		System.out.println("After Sorting: " + list);

	}

}
