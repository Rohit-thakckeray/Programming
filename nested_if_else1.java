//take positive intger input and tell if it is divisible by 5 or 3 but not divisible by 15//
import java.util.Scanner;
public class nested_if_else1
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter an any Integer ");
int inputvalue = sc.nextInt();
//logic 
if(inputvalue%5==0 || inputvalue%3==0)
{
if(inputvalue%15 !=0)
{
System.out.println("number divisible by 5 or 3 but not by 15"+inputvalue);
}
else
{
System.out.println("not match to conditon ");
}

}

}
}

