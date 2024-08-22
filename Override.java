package java13;

class Parent
{
void show()
{
System.out.println("parent class method");
}
}
class Child extends Parent
{
void show()
{
super.show(); //.super is used to invoke the super class method or
//constructor.
System.out.println("child class method");
}
}
class Override

{
public static void main(String args[])
{
Child c=new Child();
c.show();
}
}