//both condition should be true when condition will true and otherwise will false//
import java.util.Scanner;
public class bitwiseAnd
{
public static void main(String args [])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter first value :");
int input1 = sc.nextInt();
System.out.println("Enter second value :");
int input2 = sc.nextInt();
int result = input1 & input2;
System.out.println("the bitwise and result is a:  "+result);
}
}