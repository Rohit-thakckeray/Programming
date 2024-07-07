//to check given number is divisble by 5 or not //
import java.util.Scanner;
public class divisbleby5
{
public static void main(String[]args)
{
Scanner sc  = new Scanner(System.in);
System.out.println("Enter a number :");
int inputnumber = sc.nextInt();
if(inputnumber%5==0)
System.out.println("number is divisble by 5 :"+inputnumber);
else
System.out.println("number is not divisble by 5 :"+inputnumber);
}
}