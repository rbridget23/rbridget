package java13;

interface I
{
void show();
}
class C implements I
{
public void show()
{
System.out.println("Overriding the method of an interface");
}
}
class Interf1
{
public static void main(String[] args)
{
C t=new C();
t.show();
}
}