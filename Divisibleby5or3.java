import java.util.Scanner;
public class Divisibleby5or3
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter any an integer :");
int inputgetvalue = sc.nextInt();
if(inputgetvalue%5==0 && inputgetvalue%3==0)
{
System.out.println("This is value is divible by 5 or 3 :");
}
else
{
System.out.println("this is not divisible by 5 or 3 :");
}
}

}