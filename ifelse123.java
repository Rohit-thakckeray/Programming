// even or odd number check by ternory operator //
import java.util.Scanner;
public class ifelse123
{
public static void main(String args [])
{
Scanner sc = new Scanner (System.in);
System.out.println("Welcome even or Odd calculator :");
System.out.println();
System.out.println("Enter your input number :");
int inputvaluestor = sc.nextInt();
String result = inputvaluestor % 2 == 0 ? "even number " : "odd number";
System.out.println("number is :" + result);
}
}