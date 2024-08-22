package java13;
import java.util.Scanner;

public class Clock {

	public static void main(String[] args) {
		System.out.println("enter the hours,minutes and seconds");
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int m=sc.nextInt();
		int s=sc.nextInt();
		System.out.println("CLOCK");
		System.out.println("=========");
		System.out.println("hh:mm:ss");
		for(h=h;h<24;h++) //hours
		{
		for(m=m;m<60;m++) //minutes
		{
		for(s=s;s<60;s++) //seconds
		{
		Thread.sleep(1000);
		System.out.printf("%2d:%2d:%2d\r",h,m,s);
		}s=0;
		}m=0;
		}h=0;

		}

	}

