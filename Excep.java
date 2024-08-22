package java13;

class Excep
{
public static void main(String[] args)
{
	try
	{
	int a=10,b=a/0;
	System.out.println(b);
	}
	catch (Exception e)
	{
	// System.out.println(e);
	e.printStackTrace();
	}
	}
}