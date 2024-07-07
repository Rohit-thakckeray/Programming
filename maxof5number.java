import java.util.Scanner;
public class maxof5number
{
public static void main(String args[])
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter the first value ");
int inputvalue1 = sc.nextInt();
System.out.println("Enter second value ");
int inputvalue2 = sc.nextInt();
System.out.println("Enter third value ");
int inputvalue3 = sc.nextInt();
System.out.println("Enter fourth value ");
int inputvalue4 = sc.nextInt();
System.out.println("Enter fifth value ");
int inputvalue5 = sc.nextInt();
//logic of maximum value 
if(inputvalue1>inputvalue2 && inputvalue1>inputvalue3 && inputvalue1>inputvalue4 && inputvalue1>inputvalue5)
{
System.out.println("this is maximum value "+inputvalue1);
}
else if(inputvalue2>inputvalue1 && inputvalue2>inputvalue3 && inputvalue2>inputvalue4 && inputvalue2 > inputvalue5)
{
System.out.println("this is maximum value "+inputvalue2);
}
else if(inputvalue3>inputvalue1 && inputvalue3>inputvalue2 && inputvalue3>inputvalue4 && inputvalue3>inputvalue5)
{
System.out.println("this is maximum value "+inputvalue3);
}
else if(inputvalue4>inputvalue1 && inputvalue4>inputvalue2 && inputvalue4>inputvalue3 && inputvalue4>inputvalue5)
{
System.out.println("this is maximum value "+inputvalue4);
}
else
{
System.out.println("this is maximum value "+inputvalue5);
}
}
}