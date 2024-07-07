import java.util.Scanner;
public class divisibleby5not3
{
public static void main(String args[])
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter an any an Integer :");
int input = sc.nextInt();
if(input%5==0 && input%3!=0)
{
System.out.println("yes this divisible by 5 but not to 3 :");
}
else
{
System.out.println("this is not divisible by 5 :");
}
}
}