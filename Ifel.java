package java13;

import java.util.Scanner;

public class Ifel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your age:");
		int age=sc.nextInt();
		if(age>=18)
		{
		System.out.println("Eligible to vote");
		}
		else
		{
		System.out.println("Not eligi1ble to vote");
		}
	}

}
