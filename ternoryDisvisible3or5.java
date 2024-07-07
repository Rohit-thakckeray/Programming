// create the program and take a one out put from the user and check is is it divisible 
// by 3 or 5 if they then return 
import java.util.Scanner;
public class ternoryDisvisible3or5
{
public static void main(String args [])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Value :");
int InputValue = sc.nextInt();
String result = (InputValue % 3 ==0 || InputValue % 5 == 0) ? "Divisible by 3 or 5 :" : "not divisible";
System.out.println(result);
}
}