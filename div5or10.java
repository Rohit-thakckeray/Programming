// wap to find check whethere number is divisible by 5 or 10 or not 
import java.util.Scanner;
public class div5or10
{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Your User Input :");
int input = sc.nextInt();
if(input % 5 == 0 && input%10 == 0 && input%15 == 0 )
System.out.println("Divisible by 5 and 10 or 15 :");
else 
System.out.println("Not divisible :");
}
}