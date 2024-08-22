package java13;

class Asser
{
public static void main(String[] args)
{
System.out.println(withdraw(1000,500));
System.out.println(withdraw(1000,1200));
}
static double withdraw(double amt, double bal)
{
assert amt>bal;
return amt-bal;
}
}
