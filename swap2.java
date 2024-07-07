import java.util.Scanner;
public class swap2
{
public static void main(String args[])
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter first value ");
int input1 = sc.nextInt();
System.out.println("enter second value ");
int input2 = sc.nextInt();
System.out.println("Before Swapping value ");
System.out.println(input1+" "+input2);
int temp;
temp = input1;
input1 = input2;
input2 = temp;
System.out.println("After swpping value ");
System.out.println(input1 + "  "+input2);
}
}