//atlest one should be true //
import java.util.Scanner;
public class BitwiseOR
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter first a value :");
int value1 = sc.nextInt();
System.out.println("Enter second value :");
int value2 = sc.nextInt();
int result = value1 | value2;
System.out.println("The result of Bitwise OR is a :"+result);
}
}