package if_else;
import java.util.Scanner;
public class ifelseEven {
public static void main(String args [])
{
Scanner sc = new Scanner (System.in); 
System.out.println("Enter your Input :");
int Input = sc.nextInt();
if(Input%2==0)
System.out.println("Even Number :");
else
System.out.println("Odd Number :");
}
    
}
