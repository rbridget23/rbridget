package java13;

import java.util.Scanner;

public class Rev {

	public static void main(String[] args) {
		System.out.println("Enter the number: ");

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int d,rev=0;
		while(n!=0)
		{
		d=n%10;
		rev=rev*10+d;
		n=n/10;
		}

		System.out.println(rev);
		}
	}


