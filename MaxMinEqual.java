import java.util.Scanner;
public class MaxMinEqual
{
public static void main(String args[])
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter First Positive number ");
int inputvalue1 = sc.nextInt();
System.out.println("Enter second positive number ");
int inputvalue2 = sc.nextInt();
if(inputvalue1<0 && inputvalue2<0)
{
System.out.println("Enter positive number ");
}

if(inputvalue1>inputvalue2)
{
System.out.println("first value is bigger "+inputvalue1);
}

if (inputvalue2<=inputvalue1) {   
}
{
System.out.println("second value is leasser"+inputvalue2);
}
if(inputvalue1==inputvalue2)
System.out.println("first and second value are Equal");
}
}