import java.util.Scanner;
public class printEvem1To100
{
public static void main(String args [])
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter your number :");
int inputEven = sc.nextInt();
for(int i = 1; i<=inputEven; i ++)
{
if(i % 2 ==0 )
System.out.println("Even :" + i);
else
System.out.println("odd Number ");
}
}
}