import java.util.Scanner;
public class maxof3
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter first value :");
double value1 = sc.nextDouble();
System.out.println("Enter second value :");
double value2 = sc.nextDouble();
System.out.println("Enter third value :");
double value3 = sc.nextDouble();
if(value1>value2 && value1>value3)
{
System.out.println("this is max value :"+value1);
}
else if(value2>value1 && value1>value3)
{
System.out.println("this is max value :"+value2);
}
else if(value3>value1 && value3>value2)
{
System.out.println("this is max value "+value3);
}
else
{
System.out.println("this all are Eqaul :");
}   
}
}
