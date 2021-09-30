package Assignment3;

public class Stringtochararray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Revathi";
		char[]ch=new char[str.length()];
		for(int i=0;i<str.length();i++) {
			ch[i]=str.charAt(i);
			
		}
		for(char c:ch) {
			System.out.println(c);
		}
		
		char s[]= {'R','e','v','a','t','h','i'};
		String str1=String.valueOf(s);
		System.out.println(s);
		
		
		
	}

}
