import java.util.Scanner;
public class swappingof2number
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter first value :");
int number1 = sc.nextInt();
System.out.println("Enter second value :");
int number2 = sc.nextInt();
System.out.println("before swapping value is :");
System.out.print(number1);
System.out.print("   &&   "+number2);
int temp;
temp = number1;
number1 = number2;
number2 = temp;
System.out.print("After swapping value is :");
System.out.print(number1);
System.out.print("   & &   "+number2);
}
}
