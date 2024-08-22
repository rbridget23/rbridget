package java13;

public class Str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hydera";
		String s2="bad";
		String s3=s1.concat(s2); //concat(): It combines the two strings
		System.out.println(s3);
		String s4=s3.toUpperCase(); //It converts the String into
		//UpperCase letters
		System.out.println(s4);
		String s5=s4.toLowerCase();
		System.out.println(s5);
		String s6=s5.replace('a','Z');
		System.out.println(s6);
	}

}
