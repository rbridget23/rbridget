package java13;

abstract class AbsDemo
{
abstract void show(); //abstract method or incomplete method.

void disp( ) //concrete method or complete method
{
//body or block
System.out.println("complete method");
}

}
class B extends AbsDemo
{
void show()
{
System.out.println("abstract method");
}
}
class Abs
{
public static void main(String args[])
{
B obj=new B();
obj.show();
obj.disp();
}
}
