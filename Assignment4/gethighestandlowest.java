package Assignment4;

import java.util.TreeSet;

public class gethighestandlowest {

	public static void main(String[] args) {
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
	      
		  treeSet.add(1);
		  treeSet.add(3);
		  treeSet.add(2);
		  treeSet.add(500);
		  treeSet.add(6);
		  treeSet.add(20);
		  treeSet.add(8);
		  treeSet.add(9);
		  treeSet.add(10);
		          
		 System.out.println("available numbers in treeset:"+treeSet);
		          
		 System.out.println("lowest element in treeset : " + treeSet.first());           
		   
		 System.out.println("highest element in treeste" + treeSet.last()); 
	}
	

}
