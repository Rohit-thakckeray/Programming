import java.util.Scanner;
public class sideofTriangle
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter first side of triangle :");
int a = sc.nextInt();
System.out.println("Enter second side of triagle ");
int b = sc.nextInt();
System.out.println("Enter third side of triangle ");
int c = sc.nextInt();
//Logic of side triangle of not 
if(a+b>c && b+c>a && a+c>b)
{
System.out.println("valid triangle ");
}
else
{
System.out.println("Invalid triangle ");
}
}
}