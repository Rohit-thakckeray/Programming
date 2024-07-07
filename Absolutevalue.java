import java.util.Scanner;
public class Absolutevalue
{
public static void main(String args[])
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter an intege ");
int inputnumber = sc.nextInt();
if(inputnumber<0)
{
inputnumber = inputnumber * (-1);
System.out.println("the number is absoulte"+inputnumber);
}
else
{
System.out.println("absoulute number is "+inputnumber);
}
}
}
