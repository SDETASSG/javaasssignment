package Assignment4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class hashmaptolist {

	public static void main(String[] args) {

		Map<Integer, String> myMap = new HashMap<>();
		myMap.put(1, "Java");
		myMap.put(2, "python");
		myMap.put(3, "selenium");
		myMap.put(4, "RestAPI");

		ArrayList<Integer> keyList = new ArrayList<Integer>(myMap.keySet());
		ArrayList<String> valueList = new ArrayList<String>(myMap.values());

		System.out.println("contents of the list holding keys the map ::" + keyList);
		System.out.println("contents of the list holding values of the map ::" + valueList);
	}

}
