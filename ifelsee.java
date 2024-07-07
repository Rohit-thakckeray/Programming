import java.util.Scanner;
public class ifelsee
{
public static void main(String args[])
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter your age ");
int inputage = sc.nextInt();
if(inputage>18)
System.out.println("adult age ");
else
System.out.println("not adult ");

}
}