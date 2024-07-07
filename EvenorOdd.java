import java.util.Scanner;
public class EvenorOdd
{
public static void main(String args[])
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter number ");
double input = sc.nextDouble();
if(input%2==0)
{
System.out.println("Even number "+input);
}
else
{
System.out.println("Odd number :"+input);
}
}
}
