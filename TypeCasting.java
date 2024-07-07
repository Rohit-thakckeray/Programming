//there are two types of type casting //
// 1...) Implicit type casting 
// 2...2)Explicit type casting 

// 1->Implicit type casting done by complier and it can automatically by compiler 
// 2->Explicit type casting done by programmer it can can by automatically by compiler it done by 
// programmer

//example of implicit type casting //
// public class TypeCasting 
// {
// public static void main(String args [])
// {
// int a=10;
// double b;
// b = a; //implicit type casting becuse didint data lose 
// System.out.println("the value of int a is :"+a);
// System.out.println("the value of double b is :"+b);
// }
// }


//example of Explicit type casting //
public class TypeCasting 
{
public static void main(String args [])
{
int a;
double b = 1.134;
a = (int)b;//explicit type casting due to some Data lose 
System.out.println("int a is :"+a);
System.out.println("double b is :"+b);
}
}