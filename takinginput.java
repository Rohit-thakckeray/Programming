// taking input and print the sum of two double number 

import java.util.Scanner;
public class takinginput
{
public static void main(String []args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter first value :");
int x = sc.nextInt();
System.out.println("Enter second value :");
int y = sc.nextInt();
int sum = x + y;
System.out.println("The sum of two number is : ");
System.out.println(sum);
}
}
