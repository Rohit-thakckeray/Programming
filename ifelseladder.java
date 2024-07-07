import java.util.Scanner;
public class ifelseladder
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter your age ");
double age = sc.nextDouble();
if(age<18)
{
System.out.println("you are child ");
}
else if(age>=18 &&  age<=25)
{
System.out.println("you are teenger ");
}
else if(age>=25)
{
System.out.println("you are adult :");
}
else
{
System.out.println("not found who are you :");
}
}
}