import java.util.Scanner;
public class BitwiseXOR
{
public static void main(String args [])
{
Scanner sc = new Scanner(System.in);
System.out.println("Welcome to bitwise x or :");
System.out.println("Enter first value :");
int value1 = sc.nextInt();
System.out.println("Enter second value :");
int value2 = sc.nextInt();
int result = value1 ^ value2;
System.out.println("the result of bitwise xor is "+result);
}
}