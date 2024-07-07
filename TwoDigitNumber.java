//to check given number is five digit or not //
import java.util.Scanner;
public class TwoDigitNumber
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter an any integer ");
int inputvalue = sc.nextInt();
if(inputvalue>=10 && inputvalue<=99)
{
System.out.println("THis is two digit number ");
}
else
{
System.out.println("this is not two digit number :");
}
}
}
