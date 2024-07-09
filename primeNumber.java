//write a java program to check whether number is prime or compositie number 
import java.util.Scanner;
public class primeNumber
{
public static void main(String [] args )
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter any User Input :");
int input = sc.nextInt();
int count=0;
//for loop for traversing 
for( int i = 2 ; i <input; i ++)
{
if (input % i ==0)
count ++;
}
if(count==0)
{
System.out.println("No is Prime number :");
}
else 
{
System.out.println("Compositie number :");
}
}
}
