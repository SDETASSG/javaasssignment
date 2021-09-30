package Assignment4;

import java.util.HashSet;

public class CopyALLelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> hSet = new HashSet<Integer>();

		hSet.add(new Integer("1"));
		hSet.add(new Integer("2"));
		hSet.add(new Integer("3"));

		Object[] objArray = hSet.toArray();

		for (Object obj : objArray)
			System.out.println(obj);






	}

}
