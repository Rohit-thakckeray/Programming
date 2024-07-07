import java.util.Scanner;
public class sumof2Num
{
public static int calculateSum(int x, int y)
{
return x + y;
}
public static void main(String args [])
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter first value :");
int input1 = sc.nextInt();
System.out.println("Enter second value :");
int input2 = sc.nextInt();
System.out.print("the sum of 2 number is " +calculateSum(input1, input2));
}
}