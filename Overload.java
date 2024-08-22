package java13;

class Aa
{
void shape(int i)
{
System.out.println("Triangle");
}
void shape(float b)
{
System.out.println("Rectangle");
}
void shape(long j)
{
System.out.println("Circle");
}
}
class Overload
{
public static void main(String[] args)
{
Aa t=new Aa();
t.shape(10);
t.shape(12.43f);
t.shape(100l);
}
}
