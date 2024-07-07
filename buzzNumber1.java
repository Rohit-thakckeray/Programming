/*import java.util.Scanner;
public class buzzNumber1
{
public static void main(String [] args )
{
Scanner sc = new Scanner(System.in);
System.out.println("Main Method Begins ..");
System.out.println();
System.out.println();
System.out.println("Welcome to Buzz Calculator ..");
System.out.println();
System.out.println();   
for( int print = 1; print<=100; print ++)
{
if( print % 7 == 0 || print % 10 == 7)
{
System.out.println(" ( Buzz Number  is a --> ) = "+print);
}
}
System.out.println();
System.out.println();
System.out.println("Main Method ends ..");
}
}

*/

// write a java program to check whether number is automorphic number or not 
//ex 5 
//5*5=25(square of number)
//(if square number is ending with same number then it is automorphic number)
/* 
import java.util.Scanner;
public class buzzNumber1
{
public static void main(String [] args )
{
Scanner sc = new Scanner(System.in);
System.out.println();
System.out.println("Main Method Begins ..");
System.out.println("Welcome to automorphic number Calculator ..");
System.out.println();
System.out.println("Enter A User Input ..");
int input = sc.nextInt();
System.out.println("Enter One Digit for Sqaure no for that ..");
int inputSquare = sc.nextInt();
int result = input * inputSquare;
System.out.println("square root number = " + result);
int rem = result % 10;
if(rem == inputSquare)
{
System.out.println(" Automorphic Number..");
}
else
{
System.out.println(" NOT Automorphic Number ..");
System.out.println();
}
System.out.println();
System.out.println("Main Method Ends...");
}
}
*/
// write a java program to print m power n(take m and n power from the user )
// ex m =4
// n = 5
// 4power5
// 4*4*4*4*4=1024

import java.util.Scanner;
public class buzzNumber1
{
public static void main(String [] args )
{
Scanner sc = new Scanner (System.in);
System.out.println();
System.out.println("Main Method Begins ..");
System.out.println();
System.out.println("Welcome To power Calculate Caltulator ..");
System.out.println();
System.out.println("Which Number want to calculate the power ..");
int m = sc.nextInt();
System.out.println();
System.out.println("How many want to calculate the power n..");
int n = sc.nextInt();
// Math.pow(m, n)
System.out.println("power of Given number is a :" + Math.pow(m, n));
System.out.println();
System.out.println("Main Method Ends ...");
System.out.println();
}
}