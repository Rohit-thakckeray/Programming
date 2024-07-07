import java.util.Scanner;
public class Nested_if_else
{
public static void main(String args[])
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter integer number ");
int input = sc.nextInt();
if(input%5==0)
{
if(input%10==0)
{
System.out.println("Number is divisible by 5 && 10 ");
}
else
{
System.out.println("not divisible ");
}
}
}
}