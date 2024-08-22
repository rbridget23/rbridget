package java13;
import java.util.Scanner;
public class Multab {

	public static void main(String[] args) {
		System.out.println("Enter the number to print multiplication table");

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=10;i++)
		{
		System.out.println(n+"*"+i+"="+(n*i));

	}

}}
