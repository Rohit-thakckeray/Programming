//it take only one value and does operation on that //
import java.util.Scanner;
public class BitwiseCompliment
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Welcome to birwise compliment operator");
System.out.println("Enter once value :");
int input = sc.nextInt();
int result = ~input;
System.out.println("the result of bitwise compliment is :"+result);
}
}
