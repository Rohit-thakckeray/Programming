import java.util.Scanner;
public class GretestofTwonumber
{
public static void main(String args[])
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter first value :");
int input1 = sc.nextInt();
System.out.println("Enter second value ");
int input2 = sc.nextInt();
if(input1>input2)
System.out.println("both are same value :");
//logic of max value 
if(input1==input2)
System.out.println("this is max value "+input1);
else
System.out.println("this is max value "+input2);
}
}