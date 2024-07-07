import java.util.Scanner;
public class max_of_three
{
public static void main(String[]args)
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter first value :");
int value1 = sc.nextInt();
System.out.println("Enter second value ");
int value2 = sc.nextInt();
System.out.println("Enter third value ");
int value3 = sc.nextInt();
if(value1>value2)
{
if(value1>value3)
{
System.out.println("this is max value "+value1);
}
}
else if(value2>value1)
{
if(value2>value3)
{
System.out.println("this is max value "+value2);
}
}
else
{
System.out.println("this is max value "+value3);
}
}
}