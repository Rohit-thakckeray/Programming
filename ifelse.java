import java.util.Scanner;
public class ifelse
{
public static void main(String args [])
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter your percentage :");
int InputPercentage = sc.nextInt();
if(InputPercentage > 90)
System.out.println("excellent percentage :" + InputPercentage);
else if(InputPercentage > 80)
System.out.println("Good percentage :" + InputPercentage);
else if(InputPercentage > 70)
System.out.println("fair percentage :" + InputPercentage);
else if(InputPercentage > 60)
System.out.println("Meet exceptions :" + InputPercentage);
else
System.out.println("par");
}
}