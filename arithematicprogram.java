//take to two positive integer from user and print all arithematic opearation//
import java.util.Scanner;
public class arithematicprogram
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter first integer ");
int input1 = sc.nextInt();
System.out.println("Enter second integer ");
int input2 = sc.nextInt();
System.out.println(input1+input2);
System.out.println(input1-input2);
System.out.println(input1*input2);
System.out.println(input1/input2);
System.out.println(input1%input2);
}
}