import java.util.Scanner;

public class shorthandoperator
{
public static void main(String args[])
{
Scanner sc = new Scanner (System.in);
System.out.println("enter first value ");
int input1 = sc.nextInt();
input1*=5;//this is nothing but input1 = input2 * 5;
input1=5;//this is nothing but input1 =  input3 /3 ;
input1+=5; //this is nothing but input = input + 5;
input1-=5;//this is nothing but input1 = input1 - 5;
System.out.println(input1);
}
}