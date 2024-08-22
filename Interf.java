package java13;

interface I1
{
int A=23;
}
interface I2
{
int A=77;
}
class Interf implements I1,I2
{
public static void main(String args[])
{
System.out.println("Value of A="+I1.A);
}
}