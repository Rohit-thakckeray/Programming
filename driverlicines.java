import java.util.Scanner;
public class driverlicines {
public static void main(String args[])
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter your age :  ");
double age = sc.nextDouble();
if(age>=18)
{
System.out.println("you are eligible for licine :");
}
else
{
System.out.println("you are not eligible for licine :");
}
}
    
}
