//to take an input from the user and check is it even or odd using bitwise operator //
import java.util.Scanner;
public class EvenoddBitwise
{
public static void main(String args[])
{
Scanner sc = new Scanner (System.in);
System.out.println("enter first number ");
int input = sc.nextInt();
if((input & 1 ) ==0)
{
System.out.println("Even");
}else{
    System.out.println("Odd");
}
}
}
