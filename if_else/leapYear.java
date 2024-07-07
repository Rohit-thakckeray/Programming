package if_else;
import java.util.Scanner;
public class leapYear
{
public static void main(String args [])
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter A leap yaer :");
int YearInput = sc.nextInt();
if(YearInput % 4 ==0 )
System.out.println("leap year :");
else
System.out.println("not leap year :");
} 
}
