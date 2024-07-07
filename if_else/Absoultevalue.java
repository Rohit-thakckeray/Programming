package if_else;
import java.util.Scanner;
public class Absoultevalue
{
public static void main(String args [])
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter your Input Value :");
int InputValue = sc.nextInt();
if(InputValue < 0)
{
InputValue = InputValue * (-1);
System.out.println(InputValue);
}
System.out.println("the absoulte value is :" + InputValue);
}
}