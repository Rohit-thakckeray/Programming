//take two posoitive floating point value and calculate the product of them //
import java.util.Scanner;
public class productCalculate
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter first value in flaot ");
double value1 = sc.nextDouble();
System.out.println("Enter second value in floating pount ");
double value2 = sc.nextDouble();
System.out.println("the product is "+value1*value2);
}
}