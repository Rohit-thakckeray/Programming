// total number check and count the digit number 
import java.util.Scanner;
public class TotalNumber
{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Your Input :");
int input = sc.nextInt();
int count = 0;
while(input !=0)
{
input = input / 10;
count ++;
}
System.out.println("your Input digit number is a :" + count);
}
}