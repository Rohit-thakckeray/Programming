//logiacal operator operation //
import java.util.Scanner;
public class LogicalOperatorr
{
public static void main(String args [])
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter first value :");
boolean value1 = sc.nextInt();
System.out.println("Enter second value :");
boolean value2 = sc.nextInt();
System.out.println(value1 == value2);
System.out.println(value1 < value2);
System.out.println(value1 <= value2);
System.out.println(value1 > value2);
System.out.println(value1 >= value2);
System.out.println(value1 != value2);
}
}