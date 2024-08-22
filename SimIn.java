package java13;
import java.util.Scanner;
public class SimIn {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Principal amount: ");
		int p=sc.nextInt();
		System.out.println("Enter the interest rate: ");
		int r=sc.nextInt();
		System.out.println("Enter the duration: ");
		int t=sc.nextInt();
		int SI=(p*r*t)/100;
		System.out.println("The Simple Interest is: "+SI);
	}
}