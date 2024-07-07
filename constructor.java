import java.util.Scanner;
public class constructor
{
constructor()
{
System.out.println("No argument constructor fire 1 ...");
}

//constructor 2 
constructor(int a, int b)
{
System.out.println("Constructor 2 (addtion is a ...)-->"+ (a+b));
}

//constructor 3 
constructor(int a , int b , int c)
{
System.out.println("Constructor 3 is a :---->" + (a+b+c));
}

//constructor 4 
constructor(int a, int b , int c , int d)
{
System.out.println("Constructor 4 (multiplication is a :--->"+( a*b*c*d));
}

//constructor 5
constructor(int a , int b , int c , int d , int e)
{
System.out.println("constructor 5 (division is  a :--->" +( a /b/c/d/e));
}


public static void main(String [] args )
{
Scanner sc = new Scanner (System.in);
System.out.println("Main method Begins :");
//object create 1 
constructor ref1 = new constructor();
//object create 2 
constructor ref2 = new constructor(10,10);
//object create 3
constructor ref3 = new constructor(10,20,30);
//object create 4 
constructor ref4 = new constructor(10,20,30,40);
//object create 5
constructor ref5 = new constructor(10,20,30,40,50);
System.out.println("Main method Ends :");

}
}