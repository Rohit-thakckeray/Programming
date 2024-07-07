//take integer input and check is that three digit number or not //
import java.util.Scanner;
public class threeDigitornot
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter an any integer ");
int inputnumber = sc.nextInt();
if(inputnumber>99 && inputnumber <=999)
{
System.out.println("this is 3 digit number  "+inputnumber);
}
else
{
System.out.println("this is not three digit number only ");
}
}
}
