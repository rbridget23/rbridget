package java13;
class GF
{
int bicycle=6000;
}
class F extends GF
{
void accessBicycle()
{
System.out.println("Value of bicycle :"+bicycle);
}
}
class Inher
{
public static void main(String args[])
{

F obj=new F();
obj.accessBicycle();

}
}

