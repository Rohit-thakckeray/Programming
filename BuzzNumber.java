//to check whether number is a buzz number or not
// either number should be disisible by 7 
// ya end with number 7 then number is a buzz number
import java.util.Scanner;
public class BuzzNumber
{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter number ");
int input = sc.nextInt();
if(input%7==0 || input%10==7)
{
System.out.println("number is Buzz number :" + input);
}
else
{
System.out.println("Not a BUzz number " + input);
}
}
}