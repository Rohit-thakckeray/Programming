import java.util.Scanner;
public class inputEvenOdd
{
public static void main(String args[])
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter positive number ");
int inputvalue = sc.nextInt();
if(inputvalue<0)
{
System.out.println("Plese enter valid positive number ");
}
else
{
if(inputvalue%2==0)
{
System.out.println("Even number ");
}
else
{
System.out.println("Odd number ");
}
}
}
}