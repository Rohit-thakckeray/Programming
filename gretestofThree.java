// take three positive integer and print the gretest of them //
import java.util.Scanner;
public class gretestofThree
{
public static void main(String args[])
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter first value :");
int inputvalue1 = sc.nextInt();
System.out.println("Enter second value :");
int inputvalue2 = sc.nextInt();
System.out.println("Enter third valeu :");
int inputvalue3 = sc.nextInt();
if(inputvalue1>inputvalue2 && inputvalue1>inputvalue3)
{
System.out.println("This is Maximum value :"+inputvalue1);
}
else if(inputvalue2>inputvalue1 && inputvalue2>inputvalue3)
{
System.out.println("this is maximum value :"+inputvalue2);
}
else //if(inputvalue3>inputvalue1 && inputvalue3>inputvalue2)
{
System.out.println("this is maximum value :"+inputvalue3);
}
}
}

